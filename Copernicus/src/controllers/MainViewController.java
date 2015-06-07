/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import copernicus.profiles.Case;
import copernicus.profiles.Category;
import copernicus.profiles.ClassifiedCase;
import copernicus.profiles.DataTable;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author kosa1010
 */
public class MainViewController implements Initializable {

    private String fileName;
    private String path;

    File selectFile;
    DataTable dt = new DataTable(null);

    @FXML
    private TextField tfPath;

    @FXML
    private MenuItem miClose;

    @FXML
    private TableView<Case> tvData;

    @FXML
    private TableColumn<Case, String> tcHp;

    @FXML
    private TableColumn<Case, String> tcPs;

    @FXML
    private TableColumn<Case, String> tcPt;

    @FXML
    private TableColumn<Case, String> tcSc;

    @FXML
    private TableColumn<Case, String> tcIt;

    @FXML
    private TableColumn<Case, String> tcD;

    @FXML
    private TableColumn<Case, String> tcMa;

    @FXML
    private TableColumn<Case, String> tcF;

    @FXML
    private TableColumn<Case, String> tcHy;

    @FXML
    private TableColumn<Case, String> tcPa;

    @FXML
    private TableColumn<Case, String> tcMk;

    @FXML
    private TableColumn<Case, String> tcL;

    @FXML
    private TableColumn<Case, String> tcK;

    @FXML
    private TableColumn<Case, Category> tcDecisions;

    @FXML
    private Button btnBrowse;

    @FXML
    void handleBtnBrowse(ActionEvent event) throws FileNotFoundException {
        swingFileChooser("Wczytaj plik z danymi", "Pliki z danymi (*.dat)", "dat");
        insertCasesToTable();
        showData();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String FileName) {
        this.fileName = FileName;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void swingFileChooser(String title, String fFilter, String extension1) throws FileNotFoundException {
        final JFileChooser jfChooser = new JFileChooser();
        FileFilter fileFilter = new FileNameExtensionFilter(fFilter, extension1);
        jfChooser.setDialogTitle(title);
        jfChooser.setFileFilter(fileFilter);
        jfChooser.setVisible(true);
        int result = jfChooser.showSaveDialog(jfChooser);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectFile = jfChooser.getSelectedFile();
            dt.read(selectFile, ',', 1);
            setFileName(selectFile.getName());
            setPath(selectFile.getAbsolutePath());
            tfPath.setText(getPath());

            int dot = 0;
            String extension;
            for (int i = 0; i < path.length(); i++) {
                if (path.charAt(i) == '.') {
                    dot = i;
                }
            }
            extension = path.substring(dot + 1);
            if ("dat".equals(extension)) {
                System.out.println("Plik dat");

                String a = dt.getCaseCategory(0);
                System.out.println("dfhbsnv" + a);
                String atrybut = dt.getAttribute(0);
                System.out.println("atrybut " + atrybut);
//                ArrayList<String> aa = dt.getAttributeNames();
//                for (int i = 0; i < aa.size(); i++) {
//                    Case c = new Case(i, 1, null);
//                    System.out.print(aa.get(i) + "\t");
//                    System.out.println(c);
//                }
                int atrybuty = dt.getAttributeNumber();
                System.out.println("liczba atrybutwów " + atrybuty);
                ArrayList<Category> categ = dt.getCategories();
                System.out.println("Kategorie do klasyfikacji\n");
                for (int i = 0; i < categ.size(); i++) {
                    System.out.println(categ.get(i) + "\t");
                }
                System.out.println();
                int numObjects = dt.getNumberOfSelectObjects();
                System.out.println("liczba objektów " + numObjects);
                System.out.println(dt.getObjectNumber());
                for (int k = 0; k < numObjects; k++) {
                    ClassifiedCase obj = dt.getObject(k);
                    ArrayList<Double> cos = obj.getFeatures();
                    System.out.print(k + "|\t");
                    for (int i = 0; i < cos.size(); i++) {
                        System.out.print(cos.get(i) + "\t");
                    }
                    System.out.println(obj.getCategory());
                }

            }
          
        }
        if (result == JFileChooser.CANCEL_OPTION) {
            tfPath.setText("");
            jfChooser.setVisible(false);
        }  
    }

    private void insertCasesToTable() {
        DataTable dTable = new DataTable(null);
        List<Case> objList = new ArrayList<>();
        System.out.println(dTable.getNumberOfSelectObjects());
        for (int i = 0; i < dTable.getObjectNumber(); i++) {
            Case c = new Case(i, 1, null);
            objList.add(c);
        }
        ObservableList<Case> allObjectsList = FXCollections.observableArrayList(objList);
        tvData.setItems(allObjectsList);
    }

    private void showData() {
        ArrayList<String> aa = dt.getAttributeNames();
        for (int i = 0; i < aa.size(); i++) {
            Case c = new Case(i, 1, null);
            System.out.print(aa.get(i) + "\t");
            System.out.println(c);
        }
    }
}

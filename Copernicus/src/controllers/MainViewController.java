/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import copernicus.MyAlerts;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author kosa1010
 */
public class MainViewController implements Initializable {

    private String FileName;

    @FXML
    private TextField tfPath;

    @FXML
    private Button btnBrowse;

    @FXML
    void handleBtnBrowse(ActionEvent event) {
        swingFileChooser("Wczytaj plik z danymi", "Pliki z danymi (*.dat)", "dat");
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void swingFileChooser(String title, String fFilter, String extension1) {
        final JFileChooser jfChooser = new JFileChooser();
        FileFilter fileFilter = new FileNameExtensionFilter(fFilter, extension1);
        jfChooser.setDialogTitle(title);
        jfChooser.setFileFilter(fileFilter);
        jfChooser.setVisible(true);
        int result = jfChooser.showSaveDialog(jfChooser);
        String path;
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectFile = jfChooser.getSelectedFile();
            setFileName(selectFile.getName());
            path = selectFile.getAbsolutePath();
            tfPath.setText(path);

            int dot = 0;
            String extension;
            for (int i = 0; i < path.length(); i++) {
                if (path.charAt(i) == '.') {
                    dot = i;
                }
            }
            extension = path.substring(dot + 1);
            if ("dat".equals(extension)) {
                MyAlerts.showAlert("Załadowano plik", "plik udało się załadować",
                        Alert.AlertType.INFORMATION, "Ładowanie przebiegło pomyślnie");
                //loadARFFfile(path);
                ///insertInstancesToTable(getData());
            }
        }
        if (result == JFileChooser.CANCEL_OPTION) {
            tfPath.setText("");
            jfChooser.setVisible(false);
        }
    }

}

package copernicus;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

public class MyAlerts {

    public static void showAlert(String title, String message, Alert.AlertType type, String... header) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        if (header.length != 0) {
            alert.setHeaderText(header[0]);
        }
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void showDialog(String title, String headerText, String defText, String contentText) {
        TextInputDialog dialog = new TextInputDialog(defText);
        dialog.setHeaderText(headerText);
        dialog.setContentText(contentText);
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println(" " + result.get());
        }
    }
}

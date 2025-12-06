package cse213.group7.papermillfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginTryControlle {

    @FXML
    private TextField passwordBox;
    @FXML
    private TextField usernameBox;
    @FXML
    private Label massageLabel;

    @FXML
    public void onLogin(ActionEvent actionEvent) throws IOException {
        String username = usernameBox.getText();
        String password = passwordBox.getText();

        if ("1111".equals(username) && "meher".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("2222".equals(username) && "meher".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Rochi_2320366/ContentManagerDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("3333".equals(username) && "mandira".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mandira_2321486/DataEntryDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("4444".equals(username) && "mandira".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mandira_2321486/ReporterDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("5555".equals(username) && "laboni".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cse213/group7/papermillfinal/laboni/User7dashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("6666".equals(username) && "laboni".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cse213/group7/papermillfinal/laboni/User8dashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}
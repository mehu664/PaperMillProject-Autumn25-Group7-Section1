package cse213.group7.papermillfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private Label loginLable;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @FXML
    private void handleLoginButton() {
        String username = userIdTextField.getText();
        String password = passwordTextField.getText();

        // Simple validation
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Please fill in all fields.");
            return;
        }

        // Dummy login validation (replace with UserManager or DB later)
        if (username.equals("admin") && password.equals("1234")) {
            showAlert("Success", "Login Successful!");
        } else {
            showAlert("Failed", "Invalid credentials!");
        }
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }


}
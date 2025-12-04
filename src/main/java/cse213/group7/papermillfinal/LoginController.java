package cse213.group7.papermillfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private Label loginLable;
    @javafx.fxml.FXML
    private ComboBox<String> userNameComboBox;

    @javafx.fxml.FXML

    public void initialize() {

        userNameComboBox.getItems().addAll("Logistic Manager","Quality Control Manager","Finance Analyst","Environmental Coompliance  ","HR Managementn ","Customer Relation Officer ");


    }

    @javafx.fxml.FXML
    public void handleLoginButton(ActionEvent actionEvent) {

        String userId = userIdTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        if (!userId.matches("\\d{4}")){
            loginLable.setText("User ID should be 4 digit");
            loginLable.setVisible(true);
            return;
        }


 //PasswordValidationCode
        if (password.isEmpty()){
            loginLable.setText("Password Cant Be Empty");
            loginLable.setVisible(true);
            return;
        }

        if (userNameComboBox.getValue() == null) {
            loginLable.setText("Please select user type.");
            return;
        }

        loginLable.setVisible(false);


        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

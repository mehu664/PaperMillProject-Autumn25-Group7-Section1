package cse213.group7.papermillfinal.laboni;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerUpdateController
{
    @javafx.fxml.FXML
    private TextArea statusArea;
    @javafx.fxml.FXML
    private TextField uidField;
    @javafx.fxml.FXML
    private Button updateBtn;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField emailField;
    @javafx.fxml.FXML
    private TextField phoneField;

    @javafx.fxml.FXML

    public void initialize() {
        statusArea.setText("Enter Customer UID and fetch data.");
    }

    @javafx.fxml.FXML
    public void fetchCustomer(ActionEvent actionEvent) {
        String uid = uidField.getText().trim();
        if(uid.isEmpty()) {
            statusArea.setText("Please enter a Customer UID!");
            return;
        }

        switch(uid.toUpperCase()) {
            case "CUST01":
                nameField.setText("Rahim");
                emailField.setText("rahim@mail.com");
                phoneField.setText("01712345678");
                statusArea.setText("Customer found!");
                break;
            case "CUST02":
                nameField.setText("Karim");
                emailField.setText("karim@mail.com");
                phoneField.setText("01787654321");
                statusArea.setText("Customer found!");
                break;
            default:
                nameField.clear();
                emailField.clear();
                phoneField.clear();
                statusArea.setText("Customer not found!");
        }
    }

    @javafx.fxml.FXML
    public void updateCustomer(ActionEvent actionEvent) {
        String uid = uidField.getText().trim();
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String phone = phoneField.getText().trim();

        if(uid.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            statusArea.setText("All fields are required to update!");
            return;
        }


        statusArea.setText("Customer " + uid + " updated successfully!\n" +
                "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
    }

    @javafx.fxml.FXML
    public void resetFields(ActionEvent actionEvent) {
        uidField.clear();
        nameField.clear();
        emailField.clear();
        phoneField.clear();
        statusArea.clear();
    }


    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/laboni/User8DashBoard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
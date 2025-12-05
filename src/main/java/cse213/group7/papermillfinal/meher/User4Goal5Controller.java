package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class User4Goal5Controller
{
    @javafx.fxml.FXML
    private TextField productTextField;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TextArea detailsTextArea;

    private ArrayList<User4Goal5> complaints = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        productTextField.clear();
        customerNameTextField.clear();
        detailsTextArea.clear();
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user4dashboard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
        String customerName = customerNameTextField.getText().trim();
        String productCodeStr = productTextField.getText().trim();

        if (customerName.isEmpty() || productCodeStr.isEmpty()) {
            showWarning("Please enter both customer name and product code.");
            return;
        }

        int productCode;
        try {
            productCode = Integer.parseInt(productCodeStr);
        } catch (NumberFormatException e) {
            showWarning("Product code must be a number.");
            return;
        }

        // Create new complaint and add to list
        User4Goal5 complaint = new User4Goal5(customerName, productCode);
        complaints.add(complaint);

        // Update TextArea to show all complaints
        updateDetailsTextArea();

        // Clear input fields
        customerNameTextField.clear();
        productTextField.clear();
    }

    @javafx.fxml.FXML
    public void handleLogComplaintButton(ActionEvent actionEvent) {
        if (complaints.isEmpty()) {
            showWarning("No complaints have been logged yet.");
        } else {
            updateDetailsTextArea();
        }
    }

    private void updateDetailsTextArea() {
        StringBuilder sb = new StringBuilder();
        for (User4Goal5 c : complaints) {
            sb.append("Customer: ").append(c.getCustomerName())
                    .append(", Product Code: ").append(c.getProductCode())
                    .append("\n");
        }
        detailsTextArea.setText(sb.toString());
    }

    private void showWarning(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
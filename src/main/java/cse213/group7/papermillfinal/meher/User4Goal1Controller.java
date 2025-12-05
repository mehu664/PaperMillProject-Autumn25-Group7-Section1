package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class User4Goal1Controller {
    @javafx.fxml.FXML
    private TableColumn<User4Goal1, String> propertyCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1, String> batchIDCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1, String> productionDateCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1, String> statusCol;
    @javafx.fxml.FXML
    private TableView<User4Goal1> testResultTable;
    @javafx.fxml.FXML
    private TextField batchIDTextField;
    @javafx.fxml.FXML
    private DatePicker productionDatePicker;
    @javafx.fxml.FXML
    private TableView<User4Goal1> batchDetailsTable;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1, String> paperTypeCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1, String> valueCol;
    @javafx.fxml.FXML
    private ComboBox<String> paperTypeComboBox;
    @javafx.fxml.FXML
    private TextField complianceStatusTextField;

    @javafx.fxml.FXML
    public void initialize() {
        paperTypeCol.setCellValueFactory(new PropertyValueFactory<>("paperType"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        propertyCol.setCellValueFactory(new PropertyValueFactory<>("property"));
        batchIDCol.setCellValueFactory(new PropertyValueFactory<>("courseId"));
        valueCol.setCellValueFactory(new PropertyValueFactory<>("value"));
        productionDateCol.setCellValueFactory(new PropertyValueFactory<>("productionDate"));


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
    public void handleRunTestButton(ActionEvent actionEvent) {

        String batchID = batchIDTextField.getText().trim();
        if (batchID.isEmpty()) {
            showAlert("Input Error", "Batch ID is required.");
            return;
        }
        if (!batchID.matches("\\d+")) {
            showAlert("Input Error", "Batch ID must be a number.");
            return;
        }

        if (productionDatePicker.getValue() == null) {
            showAlert("Input Error", "Please select a production date.");
            return;
        }

        String paperType = paperTypeComboBox.getValue();
        if (paperType == null || paperType.trim().isEmpty()) {
            showAlert("Input Error", "Please select a paper type.");
            return;
        }


        String complianceStatus = complianceStatusTextField.getText().trim();
        if (complianceStatus.isEmpty()) {
            showAlert("Input Error", "Compliance status is required.");
            return;
        }

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setTitle("Success");
        success.setHeaderText(null);
        success.setContentText("Test submitted successfully!");
        success.showAndWait();


    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

        batchIDTextField.clear();
        productionDatePicker.setValue(null);
        paperTypeComboBox.getSelectionModel().clearSelection();
        complianceStatusTextField.clear();

    }
}

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
import java.time.LocalDate;
import java.util.ArrayList;

public class User4Goal4Controller
{
    @javafx.fxml.FXML
    private TableColumn<User4Goal4,Integer> batchIDCol;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TextArea reportTextArea;
    @javafx.fxml.FXML
    private TableColumn<User4Goal4,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal4,String> testPropertyCol;
    @javafx.fxml.FXML
    private TextField batchIDTextField;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableView<User4Goal4> testDataTable;
    @javafx.fxml.FXML
    private TableColumn<User4Goal4,Integer> valueCol;

    private ArrayList<User4Goal4> data = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        testPropertyCol.setCellValueFactory(new PropertyValueFactory<>("testProperty"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        batchIDCol.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        valueCol.setCellValueFactory(new PropertyValueFactory<>("value"));
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
    public void generateQAReport(ActionEvent actionEvent) {
        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();

        if (start == null || end == null) {
            showWarning("Please select start and end dates.");
            return;
        }
        if (end.isBefore(start)) {
            showWarning("End date must be after start date.");
            return;
        }

        data.clear();


        data.add(new User4Goal4("Strength", "PASS", 101, 85, start, end));
        data.add(new User4Goal4("Tear Resistance", "FAIL", 102, 60, start, end));
        data.add(new User4Goal4("Thickness", "PASS", 103, 92, start, end));


        testDataTable.getItems().clear();
        testDataTable.getItems().addAll(data);


        generateReport();
    }

    private void generateReport() {
        int passCount = 0;
        int failCount = 0;
        int totalValue = 0;

        for (User4Goal4 item : data) {
            totalValue += item.getValue();
            if (item.getStatus().equalsIgnoreCase("PASS")) {
                passCount++;
            } else if (item.getStatus().equalsIgnoreCase("FAIL")) {
                failCount++;
            }
        }

        double avgValue = data.isEmpty() ? 0 : totalValue / (double) data.size();

        String report = "Quality Assurance Report\n\n" +
                "Total Tests: " + data.size() + "\n" +
                "Passed: " + passCount + "\n" +
                "Failed: " + failCount + "\n" +
                "Average Score: " + String.format("%.2f", avgValue) + "\n";

        reportTextArea.setText(report);
    }

    private void showWarning(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}


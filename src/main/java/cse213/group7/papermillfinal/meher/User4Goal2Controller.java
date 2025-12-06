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

public class User4Goal2Controller
{
    @javafx.fxml.FXML
    private TextArea defectRateMatricsTextArea;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer>  dateCol;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableView<User4Goal2> qualityTable;
    @javafx.fxml.FXML
    private TextField alertTextField;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer> batchIdCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer> totalProducedCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer> defectCountCol;

    private ArrayList<User4Goal2> data = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        batchIdCol.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        defectCountCol.setCellValueFactory(new PropertyValueFactory<>("defectCount"));
        totalProducedCol.setCellValueFactory(new PropertyValueFactory<>("totalProduced"));

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

    private void showWarning(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }


    @javafx.fxml.FXML
    public void handleLoadButton(ActionEvent actionEvent) {
        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();

        if (start == null || end == null) {
            showWarning("Please select both start and end dates.");
            return;
        }

        if (end.isBefore(start)) {
            showWarning("End date must be after start date.");
            return;
        }
        data.clear();
        data.clear();

        data.add(new User4Goal2(101, 5, 100, start, end));
        data.add(new User4Goal2(102, 8, 120, start, end));
        data.add(new User4Goal2(103, 2, 90, start, end));

        qualityTable.getItems().setAll(data);

        qualityTable.getItems().setAll(data);

        updateMetrics();
    }


    private void updateMetrics() {
        int totalProduced = 0;
        int totalDefects = 0;

        for (User4Goal2 item : data) {
            totalProduced += item.getTotalProduced();
            totalDefects += item.getDefectCount();
        }

        double defectRate = totalProduced == 0 ? 0 :
                ((double) totalDefects / totalProduced) * 100;

        String report = "Defect Analysis Report:\n\n" +
                "Total Produced: " + totalProduced + "\n" +
                "Total Defects: " + totalDefects + "\n" +
                "Defect Rate: " + String.format("%.2f", defectRate) + "%";

        defectRateMatricsTextArea.setText(report);

        if (defectRate > 5) {
            alertTextField.setText("WARNING: High defect rate detected!");
        } else {
            alertTextField.setText("Defect rate normal.");
        }

    }
}
package cse213.group7.papermillfinal.laboni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class PerformanceReportController {

    @javafx.fxml.FXML
    private DatePicker DstartDP;

    @javafx.fxml.FXML
    private Label validationL;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, String> MericCol;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, String> ScoreCol;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, String> RatingC;

    @javafx.fxml.FXML
    private TableColumn<PerformanceReport, String> CommentsC;

    @javafx.fxml.FXML
    private ComboBox<String> EmployeeCB;

    @javafx.fxml.FXML
    private TableView<PerformanceReport> metricsT;

    @javafx.fxml.FXML
    private Label OverallPerformanceScoreL;

    @javafx.fxml.FXML
    private Label AverageRatingL;

    @javafx.fxml.FXML
    private Label AttendanceL;

    @javafx.fxml.FXML
    private Label TasksCompletedL;

    ObservableList<PerformanceReport> reportData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {


        EmployeeCB.getItems().addAll("Joni", "Smith", "Mina", "Rahim", "Karim");


        MericCol.setCellValueFactory(new PropertyValueFactory<>("metric"));
        ScoreCol.setCellValueFactory(new PropertyValueFactory<>("score"));
        RatingC.setCellValueFactory(new PropertyValueFactory<>("rating"));
        CommentsC.setCellValueFactory(new PropertyValueFactory<>("comments"));

        metricsT.setItems(reportData);
    }

    @javafx.fxml.FXML
    public void GenerateReportOA(ActionEvent event) {

        if (EmployeeCB.getValue() == null || DstartDP.getValue() == null) {
            validationL.setText("Please select employee and date!");
            return;
        }

        validationL.setText("");


        reportData.clear();


        reportData.add(new PerformanceReport("Task Completion", "85%", "4.2", "Good performance"));
        reportData.add(new PerformanceReport("Attendance", "95%", "4.8", "Very active"));
        reportData.add(new PerformanceReport("Team Work", "80%", "4.0", "Cooperative"));
        reportData.add(new PerformanceReport("Punctuality", "90%", "4.5", "Consistent"));

        TasksCompletedL.setText("85%");
        AttendanceL.setText("95%");
        AverageRatingL.setText("4.38");
        OverallPerformanceScoreL.setText("4.4 / 5.0");
    }

    @javafx.fxml.FXML
    public void ExportPDFOA(ActionEvent event) {
        validationL.setText("PDF Exported Successfully!");
    }
}

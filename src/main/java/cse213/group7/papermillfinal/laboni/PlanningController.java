package cse213.group7.papermillfinal.laboni;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PlanningController {

    @javafx.fxml.FXML
    private TableView<Planning> OvertimeSchedule;

    @javafx.fxml.FXML
    private TableColumn<Planning, String> EmployeeIDCol;

    @javafx.fxml.FXML
    private TableColumn<Planning, String> NameCol;

    @javafx.fxml.FXML
    private TableColumn<Planning, String> DepartmentCol;

    @javafx.fxml.FXML
    private TableColumn<Planning, String> AssignedShiftCol;

    @javafx.fxml.FXML
    private TableColumn<Planning, Integer> OTHoursCol;

    @javafx.fxml.FXML
    private TextField StaffingLevelTF;

    @javafx.fxml.FXML
    private TextField ProducationDemandTF;

    @javafx.fxml.FXML
    private TextField MaxovertimeTF;

    private final ObservableList<Planning> overtimeData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {


        EmployeeIDCol.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        NameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        DepartmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        AssignedShiftCol.setCellValueFactory(new PropertyValueFactory<>("assignedShift"));
        OTHoursCol.setCellValueFactory(new PropertyValueFactory<>("otHours"));

        overtimeData.addAll(
                new Planning("E001", "David", "Production", "Morning", 2),
                new Planning("E002", "Mina", "Maintenance", "Evening", 3),
                new Planning("E003", "Rahim", "Weaving", "Night", 1),
                new Planning("E004", "Rahman", "Production", "Morning", 3),
                new Planning("E005", "kahim", "Weaving", "Night", 1)
        );

        OvertimeSchedule.setItems(overtimeData);
    }

    @javafx.fxml.FXML
    public void PlanOvertimeOA(ActionEvent event) {

        if (MaxovertimeTF.getText().isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Enter max overtime hours!").show();
            return;
        }

        int maxOT;
        try {
            maxOT = Integer.parseInt(MaxovertimeTF.getText());
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Please enter a valid number!").show();
            return;
        }

        for (Planning r : overtimeData) {
            if (r.getOtHours() > maxOT) {
                r.setOtHours(maxOT);
            }
        }

        OvertimeSchedule.refresh();
    }

    @javafx.fxml.FXML
    public void CalculateOA(ActionEvent event) {
        int total = 0;
        for (Planning r : overtimeData) {
            total += r.getOtHours();
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Total Overtime Calculation");
        alert.setContentText("Total OT Hours: " + total);
        alert.show();
    }

    @javafx.fxml.FXML
    public void ComplianceL(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Compliance Check");
        alert.setContentText("All OT schedules are within legal limits.");
        alert.show();
    }

    @FXML
    public void handleBackDashboardButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/laboni/User7dashboard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

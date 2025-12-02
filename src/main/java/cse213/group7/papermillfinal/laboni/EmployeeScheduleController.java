package cse213.group7.papermillfinal.laboni;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeScheduleController {

    @javafx.fxml.FXML
    private ComboBox<String> productionLevelCombo;

    @javafx.fxml.FXML
    private ComboBox<String> ShiftTypeCombo;

    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCombo;

    @javafx.fxml.FXML
    private DatePicker WeekStartingDP;

    @javafx.fxml.FXML
    private TableView<EmployeeSchedule> scheduleTable;

    @javafx.fxml.FXML
    private TableColumn<EmployeeSchedule, String> EmployeeIDCol;

    @javafx.fxml.FXML
    private TableColumn<EmployeeSchedule, String> NameCol;

    @javafx.fxml.FXML
    private TableColumn<EmployeeSchedule, String> DepartmentCol;

    @javafx.fxml.FXML
    private TableColumn<EmployeeSchedule, String> RoleCol;

    @javafx.fxml.FXML
    private TableColumn<EmployeeSchedule, String> ShiftCol;

    @javafx.fxml.FXML
    private TableColumn<EmployeeSchedule, Integer> HoursCol;

    @javafx.fxml.FXML
    private ListView<String> StaffRequirementsLV;

    @javafx.fxml.FXML
    private Label Lable;

    private ObservableList<EmployeeSchedule> scheduleList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        EmployeeIDCol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        NameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        DepartmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        RoleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        ShiftCol.setCellValueFactory(new PropertyValueFactory<>("shift"));
        HoursCol.setCellValueFactory(new PropertyValueFactory<>("house"));

        scheduleTable.setItems(scheduleList);

        productionLevelCombo.setItems(FXCollections.observableArrayList("Low", "Medium", "High"));
        ShiftTypeCombo.setItems(FXCollections.observableArrayList("Morning", "Evening", "Night"));
        DepartmentCombo.setItems(FXCollections.observableArrayList("Cutting", "Finishing", "Maintenance"));
    }

    @javafx.fxml.FXML
    public void GenerateScheduleOA(ActionEvent event) {

        scheduleList.clear();
        StaffRequirementsLV.getItems().clear();

        if (productionLevelCombo.getValue() == null ||
                ShiftTypeCombo.getValue() == null ||
                DepartmentCombo.getValue() == null ||
                WeekStartingDP.getValue() == null) {

            showAlert("Missing Information", "Please select all fields before generating schedule.");
            return;
        }

        scheduleList.addAll(
                new EmployeeSchedule("E101", "Arif Khan",
                        DepartmentCombo.getValue(), ShiftTypeCombo.getValue(),
                        "Operator", 8, WeekStartingDP.getValue().toString()),

                new EmployeeSchedule("E102", "Nusrat Jahan",
                        DepartmentCombo.getValue(), ShiftTypeCombo.getValue(),
                        "Supervisor", 8, WeekStartingDP.getValue().toString()),

                new EmployeeSchedule("E103", "Sabbir Hossain",
                        DepartmentCombo.getValue(), ShiftTypeCombo.getValue(),
                        "Helper", 8, WeekStartingDP.getValue().toString())
        );

        StaffRequirementsLV.getItems().addAll(
                "Required Operators: 2",
                "Required Helper: 1",
                "Required Supervisor: 1",
                "Production Level: " + productionLevelCombo.getValue()
        );

        Lable.setText("Schedule Generated Successfully!");
    }

    @javafx.fxml.FXML
    public void ConfirmOA(ActionEvent event) {

        if (scheduleList.isEmpty()) {
            showAlert("No Schedule", "Generate schedule first.");
            return;
        }

        showAlert("Success", "Schedule confirmed and saved.");
    }

    @javafx.fxml.FXML
    public void AdjustOA(ActionEvent event) {

        if (scheduleList.isEmpty()) {
            showAlert("No Data", "Generate schedule to adjust.");
            return;
        }

        scheduleList.add(
                new EmployeeSchedule("E200", "New Helper",
                        DepartmentCombo.getValue(), ShiftTypeCombo.getValue(),
                        "Helper", 6, WeekStartingDP.getValue().toString())
        );

        StaffRequirementsLV.getItems().add("Adjustment Applied: Extra Helper Added");

        Lable.setText("Schedule Adjusted Successfully!");
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
}

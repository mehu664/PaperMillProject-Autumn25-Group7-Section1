package cse213.group7.papermillfinal.laboni;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeRecordsController {

    @javafx.fxml.FXML
    private ComboBox<String> Department;

    @javafx.fxml.FXML
    private TextArea AddressTA;

    @javafx.fxml.FXML
    private TextField ContactNoTF;

    @javafx.fxml.FXML
    private TextField PositionTF;

    @javafx.fxml.FXML
    private TextField EmployeeIDTF;

    private EmployeeRecords savedRecord;


    @javafx.fxml.FXML
    public void initialize() {

        Department.getItems().addAll("Production", "Maintenance", "Weaving", "Quality Control", "HR");
    }


    @javafx.fxml.FXML
    public void SaveRecordsOA(ActionEvent actionEvent) {


        if (EmployeeIDTF.getText().isEmpty() ||
                Department.getValue() == null ||
                PositionTF.getText().isEmpty() ||
                ContactNoTF.getText().isEmpty() ||
                AddressTA.getText().isEmpty())
        {
            System.out.println("Fill all fields before saving!");
            return;
        }


        savedRecord = new EmployeeRecords(
                EmployeeIDTF.getText(),
                Department.getValue(),
                PositionTF.getText(),
                ContactNoTF.getText(),
                AddressTA.getText()
        );

        System.out.println("Employee Record Saved:");
        System.out.println("ID: " + savedRecord.getEmployeeId());
        System.out.println("Dept: " + savedRecord.getDepartment());
        System.out.println("Position: " + savedRecord.getPosition());
        System.out.println("Contact: " + savedRecord.getContactNo());
        System.out.println("Address: " + savedRecord.getAddress());
    }


    @javafx.fxml.FXML
    public void updateOA(ActionEvent actionEvent) {

        if (savedRecord == null) {
            System.out.println("No saved record found! Save first.");
            return;
        }

        if (Department.getValue() != null)
            savedRecord.setDepartment(Department.getValue());

        if (!PositionTF.getText().isEmpty())
            savedRecord.setPosition(PositionTF.getText());

        if (!ContactNoTF.getText().isEmpty())
            savedRecord.setContactNo(ContactNoTF.getText());

        if (!AddressTA.getText().isEmpty())
            savedRecord.setAddress(AddressTA.getText());

        System.out.println("Record Updated Successfully!");
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

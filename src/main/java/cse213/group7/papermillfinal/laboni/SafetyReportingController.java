package cse213.group7.papermillfinal.laboni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class SafetyReportingController {

    @javafx.fxml.FXML
    private TextField LacationTF;

    @javafx.fxml.FXML
    private DatePicker dateIncidentDP;

    @javafx.fxml.FXML
    private TextArea DescriptionTA;

    @javafx.fxml.FXML
    private ComboBox<String> SeverityCB;

    @javafx.fxml.FXML
    private ComboBox<String> IncidentTypeCB;

    @javafx.fxml.FXML
    public void initialize() {

        SeverityCB.getItems().addAll("Low", "Medium", "High", "Critical");


        IncidentTypeCB.getItems().addAll("Slip/Fall", "Machine Malfunction", "Fire Hazard",
                "Chemical Exposure",
                "Electrical Issue");}

    @javafx.fxml.FXML
    public void SubmitIncidentOA(ActionEvent actionEvent) {

        if (LacationTF.getText().isEmpty() ||
                dateIncidentDP.getValue() == null ||
                DescriptionTA.getText().isEmpty() ||
                SeverityCB.getValue() == null ||
                IncidentTypeCB.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validation Error");
            alert.setHeaderText("Missing Information");
            alert.setContentText("Please fill in all fields before submitting!");
            alert.show();
            return;
        }

        String location = LacationTF.getText();
        String date = dateIncidentDP.getValue().toString();
        String description = DescriptionTA.getText();
        String severity = SeverityCB.getValue();
        String type = IncidentTypeCB.getValue();

        SafetyReporting incident = new SafetyReporting(location, date, description, severity, type);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Incident Submitted");
        alert.setHeaderText("Incident Submitted Successfully");
        alert.setContentText(
                "Location: " + location +
                        "\nDate: " + date +
                        "\nType: " + type +
                        "\nSeverity: " + severity +
                        "\nDescription: " + description
        );
        alert.show();
    }

    @javafx.fxml.FXML
    public void LogIncidentOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Logs");
        alert.setContentText("Incident successfully logged into the system!");
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

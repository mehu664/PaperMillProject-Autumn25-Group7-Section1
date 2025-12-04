package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class User3Goal4Controller
{
    @javafx.fxml.FXML
    private TextArea reportPreviewTextArea;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private Label notifyLabel;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void generatReportButton(ActionEvent actionEvent) {

        String reportText = reportPreviewTextArea.getText().trim();
        LocalDate startDate = startDatePicker.getValue();
        LocalDate endDate = endDatePicker.getValue();

        // Validation: preview text + start date required
        if (reportText.isEmpty() || startDate == null) {
            notifyLabel.setText(" Please enter report details and start date.");
            return;
        }

        // Optional: if end date exists, it must be >= start date
        if (endDate != null && endDate.isBefore(startDate)) {
            notifyLabel.setText("End date cannot be before start date.");
            return;
        }

        // Build dummy logistics report
        StringBuilder reportBuilder = new StringBuilder();

        reportBuilder.append("=== Logistics Cost Report ===\n");
        reportBuilder.append("Start Date: ").append(startDate).append("\n");
        reportBuilder.append("End Date: ").append(endDate != null ? endDate : "Not Provided").append("\n\n");

        // Fake cost values (could pull from database later)
        reportBuilder.append("Raw Material Transport Cost: $2500\n");
        reportBuilder.append("Warehouse Storage Cost: $1800\n");
        reportBuilder.append("Labor Cost: $900\n");
        reportBuilder.append("----------------------------\n");
        reportBuilder.append("Total Logistics Cost: $5200\n\n");

        reportBuilder.append("Summary: Operations running normally. No delay reported.\n");

        // Append the generated report to the text area
        reportPreviewTextArea.setText(reportBuilder.toString());

        // Update notify label
        notifyLabel.setText(" Report generated successfully.");
    }

}
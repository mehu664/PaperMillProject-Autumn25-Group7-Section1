package cse213.group7.papermillfinal.laboni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import java.time.format.DateTimeFormatter;

public class HRDataController {

    @javafx.fxml.FXML
    private Label Status;

    @javafx.fxml.FXML
    private ComboBox<String> DateTypeCB;

    @javafx.fxml.FXML
    private DatePicker StartDateDP;

    @javafx.fxml.FXML
    private ComboBox<String> ExportFormatCB;
    @javafx.fxml.FXML
    private Label StartDateL;
    @javafx.fxml.FXML
    private Label EndDateDP;

    @javafx.fxml.FXML
    public void initialize() {


        DateTypeCB.getItems().addAll("Daily", "Monthly", "Yearly");
        ExportFormatCB.getItems().addAll("PDF", "Excel", "CSV");
    }

    @javafx.fxml.FXML
    public void ExportDataOA(ActionEvent event) {
        Status.setText("Data Exported Successfully!");
    }

    @javafx.fxml.FXML
    public void DownloadOA(ActionEvent event) {
        Status.setText("Download Started...");
    }

    @javafx.fxml.FXML
    public void GenerateReportOA(ActionEvent event) throws InterruptedException {

        if ((StartDateDP.getValue() == null) || (EndDateDP.getOpaqueInsets() == null) ||
                (DateTypeCB.getValue() == null) || (ExportFormatCB.getValue() == null)) {

            Status.setText("Please fill all fields!");
            return;
        }

        String start = StartDateDP.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String end = null;
        EndDateDP.getOpaqueInsets().wait();

        HR_Data report = new HR_Data(
                DateTypeCB.getValue(),
                start,
                end,
                ExportFormatCB.getValue(),
                "Report Generated"
        );

        Status.setText("Report Generated Successfully!");
    }
}
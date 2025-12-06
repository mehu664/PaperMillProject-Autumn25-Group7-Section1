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
import java.time.LocalDate;

public class OrderReportController {

    @FXML
    private TableView<OrderReport> reportTable;

    @FXML
    private TableColumn<OrderReport, String> orderIdCol;

    @FXML
    private TableColumn<OrderReport, String> customerCol;

    @FXML
    private TableColumn<OrderReport, LocalDate> dateCol;

    @FXML
    private TableColumn<OrderReport, Integer> qtyCol;

    @FXML
    private TableColumn<OrderReport, String> statusCol;

    @FXML
    private TextArea statusArea;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private TextField customerUidField;

    ObservableList<OrderReport> reportList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customer"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        qtyCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        reportTable.setItems(reportList);

        reportTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        reportTable.refresh();
    }



    @FXML
    public void goBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/laboni/User8DashBoard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void generateReport(ActionEvent actionEvent) {

        statusArea.clear();
        reportList.clear();

        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();
        String uid = customerUidField.getText();


        if (start == null || end == null) {
            statusArea.setText("Please select a valid date range!");
            return;
        }
        if (end.isBefore(start)) {
            statusArea.setText("End date cannot be earlier than start date!");
            return;
        }


        statusArea.appendText("Fetching order data...\n");


        ObservableList<OrderReport> fetched = fetchOrderData(start, end, uid);

        if (fetched.isEmpty()) {
            statusArea.appendText("No orders found!\n");
        } else {
            reportList.addAll(fetched);
            statusArea.appendText("Report generated successfully!\n");
        }
    }


    private ObservableList<OrderReport> fetchOrderData(LocalDate start, LocalDate end, String uid) {

        ObservableList<OrderReport> temp = FXCollections.observableArrayList();


        temp.add(new OrderReport("O1001", "CUST01", LocalDate.of(2025, 1, 5), 40, "Delivered"));
        temp.add(new OrderReport("O1002", "CUST02", LocalDate.of(2025, 1, 12), 60, "Pending"));
        temp.add(new OrderReport("O1003", "CUST03", LocalDate.of(2025, 2, 4), 30, "Shipped"));
        temp.add(new OrderReport("O1004", "CUST01", LocalDate.of(2025, 2, 15), 80, "Delivered"));

        ObservableList<OrderReport> filtered = FXCollections.observableArrayList();

        for (OrderReport r : temp) {
            boolean inRange = !r.getDate().isBefore(start) && !r.getDate().isAfter(end);
            boolean matchUid = uid == null || uid.isEmpty() || r.getCustomer().equalsIgnoreCase(uid);

            if (inRange && matchUid) {
                filtered.add(r);
            }
        }

        return filtered;
    }


    @FXML
    public void ResetOA(ActionEvent actionEvent) {
        customerUidField.clear();
        startDatePicker.setValue(null);
        endDatePicker.setValue(null);
        statusArea.clear();
        reportList.clear();
    }
}
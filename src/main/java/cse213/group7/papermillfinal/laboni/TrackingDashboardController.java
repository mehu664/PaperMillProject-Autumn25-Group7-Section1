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

public class TrackingDashboardController {

    @FXML
    private TableView<TrackingDashboard> orderTable;
    @FXML
    private TableColumn<TrackingDashboard, String> orderIdCol;
    @FXML
    private TableColumn<TrackingDashboard, String> customerCol;
    @FXML
    private TableColumn<TrackingDashboard, String> typeCol;
    @FXML
    private TableColumn<TrackingDashboard, Integer> qtyCol;
    @FXML
    private TableColumn<TrackingDashboard, String> statusCol;
    @FXML
    private TableColumn<TrackingDashboard, LocalDate> etaCol;

    @FXML
    private ProgressBar progressBar;
    @FXML
    private TextArea alertArea;

    private ObservableList<TrackingDashboard> orders = FXCollections.observableArrayList();

    @FXML
    public void initialize() {


        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customer"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        qtyCol.setCellValueFactory(new PropertyValueFactory<>("qty"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        etaCol.setCellValueFactory(new PropertyValueFactory<>("eta"));


        loadSampleData();

        updateProgress();
        checkDelays();
    }

    private void loadSampleData() {
        orders.clear();

        orders.add(new TrackingDashboard("ORD-101", "Rahim", "A4 Paper", 500, "Processing", LocalDate.now().plusDays(2)));
        orders.add(new TrackingDashboard("ORD-102", "Karim", "Newsprint", 800, "Delivered", LocalDate.now().minusDays(1)));
        orders.add(new TrackingDashboard("ORD-103", "Selina", "Copy Paper", 300, "On Hold", LocalDate.now().minusDays(2)));
        orders.add(new TrackingDashboard("ORD-104", "Rafiq", "Cardboard", 200, "Dispatched", LocalDate.now().plusDays(1)));
        orders.add(new TrackingDashboard("ORD-105", "Rahman", "Pen", 200, "Dispatched", LocalDate.now().plusDays(1)));
        orders.add(new TrackingDashboard("ORD-106", "Rafiq", "Cardboard", 200, "Delivered", LocalDate.now().plusDays(2)));
        orders.add(new TrackingDashboard("ORD-107", "Kader", "Pen", 200, "Dispatched", LocalDate.now().plusDays(3)));

        orderTable.setItems(orders);
    }

    private void updateProgress() {
        long delivered = orders.stream()
                .filter(o -> o.getStatus().equals("Delivered"))
                .count();

        double progress = (double) delivered / orders.size();
        progressBar.setProgress(progress);
    }

    private void checkDelays() {
        alertArea.clear();
        for (TrackingDashboard o : orders) {
            if (o.isDelayed()) {
                alertArea.appendText("Order " + o.getOrderId() + " is delayed!\n");
            }

        }
        if (alertArea.getText().isEmpty()) {
            alertArea.setText("No delays detected.");
        }
    }

    @FXML
    public void refreshOA(ActionEvent actionEvent) {
        loadSampleData();
        updateProgress();
        checkDelays();
    }

    @FXML
    public void BackOA(ActionEvent actionEvent) {
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
}

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

public class DeliveryScheduleController {

    @FXML
    private TextArea statusArea;

    @FXML
    private TableView<DeliveryScheduling> orderTable;

    @FXML
    private TableColumn<DeliveryScheduling, String> orderIdCol;
    @FXML
    private TableColumn<DeliveryScheduling, String> customerCol;
    @FXML
    private TableColumn<DeliveryScheduling, Integer> qtyCol;
    @FXML
    private TableColumn<DeliveryScheduling, String> statusCol;
    @FXML
    private TableColumn<DeliveryScheduling, Integer> distanceCol;
    @FXML
    private TableColumn<DeliveryScheduling, String> vehicleCol;
    @FXML
    private TableColumn<DeliveryScheduling, LocalDate> etaCol;
    @FXML
    private TableColumn<DeliveryScheduling, String> priorityCol;

    @FXML
    private TableView<DeliveryScheduling> scheduleTable;

    @FXML
    private TableColumn<DeliveryScheduling, String> planOrderIdCol;

    private ObservableList<DeliveryScheduling> orders = FXCollections.observableArrayList();
    private ObservableList<DeliveryScheduling> scheduleList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customer"));
        qtyCol.setCellValueFactory(new PropertyValueFactory<>("qty"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        distanceCol.setCellValueFactory(new PropertyValueFactory<>("distance"));
        vehicleCol.setCellValueFactory(new PropertyValueFactory<>("vehicle"));
        etaCol.setCellValueFactory(new PropertyValueFactory<>("eta"));
        priorityCol.setCellValueFactory(new PropertyValueFactory<>("priority"));

        planOrderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));

        orderTable.setItems(orders);
        scheduleTable.setItems(scheduleList);
    }

    @FXML
    public void fetchOrders(ActionEvent actionEvent) {
        orders.clear();


        orders.add(new DeliveryScheduling("ORD-201", "Rahim", 300,
                "Pending", 120, "Van",
                LocalDate.now().plusDays(1), "High"));

        orders.add(new DeliveryScheduling("ORD-202", "Karim", 450,
                "Processing", 250, "Truck",
                LocalDate.now().plusDays(2), "Medium"));

        orders.add(new DeliveryScheduling("ORD-203", "Selina", 150,
                "Delayed", 80, "Van",
                LocalDate.now().minusDays(1), "High"));

        orders.add(new DeliveryScheduling("ORD-204", "Rafiq", 500,
                "Pending", 300, "Truck",
                LocalDate.now().plusDays(3), "Low"));

        statusArea.setText("Orders fetched successfully.\n");
    }

    @FXML
    public void calculateSchedule(ActionEvent actionEvent) {
        scheduleList.clear();
        statusArea.clear();

        if (orders.isEmpty()) {
            statusArea.setText("No orders available to schedule!");
            return;
        }

        orders.sort((o1, o2) ->
                o1.getPriority().compareToIgnoreCase(o2.getPriority()));

        for (DeliveryScheduling o : orders) {
            scheduleList.add(o);
            statusArea.appendText("Scheduled order: " + o.getOrderId() +
                    "  ETA: " + o.getEta() +
                    "  Vehicle: " + o.getVehicle() + "\n");
        }

        statusArea.appendText("\nDelivery schedule calculated successfully.");
    }

    @FXML
    public void goBack(ActionEvent actionEvent) {
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

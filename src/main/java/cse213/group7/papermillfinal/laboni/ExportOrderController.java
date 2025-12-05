package cse213.group7.papermillfinal.laboni;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ExportOrderController {

    @FXML
    private TextArea statusArea;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private ComboBox<String> typeComboBox;

    private ObservableList<ExportOrder> orderList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        statusArea.setText("Select date range and type to export orders.");

        typeComboBox.setItems(FXCollections.observableArrayList("A4 Paper", "Newsprint", "Cardboard", "Copy Paper"));


        orderList.add(new ExportOrder("ORD-101", "Rahim", "A4 Paper", 500));
        orderList.add(new ExportOrder("ORD-102", "Karim", "Newsprint", 800));
        orderList.add(new ExportOrder("ORD-103", "Selina", "Copy Paper", 300));
        orderList.add(new ExportOrder("ORD-104", "Rafiq", "Cardboard", 200));
    }

    @FXML
    public void exportOrders(ActionEvent actionEvent) {
        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();
        String type = typeComboBox.getValue();

        if(start == null || end == null) {
            statusArea.setText("Please select a valid date range!");
            return;
        }
        if(end.isBefore(start)) {
            statusArea.setText("End date cannot be earlier than start date!");
            return;
        }
        if(type == null || type.isEmpty()) {
            statusArea.setText("Please select a product type!");
            return;
        }

        ObservableList<ExportOrder> filtered = FXCollections.observableArrayList();
        for(ExportOrder o : orderList) {
            if(o.getType().equalsIgnoreCase(type)) {
                filtered.add(o);
            }
        }

        if(filtered.isEmpty()) {
            statusArea.setText("No orders found for type: " + type);
        } else {

            statusArea.setText(filtered.size() + " orders of type '" + type + "' exported successfully!");
            for(ExportOrder o : filtered) {
                statusArea.appendText("\nOrderID: " + o.getOrderId() + ", Customer: " + o.getCustomer() + ", Qty: " + o.getQty());
            }
        }
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/laboni/User7dashboard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
}}

package cse213.group7.papermillfinal.laboni;

import cse213.group7.papermillfinal.laboni.Payment;
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

public class PaymentController {

    @FXML
    private TextField orderIdField;
    @FXML
    private TextField customerField;
    @FXML
    private TextField amountField;
    @FXML
    private Button processBtn;
    @FXML
    private TextArea statusArea;
    @FXML
    private TableView<Payment> paymentTable;
    @FXML
    private TableColumn<Payment,String> orderIdCol;
    @FXML
    private TableColumn<Payment,String> customerCol;
    @FXML
    private TableColumn<Payment,Double> amountCol;
    @FXML
    private TableColumn<Payment,String> statusCol;

    ObservableList<Payment> paymentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("OrderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("Customer"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));

        paymentTable.setItems(paymentList);
    }

    @FXML
    public void processPayment() {
        String orderId = orderIdField.getText();
        String customer = customerField.getText();
        double amount;

        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            statusArea.setText("Invalid amount!");
            return;
        }

        statusArea.clear();
        statusArea.appendText("Fetching order details...\n");

        Payment payment = new Payment(orderId, customer, amount, "Pending");

        payment.setStatus("Completed");
        statusArea.appendText("Payment processed successfully.\n");

        statusArea.appendText("Payment for order " + orderId + " completed.\n");


        paymentList.add(payment);
    }

    @FXML
    public void resetFields() {
        orderIdField.clear();
        customerField.clear();
        amountField.clear();
        statusArea.clear();
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
    }
}

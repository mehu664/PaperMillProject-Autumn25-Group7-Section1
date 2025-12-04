package cse213.group7.papermillfinal.laboni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class OrderProcessingController {

    @javafx.fxml.FXML
    private ComboBox<String> ProductTypeCB;

    @javafx.fxml.FXML
    private ComboBox<String> PriorityCB;

    @javafx.fxml.FXML
    private TextField CustomerNameTF;

    @javafx.fxml.FXML
    private TextField QuantityTF;

    @javafx.fxml.FXML
    private TextArea StatusTA;


    @javafx.fxml.FXML
    public void initialize() {

        ProductTypeCB.getItems().addAll("A4 Paper", "Newsprint Roll", "Cardboard", "Duplex Board","Pen");
        PriorityCB.getItems().addAll("High", "Medium", "Low");
    }


    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {

        StatusTA.setText("Back button pressed (scene change to add)।");
    }


    @javafx.fxml.FXML
    public void ResetOA(ActionEvent actionEvent) {
        ProductTypeCB.setValue(null);
        PriorityCB.setValue(null);
        CustomerNameTF.clear();
        QuantityTF.clear();
        StatusTA.clear();

        StatusTA.setText("Form has been reset.");
    }


    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {

        String product = ProductTypeCB.getValue();
        String priority = PriorityCB.getValue();
        String customer = CustomerNameTF.getText();
        String qtyText = QuantityTF.getText();

        if (product == null || priority == null || customer.isEmpty() || qtyText.isEmpty()) {
            StatusTA.setText("Please fill all fields.\n");
            return;
        }

        int quantity;

        try {
            quantity = Integer.parseInt(qtyText);
            if (quantity <= 0) {
                StatusTA.setText("Quantity must be a positive number.");
                return;
            }
        } catch (Exception e) {
            StatusTA.setText("Quantity must be numeric.");
            return;
        }


        StatusTA.setText(
                "Order Submitted Successfully!\n" +
                        "-------------------------------------\n" +
                        "Customer: " + customer + "\n" +
                        "Product Type: " + product + "\n" +
                        "Priority: " + priority + "\n" +
                        "Quantity: " + quantity + "\n"
        );
    }
}

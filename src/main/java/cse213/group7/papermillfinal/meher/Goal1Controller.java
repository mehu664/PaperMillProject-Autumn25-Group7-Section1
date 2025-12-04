package cse213.group7.papermillfinal.meher;

import cse213.group7.papermillfinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Goal1Controller
{
    @javafx.fxml.FXML
    private TextField distanceTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private Label totalcost;
    @javafx.fxml.FXML
    private TextField supplierNameTextField;
    @javafx.fxml.FXML
    private Label orderDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> transportComboBox;
    @javafx.fxml.FXML
    private TextArea invoiceTextArea;
    @javafx.fxml.FXML
    private TextField materialTextField;

    @javafx.fxml.FXML
    public void initialize() {
        transportComboBox.getItems().addAll("Truck","CargoShip","Rail","Van");

    }

    @javafx.fxml.FXML
    public void handleCalculateButton(ActionEvent actionEvent) {


        int quantityNum = Integer.parseInt(quantityTextField.getText());
        int distanceNUm = Integer.parseInt(distanceTextField.getText());
        float resultNum =(float) quantityNum + distanceNUm * 8 ;

        totalcost.setText(Float.toString(resultNum));

        String invoice = "------------ TRANSPORT INVOICE ------------\n"
                + "Supplier Name : " + supplierNameTextField.getText() + "\n"
                + "Material      : " + materialTextField.getText() + "\n"
                + "Quantity      : " + quantityTextField.getText() + "\n"
                + "Transport     : " + transportComboBox.getValue() + "\n"
                + "Distance      : " + distanceTextField.getText() + " km\n"
                + "-------------------------------------------\n"
                + "Total Cost    : " + resultNum + " Tk\n"
                + "-------------------------------------------\n"
                + "Thank you for using our transport service!\n";

        // Display in the text area
        invoiceTextArea.setText(invoice);

        invoiceTextArea.setEditable(false);


    }

    @Deprecated

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



}
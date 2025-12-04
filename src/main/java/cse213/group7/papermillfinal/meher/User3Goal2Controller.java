package cse213.group7.papermillfinal.meher;

import cse213.group7.papermillfinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class User3Goal2Controller
{
    @javafx.fxml.FXML
    private TableView<Goal2> deliveryViewTable;
    @javafx.fxml.FXML
    private TableColumn<Goal2,String> materialCol;
    @javafx.fxml.FXML
    private Label notificationLabel;
    @javafx.fxml.FXML
    private TableColumn<Goal2,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Goal2,Integer> deliveryIDCol;
    @javafx.fxml.FXML
    private TableColumn<Goal2,String> etaCol;
    @javafx.fxml.FXML
    private TableColumn<Goal2,String> delayedCol;
    @javafx.fxml.FXML
    private DatePicker deliveryDatePicker;
    @javafx.fxml.FXML
    private TextField deliveryIDTextField;
    @javafx.fxml.FXML
    private Label notificationLabel1;
    @javafx.fxml.FXML
    private Label notificationLabel11;
    @javafx.fxml.FXML
    private TextField materiaalTextField;
    @javafx.fxml.FXML
    private Label notificationLabel111;

    @javafx.fxml.FXML
    public void initialize() {
        deliveryIDCol.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        materialCol.setCellValueFactory(new PropertyValueFactory<>("materials"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("materials"));

    }

    @javafx.fxml.FXML
    public void refreshTableButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleDeliveryboardBackButton(ActionEvent actionEvent) {
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
    public void handleSearchButton(ActionEvent actionEvent) {

    }
}
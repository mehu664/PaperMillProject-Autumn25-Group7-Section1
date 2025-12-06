package cse213.group7.papermillfinal.laboni;

import cse213.group7.papermillfinal.laboni.Survey;

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

public class SurveyController {

    @FXML
    private ComboBox<String> orderComboBox;
    @FXML
    private TextField customerField;
    @FXML
    private ComboBox<Integer> ratingComboBox;
    @FXML
    private TextArea feedbackArea;
    @FXML
    private TextArea statusArea;
    @FXML
    private TableView<Survey> surveyTable;
    @FXML
    private TableColumn<Survey,String> orderIdCol;
    @FXML
    private TableColumn<Survey,String> customerCol;
    @FXML
    private TableColumn<Survey,Integer> ratingCol;
    @FXML
    private TableColumn<Survey,String> feedbackCol;

    private ObservableList<Survey> surveyList = FXCollections.observableArrayList();
    private ObservableList<String> dummyOrders = FXCollections.observableArrayList("O1001","O1002","O1003");

    @FXML
    public void initialize() {
        orderComboBox.setItems(dummyOrders);
        ratingComboBox.setItems(FXCollections.observableArrayList(1,2,3,4,5));

        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("Customer"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("Rating"));
        feedbackCol.setCellValueFactory(new PropertyValueFactory<>("Feedback"));

        surveyTable.setItems(surveyList);
    }

    @FXML
    public void submitSurvey() {
        String orderId = orderComboBox.getValue();
        String customer = customerField.getText().trim();
        Integer rating = ratingComboBox.getValue();
        String feedback = feedbackArea.getText().trim();

        if(orderId == null || customer.isEmpty() || rating == null){
            statusArea.setText("Please fill all required fields.\n");
            return;
        }

        Survey survey = new Survey(orderId, customer, rating, feedback);
        surveyList.add(survey);

        statusArea.setText("Survey submitted successfully!\n");
        orderComboBox.setValue(null);
        customerField.clear();
        ratingComboBox.setValue(null);
        feedbackArea.clear();
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


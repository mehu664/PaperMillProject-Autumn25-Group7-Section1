package cse213.group7.papermillfinal.meher;

import cse213.group7.papermillfinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class User3Goal3Controller
{
    @javafx.fxml.FXML
    private TextField maxCapacityTextField;
    @javafx.fxml.FXML
    private TextField evventLogTextField;
    @javafx.fxml.FXML
    private Label showLimitLLabel;
    @javafx.fxml.FXML
    private Button verifyLimitButton;
    @javafx.fxml.FXML
    private TextArea storageMatricsTextArea;

    private int currentStored;

    {
        currentStored = 0;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void retrieveWarehouseDataButton(ActionEvent actionEvent) {
        storageMatricsTextArea.clear();

        StringBuilder sb = new StringBuilder();
        sb.append("Warehouse Storage Report:\n");
        sb.append("---------------------------\n");

        int[] items = {120, 80, 110, 95, 130};

        currentStored = 0;

        for (int i = 0; i < items.length; i++) {
            sb.append("Item " + (i + 1) + ": " + items[i] + " units\n");
            currentStored += items[i];
        }

        sb.append("---------------------------\n");
        sb.append("Total Stored: " + currentStored + " units\n");

        storageMatricsTextArea.setText(sb.toString());

    }

    @javafx.fxml.FXML
    public void checkCapacityButton(ActionEvent actionEvent) {
        if (maxCapacityTextField.getText().isEmpty()) {
            error("Enter max capacity first!");
            return;
        }

        if (currentStored == 0) {
            error("Click 'Retrieve Data' first!");
            return;
        }

        int maxCap;

        try {
            maxCap = Integer.parseInt(maxCapacityTextField.getText());
        } catch (NumberFormatException e) {
            error("Capacity must be a number");
            return;
        }

        if (currentStored > maxCap) {
            showLimitLLabel.setStyle("-fx-text-fill: red;");
            showLimitLLabel.setText("Capacity Exceeded");
        } else {
            showLimitLLabel.setStyle("-fx-text-fill: green;");
            showLimitLLabel.setText("Within Limit");
        }
    }

    @javafx.fxml.FXML
    public void handeBackButton(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
//            Scene nextScene = new Scene(fxmlLoader.load());
//            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//            nextStage.setTitle("Hello!");
//            nextStage.setScene(nextScene);
//            nextStage.show();
//        }
//        catch(Exception e){
//            //
//
    }

    @javafx.fxml.FXML
    public void handleCalcuateSpaceButton(ActionEvent actionEvent) {
        if (maxCapacityTextField.getText().isEmpty()) {
            error("Enter max capacity first!");
            return;
        }

        if (currentStored == 0) {
            error("Click 'Retrieve Data' first!");
            return;
        }

        int maxCap;

        try {
            maxCap = Integer.parseInt(maxCapacityTextField.getText());
        } catch (NumberFormatException e) {
            error("Capacity must be a number!");
            return;
        }

        int remaining = maxCap - currentStored;

        if (remaining < 0) remaining = 0;

        info("Available Space: " + remaining + " units");
    }
    private void error(String msg) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(msg);
        a.showAndWait();
    }

    private void info(String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(msg);
        a.showAndWait();
    }
}
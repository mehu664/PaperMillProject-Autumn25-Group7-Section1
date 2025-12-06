package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class User3Goal5Controller
{
    @javafx.fxml.FXML
    private TableView<Goal5> displayRoutesTable;
    @javafx.fxml.FXML
    private TableColumn<Goal5,String> routeOptionsCol;
    @javafx.fxml.FXML
    private TableColumn<Goal5,Integer> distanceCOl;
    @javafx.fxml.FXML
    private ComboBox<String> selectMaterialsComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectSupplierComboBox;
    @javafx.fxml.FXML
    private TableColumn<Goal5,Integer> estimatedTimeCol;
    @javafx.fxml.FXML
    private TableColumn<Goal5,Integer> costCol;

    @javafx.fxml.FXML
    public void initialize() {
        selectMaterialsComboBox.getItems().addAll("Wood","Cotton","Recycled Paper");
        selectSupplierComboBox.getItems().addAll("Supplier A", "Supplier B", "Supplier C");

        routeOptionsCol.setCellValueFactory(new PropertyValueFactory<>("routeOptions"));
        distanceCOl.setCellValueFactory(new PropertyValueFactory<>("distance"));
        estimatedTimeCol.setCellValueFactory(new PropertyValueFactory<>("estimatedTime"));
        costCol.setCellValueFactory(new PropertyValueFactory<>("cost"));

    }

    private boolean validateSelection() {
        if (selectMaterialsComboBox.getValue() == null) {
            showError("Please select a material.");
            return false;
        }

        if (selectSupplierComboBox.getValue() == null) {
            showError("Please select a supplier.");
            return false;
        }

        return true;
    }


    private boolean validateRouteData(int distance, int time, int cost) {

        if (distance <= 0) {
            showError("Distance must be greater than 0.");
            return false;
        }

        if (time <= 0) {
            showError("Estimated time must be greater than 0.");
            return false;
        }

        if (cost <= 0) {
            showError("Cost must be greater than 0.");
            return false;
        }

        return true;
    }


    private void showError(String message) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setHeaderText("Validation Error");
        a.setContentText(message);
        a.show();
    }

    private void showInfo(String message) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Success");
        a.setContentText(message);
        a.show();
    }


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

    @javafx.fxml.FXML
    public void handleVerifyFeasibilityButton(ActionEvent actionEvent) {
        if (!validateSelection()) {
            return;
        }

        showInfo("Feasibility Verified Successfully!");

    }

    @javafx.fxml.FXML
    public void optimizeRouteButton(ActionEvent actionEvent) {

        if (!validateSelection()) {
            return;
        }


        int distance = 120;
        int estimatedTime = 5;
        int cost = 500;

        if (!validateRouteData(distance, estimatedTime, cost)) {
            return;
        }


        Goal5 g = new Goal5(
                selectSupplierComboBox.getValue(),
                selectMaterialsComboBox.getValue(),
                "Highway Route - A1",
                distance,
                estimatedTime,
                cost
        );

        displayRoutesTable.getItems().add(g);
        showInfo("Route optimized and added to table!");
    }

}
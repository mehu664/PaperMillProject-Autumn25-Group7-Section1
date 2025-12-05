package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void user3Goal5Button(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3goal5-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleUser3Goal1Button(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/goal1-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void user3Goal3Button(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3goal3-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void user3Goal4Button(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3goal4-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleUser3Goal2Button(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3goal2-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleBackDashboardButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/logintry.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
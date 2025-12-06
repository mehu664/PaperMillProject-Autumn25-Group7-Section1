package cse213.group7.papermillfinal.laboni;

import cse213.group7.papermillfinal.HelloApplication;
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


/// ///////////////
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
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
//            Scene nextScene = new Scene(fxmlLoader.load());
//            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//            nextStage.setTitle("Hello!");
//            nextStage.setScene(nextScene);
//            nextStage.show();
//        }
//        catch(Exception e){
//            //
//        }
    }







    @Deprecated
    public void SafetyReportingOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/SafetyReporting.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }

    }



    @javafx.fxml.FXML
    public void TrainingSimulationOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/TrainingSimulation.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }



    }

    @javafx.fxml.FXML
    public void PlaningOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/Planning.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void ProductivityDashboardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/ProductivityDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void PerformanceReportOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/PerformanceReport.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void HRDataOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/HRData.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }

    }

    @Deprecated
    public void EmployeeRecordsOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/EmployeeRecords.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }

    }

    @Deprecated
    public void EmployeScheduleOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213/group7/papermillfinal/laboni/EmployeeSchedule.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello!");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void EmployeeScheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EmployeeRecordOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SefetyReportingOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void PaymentOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void TrackingOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void OrderProcessingOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void CustomerUpdateOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void DeliverySchedulingOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void SurveyOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void OrderReportOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void ExportOrderOA(ActionEvent actionEvent) {
    }
}
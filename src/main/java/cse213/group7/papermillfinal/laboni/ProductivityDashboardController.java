package cse213.group7.papermillfinal.laboni;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductivityDashboardController
{

    @javafx.fxml.FXML
    private TableColumn<ProductivityDashboard, String> EmployeeCol;
    @javafx.fxml.FXML
    private TableColumn<ProductivityDashboard, Integer> TasksCompletedCol;
    @javafx.fxml.FXML
    private TableColumn<ProductivityDashboard, Double> AvgTaskTimeCol;
    @javafx.fxml.FXML
    private TableColumn<ProductivityDashboard, Double> ProductivityScoreCol;
    @javafx.fxml.FXML
    private TableColumn<ProductivityDashboard, String> StatusCol;

    @javafx.fxml.FXML
    private ComboBox<String> DepartmentsCombo;
    @javafx.fxml.FXML
    private ComboBox<String> SelectPeriodCombo;
    @FXML
    private TableView<ProductivityDashboard> productivityTable;

    @javafx.fxml.FXML
    public void initialize() {


        SelectPeriodCombo.getItems().addAll("Daily", "Weekly", "Monthly");
        DepartmentsCombo.getItems().addAll("All", "Production", "Packaging", "Quality Control");


        EmployeeCol.setCellValueFactory(new PropertyValueFactory<>("employee"));
        TasksCompletedCol.setCellValueFactory(new PropertyValueFactory<>("tasksCompleted"));
        AvgTaskTimeCol.setCellValueFactory(new PropertyValueFactory<>("avgTaskTime"));
        ProductivityScoreCol.setCellValueFactory(new PropertyValueFactory<>("productivityScore"));
        StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }


    @javafx.fxml.FXML
    public void RefreshOA(ActionEvent actionEvent) {

        ObservableList<ProductivityDashboard> data = FXCollections.observableArrayList();

        data.add(new ProductivityDashboard("Hridoy", 7, 6.0));
        data.add(new ProductivityDashboard("Rahat", 9, 7.0));
        data.add(new ProductivityDashboard("Jamil", 3, 9.0));
        data.add(new ProductivityDashboard("Rahman", 5, 5.0));
        data.add(new ProductivityDashboard("Hakim", 5, 6.0));
        data.add(new ProductivityDashboard("Rahim", 30, 4.5));
        data.add(new ProductivityDashboard("Karim", 15, 5.0));
        data.add(new ProductivityDashboard("Jamal", 5, 6.0));


        productivityTable.setItems(data);
    }

    @javafx.fxml.FXML
    public void ExportReportOA(ActionEvent actionEvent) {
        System.out.println("Report Export Feature Coming Soon...");
    }

    @javafx.fxml.FXML
    public void SetAlertsOA(ActionEvent actionEvent) {
        System.out.println("Alert settings feature coming soon...");
    }

    @FXML
    public void handleBackDashboardButton(ActionEvent actionEvent) {
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
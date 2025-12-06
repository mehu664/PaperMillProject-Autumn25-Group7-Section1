package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class User4Goal3Controller
{
    @javafx.fxml.FXML
    private TextField capacityVerificationTextField;
    @javafx.fxml.FXML
    private TableColumn<User4Goal3,String> typeCol;
    @javafx.fxml.FXML
    private TableView outputTableView;
    @javafx.fxml.FXML
    private TextArea packaginPlanTextArea;
    @javafx.fxml.FXML
    private TextField batchIDTextField;
    @javafx.fxml.FXML
    private ComboBox<String> packageTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<User4Goal3,Integer> productIDCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal3,Integer> quantiyCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal3,Integer> weightCol;

    private ArrayList<User4Goal3> data = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        packageTypeComboBox.getItems().addAll("Box", "Bundle", "Roll", "Packet");

        // Setup table column bindings
        typeCol.setCellValueFactory(new PropertyValueFactory<>("packageType"));
        productIDCol.setCellValueFactory(new PropertyValueFactory<>("productId"));
        quantiyCol.setCellValueFactory(new PropertyValueFactory<>("defectCount")); // assuming defectCount = quantity
        weightCol.setCellValueFactory(new PropertyValueFactory<>("tootalProduced"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user4dashboard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showWarning(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void handleSimulateButton(ActionEvent actionEvent) {

        String batchIdStr = batchIDTextField.getText();
        String packageType = packageTypeComboBox.getValue();

        if (batchIdStr.isEmpty()) {
            showWarning("Enter batch ID");
            return;
        }

        if (packageType == null) {
            showWarning("Select package type");
            return;
        }

        int batchId;

        try {
            batchId = Integer.parseInt(batchIdStr);
        } catch (NumberFormatException e) {
            showWarning("Batch ID must be a number");
            return;
        }


        data.clear();

        data.add(new User4Goal3(packageType, batchId, 501, 100, 200, LocalDate.now()));
        data.add(new User4Goal3(packageType, batchId, 502, 75, 150, LocalDate.now()));
        data.add(new User4Goal3(packageType, batchId, 503, 50, 100, LocalDate.now()));

        outputTableView.getItems().setAll(data);

        generatePackagingPlan();
    }



    private void generatePackagingPlan() {

        int totalQty = 0;
        int totalWeight = 0;

        for (User4Goal3 item : data) {
            totalQty += item.getDefectCount();
            totalWeight += item.getTootalProduced();
        }

        double capacity = totalWeight == 0 ? 0 : (double) totalWeight / data.size();

        String report =
                "Packaging Plan Summary\n\n" +
                        "Items Processed: " + data.size() + "\n" +
                        "Total Quantity: " + totalQty + "\n" +
                        "Total Weight: " + totalWeight + "kg\n" +
                        "Average Weight per Package: " + String.format("%.2f", capacity) + "\n";

        packaginPlanTextArea.setText(report);


        if (capacity > 150) {
            capacityVerificationTextField.setText("Capacity Exceeded!");
        } else {
            capacityVerificationTextField.setText("Within Capacity");
        }

    }
}
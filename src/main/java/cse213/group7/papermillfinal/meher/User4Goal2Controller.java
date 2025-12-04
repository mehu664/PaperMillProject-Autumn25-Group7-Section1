package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class User4Goal2Controller
{
    @javafx.fxml.FXML
    private TextArea defectRateMatricsTextArea;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer>  dateCol;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableView<User4Goal2> qualityTable;
    @javafx.fxml.FXML
    private TextField alertTextField;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer> batchIdCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer> totalProducedCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal2,Integer> defectCountCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLoadButton(ActionEvent actionEvent) {
    }
}
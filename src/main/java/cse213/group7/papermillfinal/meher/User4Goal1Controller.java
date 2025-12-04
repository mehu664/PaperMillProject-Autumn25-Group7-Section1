package cse213.group7.papermillfinal.meher;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class User4Goal1Controller
{
    @javafx.fxml.FXML
    private TableColumn<User4Goal1,String> propertyCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1,String> batchIDCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1,String> productionDateCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1,String> statusCol;
    @javafx.fxml.FXML
    private TableView<User4Goal1> testResultTable;
    @javafx.fxml.FXML
    private TextField batchIDTextField;
    @javafx.fxml.FXML
    private DatePicker productionDatePicker;
    @javafx.fxml.FXML
    private TableView<User4Goal1> batchDetailsTable;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1,String>paperTypeCol;
    @javafx.fxml.FXML
    private TableColumn<User4Goal1,String> valueCol;
    @javafx.fxml.FXML
    private ComboBox<String>  paperTypeComboBox;
    @javafx.fxml.FXML
    private TextField complianceStatusTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRunTestButton(ActionEvent actionEvent) {
    }
}
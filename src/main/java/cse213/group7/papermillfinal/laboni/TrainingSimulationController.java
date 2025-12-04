package cse213.group7.papermillfinal.laboni;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrainingSimulationController {

    @javafx.fxml.FXML
    private ComboBox<String> TrainingTypeCB;

    @javafx.fxml.FXML
    private TableView<TrainingSimulation> EmployeesTV;

    @javafx.fxml.FXML
    private TableColumn<TrainingSimulation, String> NameCol;

    @javafx.fxml.FXML
    private TableColumn<TrainingSimulation, String> DepartmentCol;

    @javafx.fxml.FXML
    private TableColumn<TrainingSimulation, String> SkillCol;

    @javafx.fxml.FXML
    private TableColumn<TrainingSimulation, Integer> ExperienceCol;

    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;

    @javafx.fxml.FXML
    private CategoryAxis Score;

    @javafx.fxml.FXML
    private NumberAxis Department;

    @javafx.fxml.FXML
    private BarChart<String, Number> bcEffectiveness;

    @javafx.fxml.FXML
    private Label SuccessRateL;

    @javafx.fxml.FXML
    private Label AvgEffectivenessL;

    private ObservableList<TrainingSimulation> employeeData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        TrainingTypeCB.getItems().addAll("Safety Training", "Machine Operation", "Fire Drill");
        DepartmentCB.getItems().addAll("Weaving", "Production", "Maintenance", "Quality Control");

        NameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        DepartmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        SkillCol.setCellValueFactory(new PropertyValueFactory<>("skill"));
        ExperienceCol.setCellValueFactory(new PropertyValueFactory<>("experience"));

        employeeData.addAll(
                new TrainingSimulation("Afsana", "Weaving", "Machine", 2),
                new TrainingSimulation("Rahim", "Production", "Safety", 3),
                new TrainingSimulation("Karim", "Maintenance", "Repair", 5),
                new TrainingSimulation("Joya", "Quality Control", "Check", 7),
                new TrainingSimulation("Rahman", "Weaving", "Repair", 4),
                new TrainingSimulation("Rahat", "Quality Control", "Check", 9));

        EmployeesTV.setItems(employeeData);
    }

    @javafx.fxml.FXML
    public void StartSimulationOA(ActionEvent actionEvent) {

        if (TrainingTypeCB.getValue() == null || DepartmentCB.getValue() == null) {
            SuccessRateL.setText("Select training and department");
            return;
        }

        double successRate = Math.random() * 100;
        SuccessRateL.setText(String.format("Success Rate: %.2f%%", successRate));


        double avgExp = employeeData.stream()
                .mapToInt(TrainingSimulation::getExperience)
                .average()
                .orElse(0);

        AvgEffectivenessL.setText(String.format("Avg Experience: %.2f", avgExp));

        bcEffectiveness.getData().clear();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Effectiveness Score");

        series.getData().add(new XYChart.Data<>("Experience", avgExp));
        series.getData().add(new XYChart.Data<>("Success", successRate));

        bcEffectiveness.getData().add(series);
    }

    @javafx.fxml.FXML
    public void ResetOA(ActionEvent actionEvent) {

        TrainingTypeCB.setValue(null);
        DepartmentCB.setValue(null);
        SuccessRateL.setText("");
        AvgEffectivenessL.setText("");
        bcEffectiveness.getData().clear();
    }
}

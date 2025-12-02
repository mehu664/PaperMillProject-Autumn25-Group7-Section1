package cse213.group7.papermillfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cse213/group7/papermillfinal/laboni/EmployeeSchedule.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Employee Schedule");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

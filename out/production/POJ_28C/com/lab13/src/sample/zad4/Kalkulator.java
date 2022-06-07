package sample.zad4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Kalkulator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(getClass().getResource("Kalkulator.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Kalkulator.fxml"));
        BorderPane borderPane = fxmlLoader.load();

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }
}

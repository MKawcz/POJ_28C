package sample.zad3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Produkty extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Produkty.fxml"));
        GridPane gridPane = fxmlLoader.load();
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }
}

package sample.zad2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.Duration;
import java.time.LocalDate;

public class ObliczWiek extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        TextField nameInput = new TextField();
        nameInput.setPromptText("Podaj imie");
        DatePicker datePicker = new DatePicker();
        datePicker.setPromptText("Podaj date urodzenia");
        Button button = new Button("Oblicz");
        Label label = new Label("Tutaj pojawi sie wiek");
        vBox.getChildren().addAll(nameInput, datePicker, button, label);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();

        button.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LocalDate date = datePicker.getValue();
                int wiek = obliczWiek(date);
                label.setText(String.format("%s ma %d lat", nameInput.getText(), wiek));
            }
        });
    }

    private int obliczWiek(LocalDate date) {
        LocalDate now = LocalDate.now();
        Duration duration = Duration.between(date.atStartOfDay(), now.atStartOfDay());
        return (int)(duration.toDays()/365);
    }
}

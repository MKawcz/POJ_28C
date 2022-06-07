package sample.zad4;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class KalkulatorController implements Initializable {
    public Button secondButton;
    public Button oneButton;
    public Button clearButton;
    public TextField resultScreen;
    public Button calculateButton;
    public Button minusButton;

    private long previousNumber;
    private char operationSelected;
    private boolean isNewOperation=false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("test");
    }

    public void updateText(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource();
        resultScreen.appendText(clickedButton.getText());
    }

    public void clearScreen(ActionEvent actionEvent) {
        resultScreen.setText("");
    }

    public void add(ActionEvent actionEvent) {
        if (!resultScreen.getText().isEmpty()) {
            previousNumber = Long.parseLong(resultScreen.getText());
            resultScreen.setText("");
            operationSelected = '+';
            isNewOperation = true;
        }
    }

    public void runCalculation(ActionEvent actionEvent) {
        if (resultScreen.getText().isEmpty()){
            return;
        }
        long result;
        long currentNumber = Long.parseLong(resultScreen.getText());
        switch (operationSelected){
            case '+':
                result = previousNumber+currentNumber;
                resultScreen.setText(String.valueOf(result));
                break;
            case '-':
                if (!isNewOperation){
                    result = currentNumber-previousNumber;
                }else {
                    result = previousNumber - currentNumber;
                }
                resultScreen.setText(String.valueOf(result));
                break;
        }
        if (isNewOperation){
            previousNumber = currentNumber;
            isNewOperation=false;
        }
    }

    public void subtract(ActionEvent actionEvent) {
        if (!resultScreen.getText().isEmpty()) {
            previousNumber = Long.parseLong(resultScreen.getText());
            resultScreen.setText("");
            operationSelected = '-';
            isNewOperation = true;
        }
    }
}

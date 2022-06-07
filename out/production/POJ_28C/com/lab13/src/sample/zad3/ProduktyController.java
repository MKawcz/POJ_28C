package sample.zad3;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProduktyController implements Initializable {
    public TextField nazwaTowaruTextField;
    public TextField cenaBruttoTextField;
    public ComboBox stawkaVatCombo;
    public ComboBox skalaCombo;
    public TextField wartoscTextField;
    public TextField iloscSztukTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        skalaCombo.getItems().addAll(0.19, 0.18, 0.32);
        stawkaVatCombo.getItems().addAll(0.00, 0.05, 0.08, 0.23);
        skalaCombo.setValue(0.19);
        stawkaVatCombo.setValue(0.23);
    }

    public void updateWartosc(){
        double netto = (Double.parseDouble(cenaBruttoTextField.getText())/
                (1+Double.parseDouble(stawkaVatCombo.getValue().toString())))
                * Integer.parseInt(iloscSztukTextField.getText())
                * (1- Double.parseDouble(skalaCombo.getValue().toString()));
        wartoscTextField.setText(String.format("%.2f zl", netto));
    }
}

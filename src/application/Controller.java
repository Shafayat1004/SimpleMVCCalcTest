package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.CalcModel.CalcModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="xTextField"
    private TextField xTextField; // Value injected by FXMLLoader

    @FXML // fx:id="yTextField"
    private TextField yTextField; // Value injected by FXMLLoader

    @FXML
    private Label resultLabel;

    @FXML
    void addClicked(ActionEvent event) {
        int xVal = Integer.parseInt(xTextField.getText()), yVal = Integer.parseInt(yTextField.getText());
        //CalcModel.add2Vals(xVal, yVal);
        //resultLabel= new Label();
        resultLabel.setText(Integer.toString(xVal+yVal));
        
    }

    @FXML
    void multiplyClicked(ActionEvent event) {
        int xVal = Integer.parseInt(xTextField.getText()), yVal = Integer.parseInt(yTextField.getText());
        //CalcModel.multiply2Vals(xVal, yVal);
        //resultLabel= new Label();
        resultLabel.setText(Integer.toString(xVal*yVal));
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert xTextField != null : "fx:id=\"xTextField\" was not injected: check your FXML file 'CalcView.fxml'.";
        assert yTextField != null : "fx:id=\"yTextField\" was not injected: check your FXML file 'CalcView.fxml'.";

    }
}

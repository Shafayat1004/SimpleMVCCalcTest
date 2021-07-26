/**
 * Sample Skeleton for 'CalcView.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalcViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="xTextField"
    private TextField xTextField; // Value injected by FXMLLoader

    @FXML // fx:id="yTextField"
    private TextField yTextField; // Value injected by FXMLLoader

    @FXML
    void addClicked(ActionEvent event) {

    }

    @FXML
    void multiplyClicked(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert xTextField != null : "fx:id=\"xTextField\" was not injected: check your FXML file 'CalcView.fxml'.";
        assert yTextField != null : "fx:id=\"yTextField\" was not injected: check your FXML file 'CalcView.fxml'.";

    }
}

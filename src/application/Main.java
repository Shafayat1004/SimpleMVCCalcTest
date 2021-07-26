package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        // try{
            Parent root = FXMLLoader.load(getClass().getResource("CalcView.fxml")); 
            // scene.getStylesheets().add(getClass().getResource("application.css"));
            //Scene scene = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
            //stage.setScene(scene);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }

}

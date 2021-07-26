package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("CalcView.fxml")); 
            // scene.getStylesheets().add(getClass().getResource("application.css"));
            //Scene scene = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
            //stage.setScene(scene);
            stage.setTitle("Calculator");
            stage.setScene(new Scene(root, 720,720));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }

}

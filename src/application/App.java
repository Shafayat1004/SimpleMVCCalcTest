package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
            Scene scene = new Scene(root, 720,720);
            // scene.getStylesheets().add(getClass().getResource("application.css"));
            Image icon = new Image("icon.png");
            stage.getIcons().add(icon);
            stage.setTitle("calculator");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

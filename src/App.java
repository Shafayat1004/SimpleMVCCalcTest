import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalcView.fxml"));
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("calculator");
        stage.setWidth(720);
        stage.setHeight(720);
        stage.setResizable(false);
        stage.setX(100);
        stage.setY(100);
        stage.setScene(scene);
        stage.show();
    }
}

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CSC220FXMLApp extends Application 
{

    @Override
    public void start(Stage stage) throws java.io.IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("CSC 220 FXML Template");
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch();
    }

}
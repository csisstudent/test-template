import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller 
{
    @FXML
    Label helloLabel;

    @FXML
    private void helloAction()
    {
        helloLabel.setText("Hello");
    }
}

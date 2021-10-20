package bsu.comp152.firstjavafxmonwed;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondWindow {
    @FXML
    private Label ourMessage;

    @FXML
    public void handleButtonClick(){
        ourMessage.setText("Comp 152- lets get javaFX");
    }
}

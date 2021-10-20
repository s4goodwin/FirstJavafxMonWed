package bsu.comp152.firstjavafxmonwed;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        var newFont = Font.font(24);
        welcomeText.setFont(newFont);
        var textColor = Paint.valueOf("Green");
        welcomeText.setTextFill(textColor);
        welcomeText.setText("Welcome to JavaFX Comp 152");
    }
}
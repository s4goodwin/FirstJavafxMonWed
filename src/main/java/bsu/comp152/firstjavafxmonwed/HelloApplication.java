package bsu.comp152.firstjavafxmonwed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SecondWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400); //v and v1 is the window size
        stage.setTitle("Comp 152 first Java FX");//changes title of window
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
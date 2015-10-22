/**
 * Created by ria on 10/19/15.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {

    private HashMap<String, Parent> scenes;

    public static void main(String[] args) {
        launch(args);
    }

    public void init() throws Exception {

        scenes = new HashMap<>();

        // Setup launcher
        FXMLLoader launcherLoad = new FXMLLoader(getClass().getResource("view/launcher.fxml"));
        Parent launcherParent = launcherLoad.load();
        scenes.put("launcher", launcherParent);
    }

    @Override
    public void start(Stage primaryStage) {
    }
}

// Created by julian on 27.11.17.

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import view.TetrisDebuggerController;

import java.io.IOException;

/**
 * Zum Abschluss von JavaFx machen wir ein Debug-Programm
 * für unsere Tetris-Anwendung.
 *
 * Darin ist eine Tabelle, mit der man die einzelnen
 * Blöcke der TetrisArena einzeln setzen kann.
 *
 * Außerdem Methoden zum Aufrufen von checkTetromino, ...
 */
public class MainApp extends Application{

    private Stage primaryStage;
    private TetrisDebuggerController tetrisDebuggerController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        primaryStage.setScene(initTetrisTester());
        primaryStage.sizeToScene();
        primaryStage.setTitle("Tetris Tester :)");
        primaryStage.show();
    }

    private Scene initTetrisTester() throws IOException{
        // Load root Layout from FXML file.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/TetrisDebugger.fxml"));
        SplitPane rootLayout = loader.load();

        // Show scene with rootLayout.
        Scene scene = new Scene(rootLayout);

        // The holy Controller!
        tetrisDebuggerController = loader.getController();
        //tetrisDebuggerController.setMainApp(this);

        return scene;
    }
}

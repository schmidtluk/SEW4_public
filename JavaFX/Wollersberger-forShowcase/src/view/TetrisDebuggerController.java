package view;
// Created by julian on 01.12.17.

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Puts together the view created in SceneBuilder
 * and the ButtonFieldRegions.
 */
public class TetrisDebuggerController implements Initializable{

    // Constants
    private static final int arenaHeight = 20;
    private static final int arenaWidth = 10;
    private static final int tetrominoSize = 4;

    // Where to add the Buttons to.
    @FXML private AnchorPane tetrisArenaPane;
    @FXML private AnchorPane tetrominoPane;

    // All the Buttons for the gamefield and the tetromino.
    private ButtonFieldRegion tetrisArenaButtonField = new ButtonFieldRegion(arenaHeight, arenaWidth);
    private ButtonFieldRegion tetrominoButtonField = new ButtonFieldRegion(tetrominoSize, tetrominoSize);

    /** Make the ButtonFields be displayed. */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tetrisArenaPane.getChildren().add(tetrisArenaButtonField);
        tetrominoPane.getChildren().add(tetrominoButtonField);
    }

    /** Button
     * Sets the IntFields to only 0s. */
    @FXML
    private void clearEverything() {
        tetrisArenaButtonField.setIntField(new int[arenaHeight][arenaWidth]);
        tetrominoButtonField.setIntField(new int[tetrominoSize][tetrominoSize]);
    }
}

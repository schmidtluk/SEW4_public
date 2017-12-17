package view;
// Created by julian on 01.12.17.

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * Here be Buttons.
 *
 * (in an 2D-Array. They correspond to a
 * 2D int Array eg. the TetrisArena or a Tetromino.
 * Because the size can be changed it can be
 * used for both. )
 */
public class ButtonFieldRegion extends Region {

    /** Each button corresponds to an int.
     * The Arrays have to have the same dimensions. */
    private BlockButton[][] buttonField;
    private int[][] intField;
    private int height;
    private int width;

    /** Generates all Buttons. */
    public ButtonFieldRegion(int height, int width) {
        super();
        buttonField = new BlockButton[height][width];
        intField = new int[height][width];
        this.height = height;
        this.width = width;

        generateButtonField(height, width);
    }

    /** The generated buttons have an eventHandler that
     * calls aButtonHasBeenClicked. That changes the intField. */
    private void generateButtonField(int height, int width) {
        // A vertical stacking box that contains all the lines.
        VBox heightBox = new VBox();
        for(int h = 0; h < height; h++) {
            // Contains all buttons of one line
            HBox widthBox = new HBox();
            for(int w = 0; w < width; w++) {
                // He wants to know where he lives.
                BlockButton blockButton = new BlockButton(this, h, w);

                // I want to know the buttons in person.
                buttonField[h][w] = blockButton;
                widthBox.getChildren().add(blockButton);
            }
            heightBox.getChildren().add(widthBox);
        }
        updateAllButtons();
        super.getChildren().add(heightBox);
    }

    /** May only be called by BlockButton.
     * This changes the intField at the given position.
     * @return the value to determine the button color. */
    int aButtonHasBeenClicked(int h, int w) {
        intField[h][w] = (intField[h][w] + 1) % 2;
        return intField[h][w];
    }

    // -------------    For the future ----------------- //

    /** Sets the colors of all buttons. */
    private void updateAllButtons() {
        for(int h = 0; h < height; h++) {
            for(int w = 0; w < width; w++) {
                buttonField[h][w].setColor(intField[h][w]);
            }
        }
    }

    public int[][] getIntField() {
        return intField;
    }

    /** Can display the result of what the TetrisArena does.
     * TODO check if right size. */
    public void setIntField(int[][] field) {
        intField = field;
        updateAllButtons();
    }
}

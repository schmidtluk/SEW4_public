package view;
// Created by julian on 01.12.17.

import javafx.scene.control.Button;
import javafx.scene.text.Font;

/**
 * This is a button with a specific look
 * (square, one color)
 *
 * It can change between two or more colors,
 * correspondig to an empty or occupied block
 * in the TetrisArena.
 */
public class BlockButton extends Button{

    /** The button needs to know at what position it is
     * and what buttonFieldRegion to call on click. */
    private final ButtonFieldRegion buttonFieldRegion;
    private final int h;
    private final int w;

    /** Initialises the button. */
    public BlockButton(ButtonFieldRegion buttonFieldRegion, int h, int w) {
        super();
        this.buttonFieldRegion = buttonFieldRegion;
        this.h = h;
        this.w = w;

        // When the Button gets clicked.
        super.setOnAction(event -> onClick());

        // Make the button square and small.
        setColor(0);
        super.setFont(new Font(8.0));
        super.setText(" ");
    }

    /** Changes Color and calls the ButtonFieldRegion. */
    private void onClick() {
        int value = buttonFieldRegion.aButtonHasBeenClicked(h, w);
        setColor(value);
    }

    /** When there is no block, make the button white,
     * otherwise green. */
    public void setColor(int value) {
        if(value == 0)
            setStyle("-fx-background-color: white");
        else
            setStyle("-fx-background-color: chartreuse");
    }
}

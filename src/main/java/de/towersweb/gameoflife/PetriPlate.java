package de.towersweb.gameoflife;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class PetriPlate extends GridPane {

    public PetriPlate() {
        addButtonsToGridPane(this);
    }

    private void addButtonsToGridPane(GridPane petriPlate) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                Button button = new Button();
                petriPlate.add(button, col, row);
            }
        }
    }
}

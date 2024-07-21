package de.towersweb.gameoflife;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameOfLifeAPP extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        PetriPlate petriPlate = new PetriPlate();

        Scene scene = new Scene (petriPlate, 320, 240);
        stage.setTitle("Hello to the Game of Life!");
        stage.setScene(scene);
        stage.show();


        stage.setOnCloseRequest(event -> {
        // Hier können Sie Bereinigungsaktionen ausführen
        // Beispielsweise, um sicherzustellen, dass alle Threads beendet werden:

        // Verhindert das Standard-Schließen des Fensters
        event.consume();

        // Beendet die Anwendung
        Platform.exit();
    });
    }
    public static void main(String[] args) {
        launch();
    }
}


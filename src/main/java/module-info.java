module de.towersweb.gameoflife {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.towersweb.gameoflife to javafx.fxml;
    exports de.towersweb.gameoflife;
}
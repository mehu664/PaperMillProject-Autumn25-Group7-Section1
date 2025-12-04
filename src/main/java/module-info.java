module cse213.group7.papermillfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;



    opens cse213.group7.papermillfinal to javafx.fxml;
    exports cse213.group7.papermillfinal;
    exports cse213.group7.papermillfinal.meher;
    opens cse213.group7.papermillfinal.meher to javafx.fxml;
    exports cse213.group7.papermillfinal.laboni;
    opens cse213.group7.papermillfinal.laboni to javafx.fxml;
}
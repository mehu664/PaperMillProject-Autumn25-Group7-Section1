module cse213.group7.papermillfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse213.group7.papermillfinal to javafx.fxml;
    exports cse213.group7.papermillfinal;
    exports cse213.group7.papermillfinal.meher;
    opens cse213.group7.papermillfinal.meher to javafx.fxml;
}
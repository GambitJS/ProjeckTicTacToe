module com.example.menu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.menu to javafx.fxml;
    exports com.example.menu;
}
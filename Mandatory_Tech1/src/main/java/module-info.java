module com.example.mandatory_tech1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.graphics;


    opens com.example.mandatory_tech1 to javafx.fxml;
    exports com.example.mandatory_tech1;
}
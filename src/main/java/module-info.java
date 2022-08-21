module com.example.bytebuddy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bytebuddy to javafx.fxml;
    exports com.example.bytebuddy;
}
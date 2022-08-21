module com.example.agent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.agent to javafx.fxml;
    exports com.example.agent;
}
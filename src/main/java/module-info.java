module com.example.signupform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.signupform to javafx.fxml;
    exports com.example.signupform;
}
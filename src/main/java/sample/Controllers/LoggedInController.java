package sample.Controllers;

import sample.Utils.DB;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {
    @FXML
    private Button button_logout;

    @FXML
    private Label label_welcome;

    @FXML
    private Label label_first_app;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB.changeScene(actionEvent, "hello-view.fxml", "Log in!", null, null);
            }
        });
    }

    public void setUserInformation(String username, String firstApp){
        label_welcome.setText("Welcome " + username + "!");
        label_first_app.setText("This is your first app to login! You can recover your account password using: " + firstApp);
    }


}

package com.example.signupform.Utils;

import com.example.signupform.Controllers.LoggedInController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DB {
    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String firstApp) {
        Parent root = null;

        if (username != null && firstApp != null) {
            try{
                FXMLLoader loader = new FXMLLoader(DB.class.getResource(fxmlFile));
                root = loader.load();
                LoggedInController loggedInController = loader.getController();
                loggedInController.setUserInformation(username, firstApp);
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            try{
                root = FXMLLoader.load(DB.class.getResource(fxmlFile));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }




}

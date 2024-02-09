package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage primarystage) throws IOException {
        stg = primarystage;
        primarystage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("afterLogin.fxml"));
        primarystage.setTitle("Signup!");
        primarystage.setScene(new Scene(root, 600, 320));
        primarystage.show();

    }
    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}
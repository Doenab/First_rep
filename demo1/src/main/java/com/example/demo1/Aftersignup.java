package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Aftersignup {
    @FXML
    private Button logout;

    public void uslogout(ActionEvent event) throws IOException{
        HelloApplication m = new HelloApplication();
        m.changeScene("afterLogin.fxml");
    }
}




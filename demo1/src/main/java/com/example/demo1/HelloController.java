package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController{
    public HelloController() {

    }


    @FXML
    private Button logButton;
    @FXML
    private Label wrongLog;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication m = new HelloApplication();
        if (usernameTextField.getText().toString().equals("javacoding") && passwordPasswordField.getText().toString().equals("12345678")) {
            wrongLog.setText("successful");
            m.changeScene("afterSignup.fxml");
        } else if (usernameTextField.getText().isEmpty() && passwordPasswordField.getText().isEmpty()) {
            wrongLog.setText("Please enter your data");
        } else {
            wrongLog.setText("invalid username or password");
        }
    }
}
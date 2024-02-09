package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button submit;
    @FXML
    private Button clear;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lasttext;
    @FXML
    private TextField agetext;
    @FXML
    private TextField birthdate;
    @FXML
    private TextField gender;
    @FXML
    private TextField civil;
    @FXML
    private TextField country;
    @FXML
    private TextField email;
    @FXML
    private TextField mobilenum;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField conpassword;
    @FXML
    private Label wrongsignup;

    public void usersignup(ActionEvent event) throws IOException {
        checkSignup();
    }



    private void checkSignup() throws IOException {
        HelloApplication m = new HelloApplication();
        if (password.getText().toString().length()!=8) {
            wrongsignup.setText("please enter a password with at least 8 characters");

        } else if (firstname.getText().isEmpty() || agetext.getText().isEmpty() || country.getText().isEmpty()) {
            wrongsignup.setText("Please enter the mandatory data");
        } else if(!conpassword.getText().toString().equals(password.getText().toString())) {
            wrongsignup.setText("passwords do not match");
        }else if(mobilenum.getText().toString().length()!=10) {
            wrongsignup.setText("Please enter a valid mobile number");
        }else {
            m.changeScene("Login.fxml");
        }
    }





}






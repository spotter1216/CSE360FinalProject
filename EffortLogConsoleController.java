//package com.example.effortloggerfinal;
//
//import java.io.IOException;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.stage.Stage;
//
//public class EffortLogConsoleController {
//
//    @FXML
//    private Button btnLogEditor;
//
//    @FXML
//    private Button btnDefectLogConsole;
//
//    @FXML
//    private Button btnStartActivity;
//
//    @FXML
//    private Button btnstopActivity;
//
//    @FXML
//    private Label clockText;
//
//    @FXML
//    private Label labelMode;
//
//    @FXML
//    void openLogEditor(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("EffortLoggerEditorScene.fxml"));
//        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//
//        stage.setTitle("Effort Log Editor");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @FXML
//    void openDefectLogConsole(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("DefectConsole.fxml"));
//        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//
//        stage.setTitle("Defect Log Console");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @FXML
//    void startActivity(ActionEvent event) {
//        clockText.setStyle("-fx-background-color: green");
//        clockText.setText("Clock is Running");
//    }
//
//    @FXML
//    void stopActivity(ActionEvent event) {
//        clockText.setStyle("-fx-background-color: red");
//        clockText.setText("Clock is Stopped");
//    }
//
//    @FXML
//
//    public void setUserInput(String username) {
//        // Use the username to customize the message
//        if(username.equals("developer"))
//        {
//            labelMode.setText("You are part of the developer community");
//        }
//        else if(username.equals("supervisor"))
//        {
//            labelMode.setText("You are part of the supervisor community");
//        }
//        else if(username.equals("engineer"))
//        {
//            labelMode.setText("You are part of the engineer community");
//        }
//    }
//
//}

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EffortLogConsoleController {

    @FXML
    private Button btnLogEditor;

    @FXML
    private Button btnDefectLogConsole;

    @FXML
    private Button btnStartActivity;

    @FXML
    private Button btnstopActivity;

    @FXML
    private Label clockText;

    @FXML
    private Label labelMode;

    @FXML
    void openLogEditor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EffortLoggerEditorScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Effort Log Editor");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openDefectLogConsole(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DefectConsole.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Defect Log Console");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void startActivity(ActionEvent event) {
        clockText.setStyle("-fx-background-color: green");
        clockText.setText("Clock is Running");
    }

    @FXML
    void stopActivity(ActionEvent event) {
        clockText.setStyle("-fx-background-color: red");
        clockText.setText("Clock is Stopped");
    }

    @FXML
    public void openPlanPoker(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserStory1.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("User Story");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void startBreak(ActionEvent event) {
        clockText.setStyle("-fx-background-color: blue");
        clockText.setText("Break is Starting");
    }

    @FXML
    public void stopBreak(ActionEvent event) {
        clockText.setStyle("-fx-background-color: blue");
        clockText.setText("Break is Stopping");
    }

    public void setUserInput(String username) {
        // Use the username to customize the message
        if(username.equals("developer"))
        {
            labelMode.setText("You are part of the developer community");
        }
        else if(username.equals("supervisor"))
        {
            labelMode.setText("You are part of the supervisor community");
        }
        else if(username.equals("engineer"))
        {
            labelMode.setText("You are part of the engineer community");
        }
    }



}

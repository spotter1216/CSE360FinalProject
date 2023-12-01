package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class planningPokerController {
    @FXML
    private Button usertstory;

    @FXML
    private Button cards;

    @FXML
    private Button initialestimation;

    @FXML
    void openuserstory(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserStory1.fxml"));
        Parent root = loader.load();
        EffortLogConsoleController effortLogController = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("User Stories");
        stage.setScene(scene);
        stage.show();
    }
    void openCards(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cards2.fxml"));
        Parent root = loader.load();
        EffortLogConsoleController effortLogController = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("User Stories");
        stage.setScene(scene);
        stage.show();
    }

}

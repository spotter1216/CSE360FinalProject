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

public class UserStoryController {

    @FXML
    private Button btnEffortConsole;

    @FXML
    private Button btnNext;

    @FXML
    void openCards(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cards2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Cards");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openEffortConsole(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("EffortLogConsole.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Effort Log Console");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openPreviousProjects(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("previousprojects.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Previous Projects");
        stage.setScene(scene);
        stage.show();
    }
}

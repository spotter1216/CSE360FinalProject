package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class EfficiencyMetricsController implements Initializable{

    @FXML
    private Button btnNext;
    
    @FXML
    private ChoiceBox<String> sequenceBox;

    @FXML
    void openUSUpdate(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Screen6USUpdate.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("User Story Update");
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
    

    public void initialize (URL location, ResourceBundle resources) {
    	sequenceBox.getItems().addAll("0", "1", "2", "3", "4", "5");
    	sequenceBox.setValue("0");
    }

}

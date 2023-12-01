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
import javafx.scene.control.ChoiceBox;
import javafx.fxml.Initializable;

public class InitialEstimationController implements Initializable{

	// These are the choiceboxes that were implemented
	// They are declared here
    @FXML
    private Button btnNext;
    
    @FXML
    private ChoiceBox<String> taskComplexity;
    
    @FXML
    private ChoiceBox<String> dependencies;
    
    @FXML
    private ChoiceBox<String> teamMemberSkills;

    @FXML
    void openHLEstimation(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Screen4HLEstimationDiscussion.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("High Level Estimation");
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
    
    // This initialize method is part of javafx library, but allows the attributes to be assigned to the choiceboxes
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	// Adds the dropdown items to the choicebox
    	taskComplexity.getItems().addAll("Difficult", "Medium", "Easy");
    	// Sets a default 
    	taskComplexity.setValue("Difficult");
    	dependencies.getItems().addAll("Yes", "No");
    	dependencies.setValue("No");
    	teamMemberSkills.getItems().addAll("Coding", "UX/UI Design", "Planning", "Documentation", "Communication", "Other");
    	teamMemberSkills.setValue("Other");
    }

}

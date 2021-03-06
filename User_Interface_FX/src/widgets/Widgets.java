package widgets;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane; 

public class Widgets extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage stage){
		stage.setTitle("All widgets in one place");
		
		BorderPane border = new BorderPane(); 
		
		HBox hbox1 = new HBox(5);
		Label label = new Label("This is label"); 
		Button bt = new Button("Button"); 
		RadioButton rb = new RadioButton("Radio Button");
		ToggleButton tgb = new ToggleButton("Toggle Button"); 
		CheckBox ch = new CheckBox("CheckBox");
		ChoiceBox choice = new ChoiceBox(); 
		
		hbox1.getChildren().addAll(label,bt,rb,tgb,ch,choice);
		border.setTop(hbox1);
		Scene scene = new Scene(border,800,800);
		stage.setScene(scene);
		stage.show();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

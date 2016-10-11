package userInput;

import javafx.application.Application;
import javafx.scene.control.Button;
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
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.GridPane; 
import javafx.geometry.Insets;
import javafx.scene.control.TextField;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage stage){
		stage.setTitle("User input");
		
		Label lab = new Label("Your Name");
		TextField name = new TextField(); 
		name.setPromptText("I am prompt text"); 
		
		//Label for display text from input field 
		Label label2 = new Label("Here will be name input text");
		
		//Create button for grabing field value
		Button bt = new Button("Take Value");
		bt.setOnAction(e->isInt(name,name.getText()));
		
		HBox hb = new HBox();
		hb.getChildren().addAll(lab,name,bt,label2);
		
		Scene scene = new Scene(hb,500,500);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public boolean isInt(TextField field,String message){
		try{
			int m = Integer.parseInt(message);
			System.out.println(message);
			return true;
		}
		catch(NumberFormatException e){
			System.out.println("Error:"+message+" is not a number");
			return false;
		}
	}

}

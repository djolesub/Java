package intro;

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
import javafx.scene.layout.VBox;

public class Alert {
	
	public static void display(String title,String message) throws Exception{
		Stage stage = new Stage();
		stage.setTitle(title);
		stage.setWidth(250);
		stage.initModality(Modality.APPLICATION_MODAL);
		
		Label label1 = new Label(message); 
		Button btClose = new Button("Close"); 
		btClose.setOnAction(e->stage.close()); 
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label1,btClose);	
		layout.setAlignment(Pos.BASELINE_CENTER);
		
		Scene scene = new Scene(layout,500,500);
		stage.setScene(scene); 
		stage.showAndWait();
		} 
	
	
	
	
}
package intro;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.scene.control.Label;


public class AlertBox extends Application{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch(args);
	} 
	
	public void start(Stage stage){
		stage.setTitle("Title of The Sceen");  
		
		Button bt = new Button();
		bt.setText("Click"); 
		bt.setOnAction(e->{
			try {
				Alert.display("Window Title", "Window Message");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(bt); 
		Scene scene = new Scene(layout,500,500); 
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	
	
	
	
	
	

}

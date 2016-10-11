package multipleLayouts;

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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane; 


public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		stage.setTitle("Title of Stage-Multiple Layouts"); 
		
		//Top Menu
		HBox topMenu = new HBox(10);
		Button bt = new Button("First Menu Tab");
		Button bt1 = new Button("Second Menu Tab");
		Button bt2 = new Button("Third Menu Tab");
		Button bt3 = new Button("Fourth Menu Tab");
		topMenu.getChildren().addAll(bt,bt1,bt2,bt3);
		
		//Left Menu 
		VBox leftMenu = new VBox();
		Button btV = new Button("First");
		Button btV1 = new Button("Second");
		Button btV2 = new Button("Third");
		Button btV3 = new Button("Fourth");
		leftMenu.getChildren().addAll(btV,btV1,btV2,btV3);
		
		//Right menu 
		VBox rightMenu = new VBox();
		Label lab1 = new Label("First Label");
		Label lab2 = new Label("Second Label");
		Label lab3 = new Label("Third Label");
		Label lab4 = new Label("Fourth Label");
		rightMenu.getChildren().addAll(lab1,lab2,lab3,lab4);
		
		//Creating BorderPane 
		BorderPane border = new BorderPane(); 
		border.setTop(topMenu);
		border.setLeft(leftMenu);
		border.setRight(rightMenu);
	
		Scene scene = new Scene(border,900,900);
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

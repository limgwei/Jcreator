/**
 * @(#)MousePanelDemo.java
 *
 *
 * @author 
 * @version 1.00 2018/10/5
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.paint.*;


public class MousePanelDemo extends Application {
	Label lblYellow,lblGreen,lblBlue,lblRed;
	//override the start method in the application class

    public void start(Stage primaryStage) {
    	//create a pane and set ots properties
    	GridPane p = new GridPane();
    	p.add(lblYellow = new Label("Click me to change colour"),0,0);
    	p.add(lblGreen = new Label("Click me to change colour"),1,0);
    	p.add(lblBlue = new Label("Click me to change colour"),0,1);
    	p.add(lblRed = new Label("Click me to change colour"),1,1);
    	
    	lblBlue.setStyle("-fx-background-color: blue");
        lblRed.setStyle("-fx-background-color: red");
    	lblYellow.setStyle("-fx-background-color: yellow");
     	lblGreen.setStyle("-fx-background-color: green");
     	
     	lblGreen.setPrefSize(200,200);
     	lblBlue.setPrefSize(200,200);
     	lblRed.setPrefSize(200,200);
     	lblYellow.setPrefSize(200,200);
     	
     	//create a scene and place it in the stage
    	Scene scene = new Scene(p,300,100);//add pane to scene
    	primaryStage.setTitle("MousePanel Demo");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    	
    	lblGreen.setOnMouseClicked(e ->{
    		lblGreen.setStyle("-fx-background-color: black");
    	});
    	lblBlue.setOnMouseClicked(e ->{
    		lblBlue.setStyle("-fx-background-color: black");
    	});
    	lblRed.setOnMouseClicked(e ->{
    		lblRed.setStyle("-fx-background-color: black");
    	});
    	lblYellow.setOnMouseClicked(e ->{
    		lblYellow.setStyle("-fx-background-color: black");
    	});
    	
    	
    	lblGreen.setOnMouseExited(e ->{
    		lblGreen.setStyle("-fx-background-color: green");
    	});
    	lblBlue.setOnMouseExited(e ->{
    		lblBlue.setStyle("-fx-background-color: blue");
    	});
    	lblRed.setOnMouseExited(e ->{
    		lblRed.setStyle("-fx-background-color: red");
    	});
    	lblYellow.setOnMouseExited(e ->{
    		lblYellow.setStyle("-fx-background-color: yellow");
    	});
    	
    	//process mouse click
    	//process mouse exited
    	lblBlue.setText("dddd");
    
    	
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    
}
/**
 * @(#)CalculatorGUI1.java
 *
 *
 * @author 
 * @version 1.00 2018/10/1
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;

public class CalculatorGUIImproveVersion extends Application{
	 private TextField tfFirst = new TextField();
     private TextField tfSecond  = new TextField();
     private TextField tfResult = new TextField();
     private Button btnPlus = new Button ("+");
     private Button btnMinus = new Button ("-");
     private Button btnMultiple = new Button ("*");
     private Button btnDivided = new Button ("/");
   
    public void start(Stage primaryStage){
    	//create UI
    	GridPane p = new GridPane();
    	p.setHgap(10);
    	p.setVgap(10);
    	
    	//1st row
    	p.add(new Label("Enter first number:"),0,0);
    	p.add(tfFirst,1,0);
    	p.add(btnPlus,2,0);
    	p.add(btnMinus,3,0);
    	
    	//2nd row
    	p.add(new Label("Enter second number:"),0,1);
    	p.add(tfSecond,1,1);
    	p.add(btnMultiple,2,1);
    	p.add(btnDivided,3,1);
    	
    	//3rd row
    	p.add(new Label("Result:"),0,2);
    	p.add(tfResult,1,2);
    
    	
    	//set properties for UI
    	p.setAlignment(Pos.CENTER);
    	tfFirst.setAlignment(Pos.BOTTOM_LEFT);
    	tfSecond.setAlignment(Pos.BOTTOM_LEFT);
    	tfResult.setAlignment(Pos.BOTTOM_LEFT);
    	tfResult.setEditable(false);    
    		
    	//process events
        btnPlus.setOnAction(e -> cal("+"));
    	btnMinus.setOnAction(e -> cal("-"));
    	btnMultiple.setOnAction(e -> cal("*"));
    	btnDivided.setOnAction(e -> cal("/"));	
    	
    
    	//create a scene and place it in the stage
    	Scene scene = new Scene(p,400,250);//add pane to scene
    	primaryStage.setTitle("Calculator");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    }  

     private void cal(String x){
    	//get values from text fields
    	double w = Double.parseDouble(tfFirst.getText());
    	double h = Double.parseDouble(tfSecond.getText());
    	
    	if(x == "+"){
    		tfResult.setText(String.format("%.2f",w+h));
    	}else if(x == "-"){
    		tfResult.setText(String.format("%.2f",w-h));
    	}else if(x == "*"){
    		tfResult.setText(String.format("%.2f",w*h));
    	}else if(x == "/"){
    	    tfResult.setText(String.format("%.2f",w/h));
    	}
     }
    
   
     public static void main(String[] args) {
        Application.launch(args);
    }
}

    
    

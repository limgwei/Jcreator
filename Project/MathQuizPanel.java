/**
 * @(#)MathQuizPanel.java
 *
 *
 * @author 
 * @version 1.00 2018/10/30
 */
 import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import java.util.Random;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class MathQuizPanel extends Application{
	
	int n1,n2;
	String ope;
	int oop;
		RadioButton add=new RadioButton();
        	RadioButton minus=new RadioButton();
        	Label addi=new Label("Addition");
        	Label minuss=new Label("Substraction");
        	ToggleGroup group=new ToggleGroup();
        	Button question=new Button("Get Question");
        	Label problem =new Label("a problem");
        	Label enter=new Label("Enter answer");
        	TextField answer=new TextField();
        	Button submit=new Button("Submit");
        	TextArea con=new TextArea();
        	Button exit=new Button("Exit");
        	HBox top=new HBox(10);
        	HBox bot=new HBox(10);
        	VBox assign=new VBox(5);
public void start(Stage primaryStage){
        
        
        	problem.setStyle("-fx-text-fill:blue;");
        	
        	add.setToggleGroup(group);
        	minus.setToggleGroup(group);
        add.setSelected(true);	
        	GridPane p =new GridPane();
            
            assign.getChildren().addAll(top,bot,enter,answer,submit,con,exit);
        	top.getChildren().addAll(add,addi,minus,minuss);
        	bot.getChildren().addAll(question,problem);
        	
            p.add(assign,0,0);
            con.setPrefHeight(20);
            con.setPrefWidth(20);
        	assign.setAlignment(Pos.CENTER);
        	p.setPadding(new Insets(5,5,5,5));
        	
        	Scene scene=new Scene(p);
        	primaryStage.setTitle("Test Math Quiz Panel");
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	
        question.setOnAction(e->generate());
        submit.setOnAction(e->submit());
        exit.setOnAction(e->{
        	System.exit(0);
        });
        
        }
public void generate(){
	answer.setText(null);
	con.setText(null);
Random rand=new Random();
 n1=rand.nextInt(20)+1;
 n2=rand.nextInt(20)+1;
if(add.isSelected()){
ope="+";
}
else if(minus.isSelected()){
	ope="-";
}
problem.setText(n1+ope+n2+"=??");
}
public void submit(){
int lol=Integer.parseInt(answer.getText());
if(ope=="+"){
oop=n1+n2;
}
else if(ope=="-"){
oop=n1-n2;
}
	if(lol==oop){
		con.setText("You are correct");
	}
	else{
		con.setText("You are incorrect!\nThe correct answer is "+oop);
	}
	
}

    public MathQuizPanel() {
    }
    
    
  }
    

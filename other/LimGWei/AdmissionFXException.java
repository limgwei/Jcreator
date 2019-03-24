/**
 * @(#)AdmissionFXException.java
 *
 *
 * @author 
 * @version 1.00 2018/11/13
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
import java.util.InputMismatchException;
public class AdmissionFXException extends Application{
	static int a1=0;
	static int r1=0;
	BorderPane bp=new BorderPane();
       	GridPane gp=new GridPane();
       	Label reject=new Label("         ");
       	Label accept=new Label("         ");
       	TextField grade=new TextField();
       	TextField test=new TextField();
       	TextField result=new TextField();
       	Button check=new Button("Check");
       	Button clear=new Button("Clear");
       	Button exit=new Button("Exit");
       public void start(Stage primaryStage){
       	
       	
       	HBox top=new HBox();
       	top.getChildren().addAll(new Label("Reject"),reject,new Label("Accept"),accept);
       	HBox bot=new HBox();
       	bot.getChildren().addAll(check,clear,exit);
       	
       	gp.add((new Label("Grade Point")),0,0);
       	gp.add(grade,1,0);
       	gp.add((new Label("Test Score")),0,1);
       	gp.add(test,1,1);
       	gp.add((new Label("Result")),0,2);
       	gp.add(result,1,2);
       	
       	bp.setTop(top);
       	bp.setCenter(gp);
       	bp.setBottom(bot);
       	
       	Scene scene=new Scene(bp);
       	primaryStage.setScene(scene);
       	primaryStage.setTitle("Admission Checker");
       	primaryStage.show();
       	check.setOnAction(e->Check());
       	clear.setOnAction(e->Clear());
       	exit.setOnAction(e->{
       		System.exit(0);
       	});
       		grade.setOnKeyPressed(e->{
     			if(e.getCode().isLetterKey()){
     				Alert("number");
     			}
     		});
     		 test.setOnKeyPressed(e->{
     		 	if(e.getCode().isLetterKey()){
     			Alert("number");
     		 	}
     		 });
       } 
    /**
     * Creates a new instance of <code>AdmissionFXException</code>.
     */
     public void Check(){
     	try{
     	
     		
     		double g1=Double.parseDouble(grade.getText());
     		int t1=Integer.parseInt(test.getText());
     		if(g1>4.0){
     			Alert("Grade");
     		}
     		else if(t1>100){
     			Alert("Test");
     		}
     		else if((g1>=3.0&&t1>=60)||(g1<3.0&&t1>=80)){
     			result.setText("Accept");
     			a1++;
     			accept.setText(a1+"       ");
     		}
     		else{
     			result.setText("Reject");
     			r1++;
     			reject.setText(r1+"       ");
     		}
     	}
     	catch(NumberFormatException e){
     		
     		if(grade.getText().equals("")){
     			Alert("none");
     		}
     if(test.getText().equals("")){
     	Alert("none1");
     }
     	}
     	
     }
    public void Alert(String e){
    		Alert alert=new Alert(AlertType.INFORMATION);
     		alert.setTitle("Message");
			alert.setHeaderText(null);
			
			
     	if(e.equals("Grade")){
     	
			alert.setContentText("Invalid Grade Point input!");
		
     	}
     	else if(e.equals("Test")){
     		
     		alert.setContentText("Invalid Score input!");
     	}
     	else if(e.equals("number")){
     		alert.setContentText("Please enter number only!");
     	}
     	else if(e.equals("none")){
     		alert.setContentText("Please enter Grade Point");
     	}
     	if(e.equals("none1")){
     		alert.setContentText("Please enter Test Score");
     	}
     	alert.showAndWait();
     }
     public void Clear(){
     	reject.setText("   ");
     	accept.setText("   ");
     	grade.setText("");
     	test.setText("");
     	result.setText("");
     }
    public AdmissionFXException() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

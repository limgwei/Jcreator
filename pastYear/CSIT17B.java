/**
 * @(#)CSIT17B.java
 *
 *
 * @author 
 * @version 1.00 2018/12/11
 */
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import java.io.*;
import java.util.Scanner;
import javafx.geometry.*;
import javafx.scene.input.KeyEvent;
public class CSIT17B extends Application{
        	RadioButton resident=new RadioButton("Residential");
        	RadioButton commercial=new RadioButton("Commercial");
        	RadioButton industrial=new RadioButton("Industrial");
        	
        	TextField accountNo=new TextField();
        	TextField kwh=new TextField();
        	Label due=new Label();
        	
        	Button calc=new Button("Calculate");
        	Button clear=new Button("Clear");
        	Button save=new Button("Save");
        	Button exit=new Button("Exit");
        	
        	TextArea table=new TextArea();
        	public void start(Stage primaryStage){
        		BorderPane bp=new BorderPane();
        		GridPane gp=new GridPane();
        		
        		HBox top=new HBox();
        		top.getChildren().addAll(resident,commercial,industrial);
        		
        		gp.add(new Label("Account No"),0,0);
        		gp.add(accountNo,1,0);
        		gp.add(new Label("Kwh"),2,0);
        		gp.add(kwh,3,0);
        		
        		gp.add(new Label("Amount Due"),0,1);
        		gp.add(due,1,1);
        		
        		gp.add(calc,0,2);
        		gp.add(clear,1,2);
        		gp.add(save,2,2);
        		gp.add(exit,3,2);
        		
        		bp.setTop(top);
        		bp.setCenter(gp);
        		bp.setBottom(table);
        		
        		Scene scene=new Scene(bp);
        		primaryStage.setTitle("City Power Bill System");
        		primaryStage.setScene(scene);
        		primaryStage.show();
        		
        		ToggleGroup group=new ToggleGroup();
        		resident.setToggleGroup(group);
        		commercial.setToggleGroup(group);
        		industrial.setToggleGroup(group);
        		
        		calc.setOnAction(e->Calculate());
        		clear.setOnAction(e->Clear());
        		save.setOnAction(e->Save());
        		exit.setOnAction(e->Exit());
        		
        		table.setText("Acc No\t\t\tKwh\t\t\tType\t\t\tAmount Due");
        		
        		kwh.setOnKeyPressed(e->{
        			if(e.getCode().isLetterKey()){
        				Alert("number");
        			}
        		});
        	}
        	void Calculate(){
        	
        		String a1="";
        		
        		double totalPrice=0.0;
        		int aa=0;
        		if(accountNo.getText().equals("")){
        			Alert("acc");
        		}
        		if(kwh.getText().equals("")){
        			Alert("kwh");
        		}
        		else{
        	    aa=Integer.parseInt(kwh.getText());
        	    
        		if(resident.isSelected()){
        			totalPrice=6+(aa*0.052);
        			a1="Residential";
        		}
        		else if(commercial.isSelected()){
        			a1="Commercial";
        			if(aa<=100){
        				totalPrice=60;
        			}
        			else{
        				totalPrice=60+((aa-100)*0.045);
        			}
        		}
        		else if(industrial.isSelected()){
        			a1="Industrial";
        			if(aa<5000){
        			  if(aa<=1000){
        			  	totalPrice=76;
        			  }
        			  else{
        			  	totalPrice=76+((aa-1000)*0.028);
        			  }
        			}
        			else{
        				totalPrice=270+((aa-3000)*0.03);
        			}
        		}
        		else
        		{
        			Alert("radio");
        		}
        		due.setText(totalPrice+"");
        		table.appendText("\n"+accountNo.getText()+"\t\t\t"+kwh.getText()+"\t\t\t"+a1+"\t\t\t"+due.getText());	
        		}
        		
        		
        		
        	
        		
        	}
        	void Alert(String alerts){
        		Alert alert=new Alert(AlertType.ERROR);
        		alert.setTitle("Error");
        		if(alerts.equals("kwh")){
        			alert.setContentText("Please enter kwh");
        		}
        		else if(alerts.equals("acc")){
        			alert.setContentText("Please enter account no");
        		}
        		else if(alerts.equals("radio")){
        			alert.setContentText("Please Select Type of Users");
        		}
        		else if(alerts.equals("Save")){
        			alert=new Alert(AlertType.INFORMATION);
        			alert.setTitle("Save");
        			alert.setContentText("Record Saved");
        		}
        		else if(alerts.equals("number")){
        			alert.setContentText("Enter number only");
        		}
        		alert.showAndWait();
        	}
        	void Clear(){
        		due.setText("");
        		accountNo.setText("");
        		kwh.setText("");
        		table.setText("Acc No\t\t\tKwh\t\t\tType\t\t\tAmount Due");
        	}
        	void Exit(){
        		System.exit(0);
        	}
        	void Save(){
        		try{
        		String filename="Output.txt";
        		File f=new File(filename);
        		PrintWriter p=new PrintWriter(new FileWriter(f,false));
        		p.println(table.getText());
        		p.close();	
        		}
        		catch(IOException e){
        			
        		}
        		Alert("Save");
        		Clear();
        	}
    /**
     * Creates a new instance of <code>CSIT17B</code>.
     */
    public CSIT17B() {
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

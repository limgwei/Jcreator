/**
 * @(#)CSIT2017C.java
 *
 *
 * @author 
 * @version 1.00 2018/12/11
 */
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import java.util.Scanner;
public class CSIT2017C extends Application{
        TextField id=new TextField();
        TextField quantity=new TextField();
        
        RadioButton truck=new RadioButton("Truck");
        RadioButton ships=new RadioButton("ship");
        RadioButton rail=new RadioButton("Rail");
        RadioButton customer=new RadioButton("Customer");
        
        Label price=new Label();
        Label shipping=new Label();
        Label discount=new Label();
        Label total=new Label();
        Label totalShipping=new Label();
        Label grandTotal=new Label();
        
        Button calc=new Button("Calculate");
        Button save=new Button("Save");
        Button clear=new Button("Clear");
        Button exit=new Button("Exit");
        
        ToggleGroup group=new ToggleGroup();
        public void start(Stage primaryStage){
        	GridPane p=new GridPane();
        	BorderPane bp=new BorderPane();
        	
        	HBox top=new HBox();
        	HBox bot=new HBox();
        	
        	top.getChildren().addAll(new Label("Customer ID"),id,new Label("Quantity"),quantity);
        	bot.getChildren().addAll(new Label("Shipping"),truck,ships,rail,customer);
        	
            p.add(new Label("Unit Price"),0,0);
            p.add(price,1,0);
            p.add(new Label("Total Price"),2,0);
            p.add(total,3,0);
            
            p.add(new Label("shipping"),0,1);
            p.add(shipping,1,1);
            p.add(new Label("Total shipping"),2,1);
            p.add(totalShipping,3,1);
            
            p.add(new Label("Shippinig Discount"),0,2);
            p.add(discount,1,2);
            p.add(new Label("Grand Total"),2,2);
            p.add(grandTotal,3,2);
            
            p.add(calc,0,3);
            p.add(save,1,3);
            p.add(clear,2,3);
            p.add(exit,3,3);
            
            bp.setTop(top);
            bp.setCenter(bot);
            bp.setBottom(p);
            
            calc.setOnAction(e->Calculate());
            clear.setOnAction(e->Clear());
            exit.setOnAction(e->Exit());
            save.setOnAction(e->Save());
            
            
            truck.setToggleGroup(group);
            rail.setToggleGroup(group);
            ships.setToggleGroup(group);
            customer.setToggleGroup(group);
            
            Scene scene=new Scene(bp);
            primaryStage.setTitle("TheZone System");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        }
    /**
     * Creates a new instance of <code>CSIT2017C</code>.
     */
     void Exit(){
     	System.exit(0);
     }
     void Save(){
     	String word="";
     	if(rail.isSelected()){
     		word="OutRail.txt";
     	}
     	else if(ships.isSelected()){
     		word="OutShip.txt";
     	}
     	else if(truck.isSelected()){
     		word="OutTruck.txt";
     	}
     	else if(customer.isSelected()){
     		word="OutCustomer.txt";
     	}
     	try{
     	File f=new File(word);
     	PrintWriter p=new PrintWriter(new FileWriter(f,true));
     	p.println(grandTotal.getText());
     	p.close();	
     	}
     	catch(IOException e){
     		
     	}
     	
     	Alert("Save");
     	Clear();
     }
     void Clear(){
     	quantity.setText("");
     	id.setText("");
     	group.selectToggle(null);
     }
    void Calculate(){
    	if(id.getText().equals("")){
    		Alert("enterID");
    	};
    	String word=id.getText();
    	if(word.length()!=5){
    		Alert("Invalid");
    	}
    	else{
    		int count=0;
    	for(int i=0;i<5;i++){
    		char a=word.charAt(i);
    		if(count<2){
    		if(Character.isDigit(a)){
    			Alert("Invalid");
    			break;
    			
    		}	
    		}
    		else if(count<5){
    		if(Character.isLetter(a)){
    			Alert("Invalid");
    			break;
    		}
    		}
    		count++;
    		
    	}
    
    	if(quantity.getText().equals("")){
    		Alert("Valid");
    	}
    	else{
    	try{
    		int aa=Integer.parseInt(quantity.getText());
    		double totalPrice=0;
    		word="";
    		if(aa>=216){
    			totalPrice+=2*aa;
    			word="2.00";
    		}
    		else if(aa>=108){
    			totalPrice+=2.27*aa;
    			word="2.27";
    		}
    		else if(aa>=48){
    			totalPrice+=2.63*aa;
    			word="2.63";
    		}
    		else{
    			totalPrice+=2.85*aa;
    			word="2.85";
    		}
    		price.setText(word);
    		total.setText(totalPrice+"");
    		double ship=0;
    		if(truck.isSelected()){
    			ship=(0.2*aa);
    			word="0.2";
    		}
    		else if(rail.isSelected()){
    			ship=(0.18*aa);
    			word="0.18";
    		}
    		else if(ships.isSelected()){
    			ship=(0.12*aa);
    			word="0.12";
    		}
    		else if(customer.isSelected()){
    			word="0.0";
    		}
    		else{
    			word="0.0";
    		}
    		totalPrice+=ship;
    		shipping.setText(word);
    		totalShipping.setText(ship+"");
    		
    		double forDiscount=0;
    		if(totalPrice>=1200){
    			forDiscount=totalPrice/4.0;
    		   
    		}
    		else if(totalPrice>=400){
    			forDiscount=totalPrice*15.0/100.0;
    			
    		}
    		word=forDiscount+"";
    	   totalPrice-=forDiscount;
    		discount.setText(word);
    		grandTotal.setText(totalPrice+"");	
    	}
    	
    	catch(NumberFormatException e){
    		Alert("Valid");
    	}	
    	}
    	
    		
    	}
    	
    
    	
    }
     
    public CSIT2017C() {
    }
    void Alert(String alerts){
    	Alert alert=new Alert(AlertType.ERROR);
    	alert.setTitle("Error");
    	if(alerts.equals("Valid")){
    		alert.setContentText("Please enter valid quantity");	
    	}
    	else if(alerts.equals("Invalid")){
    		alert.setContentText("Invalid Customer ID");
    	}
    	else if(alerts.equals("enterID")){
    		alert.setContentText("Please enter Customer ID");	
    	}
    	else if(alerts.equals("Save")){
    		 alert=new Alert(AlertType.INFORMATION);
    		 alert.setTitle("Save");
    		 if(rail.isSelected()){
    		 	alert.setContentText("Rail Record Saved");
    		 }
    		 else if(ships.isSelected()){
    		 	alert.setContentText("Ship Record Saved");
    		 }
    		 else if(truck.isSelected()){
    		 	alert.setContentText("Truck Record Saved");
    		 }
    		 else if(customer.isSelected()){
    		 	alert.setContentText("Customer Record Saved");
    		 }
    	}
    
    	alert.showAndWait();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

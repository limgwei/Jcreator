/**
 * @(#)Golf.java
 *
 *
 * @author 
 * @version 1.00 2018/12/6
 */
 import javafx.scene.control.Alert;
 import javafx.scene.control.Alert.AlertType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Golf extends Application{
        TextField id=new TextField();
       TextField quantity=new TextField();
        RadioButton truck=new RadioButton("Truck");
        RadioButton ship=new RadioButton("Ship");
        RadioButton rail=new RadioButton("Rail");
        RadioButton customer=new RadioButton("Customer");
        Label price=new Label();
        Label shipping=new Label();
        Label discount=new Label();
        Label totalPrice=new Label();
        Label totalShipping=new Label();
        Label grandTotal=new Label();
        Button calc=new Button("Calculate");
        Button save=new Button("Save");
        Button clear=new Button("Clear");
        Button exit=new Button ("Exit");
    /**
     * Creates a new instance of <code>Golf</code>.
     */public void start(Stage primaryStage){
     	
     		BorderPane bp=new BorderPane();
         	GridPane p=new GridPane();
         	
         	HBox top=new HBox();
         	HBox mid=new HBox();
        
         	top.getChildren().addAll(new Label("Customer ID"),id,new Label("Quantity"),quantity);
         	mid.getChildren().addAll(new Label("Shipping"),truck,ship,rail,customer);
         	
         	ToggleGroup tg=new ToggleGroup();
         	truck.setToggleGroup(tg);
         	ship.setToggleGroup(tg);
         	rail.setToggleGroup(tg);
         	customer.setToggleGroup(tg);
         	
            p.add(new Label("Unit Price"),0,0);
            p.add(price,1,0);
            p.add(new Label("Total Price"),2,0);
            p.add(totalPrice,3,0);
            
            p.add(new Label("Unit Shippinf"),0,1);
            p.add(shipping,1,1);
            p.add(new Label("Total Shipping"),2,1);
            p.add(totalShipping,3,1);
            
            p.add(new Label("Shipping Discount"),0,2);
            p.add(discount,1,2);
            p.add(new Label("Grand Total"),2,2);
            p.add(grandTotal,3,2);
            
            p.add(calc,0,3);
            p.add(save,1,3);
            p.add(clear,2,3);
            p.add(exit,3,3);
            
            bp.setTop(top);
            bp.setCenter(mid);
            bp.setBottom(p);
            
            Scene scene=new Scene(bp);
            primaryStage.setTitle("TheZone System");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            calc.setOnAction(e->Calculate());
         }
    public Golf() {
    }
     void Calculate(){
    	double perprice=0.0;
        int count=Integer.parseInt(quantity.getText());
    	double unit=0;
    	String ans="";
    	double diss=0;
    	if(count>=216){
    		ans="2.0";
    		perprice=count*2;
    	}
    	else if(count>=108){
    		ans="2.27";
    		perprice=count*2.27;
    	}
    	else if(count>=48){
    		ans="2.63";
    		perprice=count*2.63;
    	}
    	else{
    		ans="2.85";
    		perprice=count*2.85;
    	}
    	price.setText(ans);
    	totalPrice.setText(perprice+"");
    	if(truck.isSelected()){
    		ans="0.2";
    	     unit=0.2*count;
    	}
    	else if(rail.isSelected()){
    	unit=0.18*count;
    	ans="0.18";
    		
    	}
    	else if(ship.isSelected()){
    	unit=0.12*count;
    	ans="0.12";
    	}
    	else{
    		ans="0.0";
    	}
    	shipping.setText(ans);
    	totalShipping.setText(unit+"");
    	perprice+=unit;
    	if(perprice>=1200){
    		perprice=perprice*3/4;
    		ans="25%";
    	}
    	else if(perprice>=400){
    		perprice=perprice*0.85;
    		ans="15%";
    	}
    	else{
    		ans="0";
    	}
    	discount.setText(ans);
    	grandTotal.setText(perprice+"");
    	
    }
    void Save(){
    	String file="scoreOver90.txt";
    	File f=new File(file);
    	Scanner input=new Scanner(f,true);
    	int count=0;
    	while(input.hasNext()){
    		int s=Integer.parseInt(input.nextLine());
    		if(s>=90){
    			
    		}
    		
    	}
    	
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Application.launch(args);
    }
}

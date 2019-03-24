/**
 * @(#)MyGUIApp.java
 *
 *
 * @author 
 * @version 1.00 2018/10/1
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

public class BarrenCommunityFX extends Application{

		Label lblAge,lblFee;
	TextField tfAge, tfFee;
	Button btnDisplay,btnExit;
 RadioButton rbMem, rbNonMem;
    public void start(Stage primaryStage){
    	
    	BorderPane p = new BorderPane();
    
    	//add button into HBox 
    	HBox p4Button = new HBox(60);
    	btnDisplay = new Button("Display");
    	btnExit =new Button("Exit");
    	p4Button.getChildren().addAll(btnDisplay, btnExit);
    	p4Button.setAlignment(Pos.CENTER);
    	//add HBox into BorderPane
    	p.setBottom(p4Button); 
    
    	
    	//add radioButton into HBox
    	HBox p4RadioButtons = new HBox(20);
    	p4RadioButtons.setPadding(new Insets(5,5,5,5));    
    	
    	rbMem= new RadioButton("Member");
    	rbNonMem = new RadioButton("Non Member");    	
    	p4RadioButtons.getChildren().addAll(rbMem,rbNonMem);
    	p.setCenter(p4RadioButtons);
    	
    	ToggleGroup group = new ToggleGroup();
    	rbMem.setToggleGroup(group);
    	rbNonMem.setToggleGroup(group);
    	    	
    	//add textfield and label into GridPane
    	GridPane p4TextField = new GridPane();
    	p4TextField.setHgap(5);
    	p4TextField.setVgap(5);
    	
    		//1st row
    	p4TextField.add(lblAge=new Label("Age:"),0,0);
    	p4TextField.add(tfAge=new TextField(),1,0);
    	//2nd row
    	p4TextField.add(lblFee =new Label("Fee:"),0,1);
    	p4TextField.add(tfFee=new TextField(),1,1);
    	tfFee.setEditable(false);
    	p4TextField.setAlignment(Pos.CENTER);
    	p.setTop(p4TextField);
        	
    		//create a scene and place it in the stage
    	Scene scene = new Scene(p);//add pane to scene
    	primaryStage.setTitle("Show Label with Graphic");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    	btnDisplay.setOnAction(e->Calc());
    }
    private void Calc(){
    	int age;
    	try{
    	 age=Integer.parseInt(tfAge.getText());
    	 if(rbMem.isSelected()){
    	if(age>=60){
    	tfFee.setText("10");	
    	}
    	else if(age<60){
    		tfFee.setText("15");
    	}
    	
    }
    else if(rbNonMem.isSelected()){
    	tfFee.setText("20");
    }
    else{
    	lol(1);
    }
    }
    catch(NumberFormatException ex){
    	lol(0);
    }
    
    
    }
    
    public void lol(int num){
    if(num==0){
    
    	Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Test Connection");
        alert.setHeaderText("Results:");
        alert.setContentText("Connect to the database successfully!");
 tfFee.setText("");
 tfAge.setText("");
        alert.showAndWait();
    }
    else if(num==1){
    	
    	Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Test Connection");
        alert.setHeaderText("Results:");
        alert.setContentText("Connect to the database successfully!");
 tfFee.setText("");
 tfAge.setText("");
        alert.showAndWait();
    }
    
    }
     public static void main(String[] args) {
        Application.launch(args);
    }
}
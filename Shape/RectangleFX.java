/**
 * @(#)RectangleFX.java
 *
 *
 * @author 
 * @version 1.00 2018/9/28
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javax.swing.*;
import javafx.scene.input.KeyCode;

public class RectangleFX extends Application{
        
    /**
     * Creates a new instance of <code>RectangleFX</code>.
     *
     */private Button lol=new Button("lol");
     private Button lol2=new Button("lol2");
     	private TextField tfWidth=new TextField();
    	private TextField tfHeight=new TextField();
    	private TextField tfArea=new TextField();
    	private Button btnCalculate = new Button("Calculate");
    	private Button btnClear= new Button("Clear");
    	
    		public void start(Stage primaryStage){
    		GridPane p =new GridPane();
    		p.setHgap(5);//stand for horinzontal
    		p.setVgap(5);//stand for vertical
    		
    		//1st row
    		p.add(new Label("Width:"),0,0);
    		p.add(tfWidth,1,0);
    		
    		//2nd row
    		p.add(new Label("Height:"),0,1);
    		p.add(tfHeight,1,1);
    		
    		//3rd row
    		p.add(new Label("Area:"),0,2);
    		p.add(tfArea,1,2);
    		
    		//4th row 
    		p.add(btnCalculate,0,3);
    		p.add(btnClear,1,3);
    		
    		//5th row
    		p.add(lol,0,4);
    		p.add(lol2,1,4);
    		//set properties for UI
    		p.setAlignment(Pos.CENTER);
    		tfWidth.setAlignment(Pos.BOTTOM_RIGHT);
    		tfHeight.setAlignment(Pos.CENTER);
    		tfArea.setAlignment(Pos.BOTTOM_RIGHT);
    		tfArea.setEditable(false);
    		
    		//process events
    		btnCalculate.setOnAction(f -> calculateRectangle());
    		btnClear.setOnAction(f ->clear());
    		
    		
    		//process key event
    		tfWidth.setOnKeyPressed(f->{
    		
    		if(f.getCode().isLetterKey()){
    			Alert alert=new Alert(Alert.AlertType.ERROR);
    			alert.setTitle("Invalid Data");
    			alert.setHeaderText(null);
    			alert.setContentText("Enter number only!");
    			alert.showAndWait();
    		
    			tfWidth.setText(null);
    		}
    		
    		});
    		//create a scene and place it in the stage
    		Scene scene=new Scene(p,400,250);//add pane to scene
    		primaryStage.setTitle("Rectangle Calculator");//set the stage title
    		primaryStage.setScene(scene);//place the scene in the stage
    		primaryStage.show();//display the stage
    		}
    		private void calculateRectangle(){
    			//get values from text fields
    			double w=Double.parseDouble(tfWidth.getText());
    			double h=Double.parseDouble(tfHeight.getText());
    			tfArea.setText(String.format("%.2f",w*h));
    		}
    		
    		public void clear()
    			{
    			tfWidth.setText(null);
    			tfHeight.setText(null);
    			tfArea.setText(null);
    		}
    public RectangleFX(){
    
    	
    	
    
    	}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
        
    }
}

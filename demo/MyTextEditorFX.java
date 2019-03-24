/**
 * @(#)MyJavaFX.java
 *
 *
 * @author 
 * @version 1.00 2018/9/27
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.input.KeyCode;
import java.io.*;
import javax.swing.*;
import java.util.*;


public class MyTextEditorFX extends Application{
        private TextField tfFileName = new TextField();        
        private Button btnLoad = new Button("Load");       
        private Button btnSave = new Button("Save");
        private TextArea taBox = new TextArea();
      
    @Override//override the start method in the application class
    public void start(Stage primaryStage){
    	BorderPane b = new BorderPane();       	
    	
    	HBox h = new HBox();
    	h.getChildren().addAll(btnLoad,tfFileName, btnSave);
    	h.setAlignment(Pos.CENTER);
    	b.setTop(h);
    	
    	HBox hTA = new HBox();    
    	taBox.setWrapText(true);    	
    	//create a scroll pane to hold the text area
    	ScrollPane sp = new ScrollPane(taBox);
    	
    	hTA.getChildren().addAll(sp);
    	b.setBottom(hTA);
    	//process button events
    	btnLoad.setOnAction(e -> load());    
    	btnSave.setOnAction(e -> save());    	
    
    	
    	//create a scene and place it in the stage
    	Scene scene = new Scene(b,300,250);//add pane to scene
    	primaryStage.setTitle("My Text Editor");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    } 
    private void displayError(){
    		Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Invalid Data");
			alert.setHeaderText(null);
			alert.setContentText("Enter number only!");					
			alert.showAndWait();    	
    } 
   
     public static void main(String[] args) {
        Application.launch(args);
    }
    private void load(){
    	String filename=tfFileName.getText();
    	try{
    	Scanner s=new Scanner(new File(filename));
    	String output="";
    	while(s.hasNext()){
    		output+=s.nextLine()+"\n";
    	}
    	taBox.setText(output);
    	s.close();
    	}
    	catch(FileNotFoundException e){
    		Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Invalid Data");
			alert.setHeaderText(null);
			alert.setContentText("Cant read");					
			alert.showAndWait();   
    	}
    }
    private void save(){
    		String filename=tfFileName.getText();
    	File f=new File(filename);
    	try{
    	PrintWriter output=new PrintWriter(new FileWriter(f));
    	Scanner s=new Scanner(taBox.getText());
    	while(s.hasNext()){
    		String out=s.nextLine();
    		output.println(out);
    	}
    	output.close();
    	s.close();
    	JOptionPane.showMessageDialog(null,"Record Saved!");
    	}
    	catch(IOException e){
    		Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Invalid Data");
			alert.setHeaderText(null);
			alert.setContentText("Cant save");					
			alert.showAndWait();
    		
    	
    	
    }
    
}
}


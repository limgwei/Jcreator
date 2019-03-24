/**
 * @(#)MouseEventDemo.java
 *
 *
 * @author 
 * @version 1.00 2018/10/5
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
public class MouseEventDemo extends Application{
        
    /**
     * Creates a new instance of <code>MouseEventDemo</code>.
     */
    
    	
    	public void start(Stage primaryStage){
    		Pane p=new Pane();
    		Text t=new Text(20,20,"Mouse Event Demo");
    		p.getChildren().addAll(t);
    		
    		Scene scene=new Scene(p,300,100);
    		primaryStage.setTitle("Mouse Event Demo");
    		primaryStage.setScene(scene);
    		primaryStage.show();
    		
    		scene.setOnMouseClicked(e->{
    			t.setText("Mouse clicked the text at "+e.getX()+","+e.getY());
    			});
    			
    		t.setOnMouseDragged(e->{
    		
    			t.setText("Mouse dragged the text");
    		});	
    		t.setOnMouseEntered(e->{
    			t.setText("Mouse enter the text");
    		});
    		t.setOnMouseExited(e->{
    			t.setText("Mouse exit the text");
    		});	
    		t.setOnMouseReleased(e->{
    		
    			t.setText("Mouse release the text");
    		});	
    }
    public MouseEventDemo(){
    	
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

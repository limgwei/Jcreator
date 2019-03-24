/**
 * @(#)MouseEvent.java
 *
 *
 * @author 
 * @version 1.00 2018/10/9
 */
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.*;
public class MouseEvent extends Application{
        public void start(Stage primaryStage){
        	Pane p=new Pane();
        	Text t=new Text(20,20,"Mouse Demo");
        	p.getChildren().addAll(t);
        	Scene scene =new Scene(p,200,200);
        	
        	primaryStage.setTitle("Mouse Event Demo");
        	
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	
        	
        	t.setOnMouseClicked(e->{
        		t.setText("Mouse Clicked the text"+e.getX());
        	});
        	t.setOnMouseDragged(e->{
        			t.setText("Mouse Dragged the text");
        		});
        	t.setOnMouseEntered(e->{
        		t.setText("Mouse enter the text");
        	});
        	t.setOnMouseExited(e->{
        		t.setText("Mouse Exited");
        	});
        		
        }
    /**
     * Creates a new instance of <code>MouseEvent</code>.
     */
    public MouseEvent() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

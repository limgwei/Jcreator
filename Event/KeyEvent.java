/**
 * @(#)KeyEvent.java
 *
 *
 * @author 
 * @version 1.00 2018/10/9
 */
 import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.application.Application;
public class KeyEvent extends Application{
        public void start(Stage primaryStage){
        
        Pane p=new Pane();
        Text a=new Text(20,20,"f");
        p.getChildren().addAll(a);
        
        Scene scene=new Scene(p,200,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Key Event");
        primaryStage.show();
        a.requestFocus();
      
        a.setOnKeyPressed(e->{
        	
        
        	switch(e.getCode()){
        	
        	case DOWN:a.setY(a.getY()+10);break;
        	case UP:a.setY(a.getY()-10);break;
        	case LEFT:a.setX(a.getX()-10);break;
        	case RIGHT:a.setX(a.getX()+10);break;
        	case Q:a.setX(a.getX()-10);a.setY(a.getY()-10);break;
        	
        	}
        	
        	
        		
        });
       
        }
    /**
     * Creates a new instance of <code>KeyEvent</code>.
     */
    public KeyEvent() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        Application.launch(args);
    }
}

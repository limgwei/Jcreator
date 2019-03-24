/**
 * @(#)KeyEvent.java
 *
 *
 * @author 
 * @version 1.00 2018/12/12
 */
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.layout.*;
public class KeyEvent extends Application{
        public void start(Stage primaryStage){
        Pane p=new Pane();
        	TextField f=new TextField("lol");
        	
        	p.getChildren().addAll(f);
f.setOnKeyPressed(e->{
        		switch(e.getCode()){
        			case UP:f.setText("UP");break;
        			case DOWN:f.setText("down");break;
        			case LEFT:f.setText("left");break;
        			case BACK_SPACE:f.setText("back");break;
        			case ENTER:f.setText("enter");break;
        			default:f.setText("No");break;
        		}
        	});
        	
        	Scene scene=new Scene(p);
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	
        	f.requestFocus();
        	
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
        // TODO code application logic here
        Application.launch(args);
        
    }
}

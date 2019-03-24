/**
 * @(#)KeyEventDemo.java
 *
 *
 * @author 
 * @version 1.00 2018/10/5
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.text.*;

        
    /**
     * Creates a new instance of <code>KeyEventDemo</code>.
     */
    public class KeyEventDemo extends Application{
    	public void start(Stage primaryStage){
    		Pane p=new Pane();
    		Text t=new Text(20,20,"A");
    		p.getChildren().add(t);
    		
    		t.setOnKeyPressed(e->{
    			switch(e.getCode()){
    				case DOWN:t.setY(t.getY()+10);break;
    				case UP:t.setY(t.getY()-10);break;
    				case LEFT:t.setX(t.getX()-10);break;
    				case RIGHT:t.setX(t.getX()+10);break;
    			}
    		});
    		//create a scene and place it in the stage
    		Scene scene = new Scene(p,300,200);//add pane to scene
    		primaryStage.setTitle("KeyEvent Demo");//set the stage title
    		primaryStage.setScene(scene);//place the scene in the stage
    		primaryStage.show();//display the stage
    		t.requestFocus();//text is focused to receive key input
    	}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

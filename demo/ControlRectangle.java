/**
 * @(#)ControlRectangle.java
 *
 *
 * @author 
 * @version 1.00 2018/10/26
 */
 import javafx.scene.control.*;
 import javafx.scene.shape.*;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
import javafx.scene.paint.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
public class ControlRectangle extends Application{
        Rectangle c;
        public void start(Stage primaryStage){
        	Pane rectP=new Pane();
        	c=new Rectangle(50,50,20,20);
        	rectP.getChildren().add(c);
        	c.setStroke(Color.BLACK);
        	c.setFill(Color.GREEN);
        	
        	HBox hBox=new HBox();
        	hBox.setSpacing(10);
        	hBox.setAlignment(Pos.CENTER);
        	Button btnEnlarge=new Button("Enlarge");
        	Button btnShrink=new Button("Shrink");
        	hBox.getChildren().addAll(btnEnlarge,btnShrink);
        	btnEnlarge.setOnAction(new EnlargeHandler());
        	btnShrink.setOnAction(new ShrinkHandler());
        	
        	BorderPane p=new BorderPane();
        	p.setBottom(hBox);
            p.setCenter(rectP);
        	
        	
        	Scene scene=new Scene(p,200,200);
        	primaryStage.setTitle("Control Rectangle");
        	primaryStage.setScene(scene);
        	primaryStage.show();
        }
        
        class EnlargeHandler implements EventHandler<ActionEvent>{
        	public void handle(ActionEvent e){
        		c.setWidth(c.getWidth()+20);
        		c.setHeight(c.getHeight()+20);
        	}
        }
        class ShrinkHandler implements EventHandler<ActionEvent>{
        	public void handle(ActionEvent e){
        		c.setWidth(c.getWidth()>20?c.getWidth()-20:c.getWidth());
        		c.setHeight(c.getHeight()>20?c.getHeight()-20:c.getHeight());
        	}
        }
    /**
     * Creates a new instance of <code>ControlRectangle</code>.
     */
    public ControlRectangle() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

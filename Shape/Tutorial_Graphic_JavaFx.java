/**
 * @(#)Tutorial_Graphic_JavaFx.java
 *
 *
 * @author 
 * @version 1.00 2018/10/29
 */
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.shape.*;

public class Tutorial_Graphic_JavaFx extends Application{
        Circle r;
        public void start(Stage primaryStage)
        	{
        r=new Circle(250,250,10);
        Pane circle=new Pane();
        circle.getChildren().add(r);
        r.setStroke(Color.BLACK);
        r.setFill(Color.GREEN);
        
        BorderPane p=new BorderPane(circle);
        HBox l=new HBox(20);
        Button ic=new Button("increase");
        Button dc=new Button("decrease");
        Button reset=new Button("reset");
        l.getChildren().addAll(ic,dc,reset);
        
        p.setBottom(l);
        Scene scene=new Scene(p,500,500);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        	
        ic.setOnAction(e->{
        	r.setRadius(r.getRadius()+10);
        });
        dc.setOnAction(e->{
        	r.setRadius(r.getRadius()>10?r.getRadius()-10:r.getRadius());
        });
        reset.setOnAction(e->{
        	r.setRadius(10);
        });
        	
        	
        	
        	
        	
        	
        }
    /**
     * Creates a new instance of <code>Tutorial_Graphic_JavaFx</code>.
     */
    public Tutorial_Graphic_JavaFx() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

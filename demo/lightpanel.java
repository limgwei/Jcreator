/**
 * @(#)lightpanel.java
 *
 *
 * @author 
 * @version 1.00 2018/10/22
 */
import javafx.scene.input.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.geometry.*;
public class lightpanel extends Application{
        Button on=new Button("on");
        Button off=new Button ("off");
        	Label lblImage;
        	Image imgOn,imgOff;
        	
        public void start(Stage primaryStage){
        	imgOn=new Image("Light_on.PNG");
        	imgOff=new Image("Light_off.PNG");
        	
        	GridPane p=new GridPane();
        	p.setAlignment(Pos.CENTER);
        	p.setHgap(20);
        	p.setVgap(20);
        	
        	p.add(on,0,0);
        	p.add(off,1,0);
        	p.add(lblImage=new Label(),2,0);
        	
        	lblImage.setGraphic(new ImageView(imgOff));
        	lblImage.setStyle("fx-background-color:lightgrey");
        	
        		Scene scene = new Scene(p);//add pane to scene
    	primaryStage.setTitle("Rectagle Calculator");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    	lblImage.setOnMouseEntered(e->{
    		lblImage.setGraphic(new ImageView(imgOn));
    	});
    	lblImage.setOnMouseExited(e->{
    		lblImage.setGraphic(new ImageView(imgOff));
    	});
        	on.setOnAction(e->{
        		lblImage.setGraphic(new ImageView(imgOn));
        		lblImage.setStyle("-fx-background-color:yellow");
        	});
        		off.setOnAction(e->{
        			lblImage.setGraphic(new ImageView(imgOff));
        		});
        		
        		scene.setOnKeyPressed(e->{
        			if(e.getCode()==KeyCode.UP){
        				lblImage.setGraphic(new ImageView(imgOn));
        				
        			}
        		
        		else if(e.getCode()==KeyCode.DOWN){
        			lblImage.setGraphic(new ImageView(imgOff));
        		}
        });
        }
    /**
     * Creates a new instance of <code>lightpanel</code>.
     */
    public lightpanel() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

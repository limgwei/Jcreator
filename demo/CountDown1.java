/**
 * @(#)CountDown1.java
 *
 *
 * @author 
 * @version 1.00 2018/11/19
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class CountDown1 extends Application{
       static Label l=new Label();
    /**
     * Creates a new instance of <code>CountDown1</code>.
     */
    public CountDown1() {
    }
    
    /**
     * @param args the command line arguments
     */
     
     public void start(Stage primaryStage){
     	GridPane p=new GridPane();
     	Button b=new Button("start");
     	
     	p.add(b,0,0);
     	p.add(l,1,0);
     	
     	Scene scene=new Scene(p);
     	primaryStage.setTitle("lol");
     	primaryStage.setScene(scene);
     	primaryStage.show();
     	b.setOnAction(e->startTask());
     }
    public static void main(String[] args) {
        // TODO code application logic here
       Application.launch(args);
        
    }
    public static void startTask(){
    	Runnable task=new Runnable(){
    		public void run(){
    			runTask();
    		}};
    		Thread bg=new Thread(task);
    		bg.setDaemon(true);
    		bg.start();
    	}
    
    public  static void runTask(){
    	for(int i=50;i>=0;i--){
    		try{
    			String status="CountDown"+i;
    			Platform.runLater(new Runnable(){
    				public void run(){
    				l.setText(status);
    				}
    			});
    			Thread.sleep(500);
    		}
    		catch(InterruptedException e){
    			e.printStackTrace();
    		}
    	}
    }
    
}

/**
 * @(#)sortlol.java
 *
 *
 * @author 
 * @version 1.00 2018/11/19
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
public class sortlol extends Application{
       static TextArea tx=new TextArea("");
       static Button a=new Button("get");
       static Button b=new Button("sort");
    /**
     *
     * Creates a new instance of <code>sortlol</code>.
     */
     public void start(Stage primaryStage){
     	GridPane p=new GridPane();
     p.add(a,0,0);
     p.add(b,1,0);
     p.add(tx,0,1);
     
     Scene scene=new Scene(p);
     primaryStage.setScene(scene);
     primaryStage.show();
     	a.setOnAction(e->{
     		int r1=(int)(Math.random()*9);
     		tx.appendText(r1+"\n");
     	});
     }
    public sortlol() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
        
    }
}

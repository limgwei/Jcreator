/**
 * @(#)CircleFX.java
 *
 *
 * @author 
 * @version 1.00 2018/9/28
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;


public class CircleFX extends Application{
        private Button btnCalculate=new Button("Calculate");
        private Button btnClear=new Button("Clear");
         private TextField Rad=new TextField();
         private TextField Area=new TextField();
       
      public void start(Stage primaryStage){ 
      	GridPane a=new GridPane();
       a.setHgap(2);
       a.setVgap(2);
       
       a.add(new Label("Radius"),0,0);
       a.add(Rad,1,0);
       
       a.add(new Label("Area"),0,1);
       a.add(Area,1,1);
       
       a.add(btnCalculate,0,2);
       a.add(btnClear,1,2);
       
       a.setAlignment(Pos.CENTER);
       Rad.setAlignment(Pos.BOTTOM_RIGHT);
       Area.setAlignment(Pos.BOTTOM_RIGHT);
       Area.setEditable(false);
       
       btnCalculate.setOnAction(e ->Calculate());
       btnClear.setOnAction(e->Clear());
       
       Scene l=new Scene(a,300,300);
       primaryStage.setTitle("Circle Area");
       primaryStage.setScene(l);
       primaryStage.show();
         
    /**
     * Creates a new instance of <code>CircleFX</code>.
     */
      }
    public CircleFX() {
    	
    }
    private void Calculate(){
    	double rad=Double.parseDouble(Rad.getText());
    	Area.setText(String.format("%.2f",(2*3.14159*rad)));
    }
    private void Clear(){
    	Area.setText("");
    	Rad.setText(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

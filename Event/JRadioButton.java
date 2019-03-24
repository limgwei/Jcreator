/** 
 * @(#)JRadioButton.java
 *
 *
 * @author 
 * @version 1.00 2018/10/5
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javax.swing.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class JRadioButton extends Application{
	public void start(Stage primaryStage)
	{
	Button cal=new Button("Calculate");
	Button cle=new Button("Clear");
	TextField age=new TextField();
	BorderPane b =new BorderPane();
	TextField fee=new TextField();
    
    GridPane p=new GridPane();
     RadioButton m =new RadioButton("Member");
     RadioButton nm =new RadioButton("Non-Member");
     HBox p4Button=new HBox(20);
    
     p4Button.getChildren().addAll(m,nm );
    p4Button.setPadding(new Insets(5,5,5,5));
    	ToggleGroup group = new ToggleGroup();
    	m.setToggleGroup(group);
    	nm.setToggleGroup(group);
    p.add(new Label("Age:"),0,0);
    p.add(age,1,0);
    p.add(new Label("Fee:"),0,1);
    p.add(fee,1,1);	
    b.setTop(p);
     p.setAlignment(Pos.CENTER);
    b.setCenter(p4Button); 
   p4Button.setAlignment(Pos.CENTER);  
      Scene scene=new Scene(b,200,100);//add pane to scene
    		primaryStage.setTitle("Rectangle Calculator");//set the stage title
    		primaryStage.setScene(scene);//place the scene in the stage
    		primaryStage.show();//display the stage
    		
    		  HBox button=new HBox(20);
	  button.getChildren().addAll(cal,cle);
	  b.setBottom(button);
	  button.setAlignment(Pos.CENTER);
	 
	  fee.setEditable(false);
	  
	 cal.setOnAction(e->{
	 int age1=Integer.parseInt(age.getText());
	  	if(nm.isSelected()){
	  		fee.setText("20");
	  	}
	  	else{
	  		if(age1<65){
	  			fee.setText("10");
	  		}
	  		else{
	  			fee.setText("5");
	  		}
	  	}
	  });
	  age.setOnKeyPressed(e->{
	  	if(!(e.getCode().isDigitKey())){
	  		
	  		JOptionPane.showMessageDialog(null,"Enter numbers only","Invalid Input",JOptionPane.WARNING_MESSAGE);
	  	}
	  });
	  cle.setOnAction(e->{
	  	age.setText(null);
	  	fee.setText("");
	  });
	}
    /**
     * Creates a new instance of <code>JRadioButton</code>.
     */
    public JRadioButton() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

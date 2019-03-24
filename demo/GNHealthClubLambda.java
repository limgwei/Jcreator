/**
 * @(#)GN.java
 *
 *
 * @author 
 * @version 1.00 2018/10/19
 */
 import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class GNHealthClubLambda extends Application{
	RadioButton single=new RadioButton("single");
        	RadioButton family=new RadioButton("Family");
        	CheckBox golf=new CheckBox("Golf"); 
        	CheckBox tennis=new CheckBox("Tennis");
        	CheckBox racquet=new CheckBox("RacquetBall");
        	TextField fee=new TextField();
        	TextField additional=new TextField();
        	TextField month=new TextField();
        	Button Calc=new Button("Calculate");
        	Button Exit=new Button("Exit");
        	BorderPane p=new BorderPane();
        
        public void start(Stage primaryStage){
        	
    	 	HBox member=new HBox(20);
    	 	member.getChildren().addAll(new Label("Membership"),single,family);
    	 	
    	 	HBox add=new HBox(20);
    	 	add.getChildren().addAll(new Label("Additional"),golf,tennis,racquet);
    	 	GridPane o=new GridPane();
    	 	o.add(new Label("Basic Fee"),0,0);
    	 	o.add(fee,1,0);
    	 	o.add(new Label("Additional"),0,1);
    	 	o.add(additional,1,1);
    	 	o.add(new Label("Monthly Dues"),0,2);
    	 	o.add(month,1,2);
    	 	o.add(Calc,0,3);
    	 	o.add(Exit,1,3);
    	 	p.setTop(member);
    	 	p.setCenter(add);
    	 	p.setBottom(o);
    	 
    	 ToggleGroup group=new ToggleGroup();
    	 single.setToggleGroup(group);
    	 family.setToggleGroup(group);
    	 	
    	Scene scene = new Scene(p);//add pane to scene
    	primaryStage.setTitle("Rectagle Calculator");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    	Calc.setOnAction(e->Calculate());
    	Exit.setOnAction(e->Exit());
    	}
        
        public void Calculate(){
        	int money=0;
        if(single.isSelected()){
    			fee.setText("50");
    			if(golf.isSelected()){
    			money+=25;
    			}
    			if(tennis.isSelected()){
    				money+=30;
    			}
    			if(racquet.isSelected()){
    				money+=20;
    			}
    			additional.setText(money+"");
    			month.setText((50+money)+"");
    		}
    		else if(family.isSelected()){
    			
    			fee.setText("90");
    		
    			if(golf.isSelected()){
    			money+=35;
    			}
    			if(tennis.isSelected()){
    				money+=50;
    			}
    			if(racquet.isSelected()){
    				money+=30;
    			}
    			additional.setText(money+"");
    			month.setText((90+money)+"");
    			
    		}
    		
        	}
        	public void Exit(){
        		System.exit(0);
        	}
        
    /**
     * Creates a new instance of <code>GN</code>.
     */
    public GNHealthClubLambda() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

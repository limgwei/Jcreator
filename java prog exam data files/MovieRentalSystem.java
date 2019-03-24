/**
 * @(#)MovieRentalSystem.java
 *
 *
 * @author 
 * @version 1.00 2018/12/12
 */
import java.io.*;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.Stage;
import java.util.*;
import javafx.scene.text.*;
import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class MovieRentalSystem extends Application{
	Label lid=new Label("Movie's ID");
    Label ltitle=new Label("Title");
    Label ldaysLate=new Label("Days Late");
    Label llateFee=new Label("Late Fee");
    
	TextField id=new TextField();
	TextField title=new TextField();
	TextField daysLate=new TextField();
	TextField lateFee=new TextField();
		
	RadioButton action=new RadioButton ("Action");
	RadioButton comedy=new RadioButton("Comedy");
	RadioButton drama=new RadioButton("Drama");
	
	RadioButton r=new RadioButton("R");
	RadioButton g=new RadioButton("G");
	RadioButton p=new RadioButton("PG-13");
	
	TextArea table=new TextArea();
	
	Button calc=new Button("Calculate");
	Button save=new Button("Save");
	Button clear=new Button("Clear");
	Button exit=new Button("Exit");
        public void start(Stage primaryStage){
        	BorderPane bp=new BorderPane();
        	GridPane bot=new GridPane();
        	HBox top=new HBox();
        	HBox center=new HBox();
        	
        	bot.add(lid,0,0);
        	bot.add(id,1,0);
        	bot.add(ltitle,2,0);
        	bot.add(title,3,0);
        	
        	bot.add(ldaysLate,0,1);
        	bot.add(daysLate,1,1);
        	bot.add(llateFee,2,1);
        	bot.add(lateFee,3,1);
        	
        	bot.add(calc,0,2);
        	bot.add(save,1,2);
        	bot.add(clear,2,2);
        	bot.add(exit,3,2);
        	
        	
        	
        	top.getChildren().addAll(action,comedy,drama);
        	center.getChildren().addAll(r,g,p);
        	VBox hh=new VBox();
        	hh.getChildren().addAll(top,center);
        	
        	ToggleGroup type=new ToggleGroup();
        	action.setToggleGroup(type);
        	comedy.setToggleGroup(type);
        	drama.setToggleGroup(type);
        	
        	ToggleGroup year=new ToggleGroup();
        	r.setToggleGroup(year);
        	g.setToggleGroup(year);
        	p.setToggleGroup(year);
        	
        	bp.setTop(hh);
        	bp.setCenter(bot);
        	bp.setBottom(table);
        	
        	Scene scene=new Scene(bp);
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	
        	action.setSelected(true);
        	r.setSelected(true);
        	lateFee.setEditable(false);
        	
        	calc.setOnAction(e->Calculate());
        	clear.setOnAction(e->Clear());
        	exit.setOnAction(e->Exit());
        	save.setOnAction(e->Save());
        	
        	id.setOnKeyPressed(e->{
        		if(e.getCode().isLetterKey()){
        			Alert("number");
        		}
        	});
        	daysLate.setOnKeyPressed(e->{
        		if(e.getCode().isLetterKey()){
        			Alert("number");
        		}
        	});
        	title.setOnKeyPressed(e->{
        		if(e.getCode().isDigitKey()){
        			Alert("alphabet");
        		}
        	});
        	
        }
        void Calculate(){
        	if(id.getText().equals("")||title.getText().equals("")||daysLate.getText().equals("")){
        		Alert("enter");
        	}
        	else{
        
        	
        		String rate="";
        		int late=Integer.parseInt(daysLate.getText());
        		if(r.isSelected()){
        			rate="R";
        		}
        		else if(g.isSelected()){
        			rate="G";
        		}
        		else if(p.isSelected()){
        			rate="PG-13";
        		}
        		if(comedy.isSelected()){
        			Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("Confirmation Dialog");
					alert.setContentText("Is AwardWinner movie?s");
					Optional<ButtonType> result = alert.showAndWait();
					String no="no";
					if (result.get() == ButtonType.OK){
   					 no="yes";
					}
					Comedy c=new Comedy(Integer.parseInt(id.getText()),title.getText(),rate,Integer.parseInt(daysLate.getText()),no);
        			table.appendText(c.toString()+"\n"); 
        		}
        		else if(drama.isSelected()){
        			
        			Drama d=new Drama(Integer.parseInt(id.getText()),title.getText(),rate,Integer.parseInt(daysLate.getText()));
        			table.appendText(d.toString()+"\n");
        		}
        		else if(action.isSelected()){
        			Action a=new Action(Integer.parseInt(id.getText()),title.getText(),rate,Integer.parseInt(daysLate.getText()));
        			table.appendText(a.toString()+"\n");
        		}
        		
        	
        	
        	}
        	
        }
         void Alert(String alerts){
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Error");
    	if(alerts.equals("enter")){
    		alert.setContentText("Please enter a value!");
    	}
    	else if(alerts.equals("number")){
    		alert.setContentText("Please enter a numeric value!");
    	}
    	else if(alerts.equals("alphabet")){
    		alert.setContentText("Please enter alphabet value!");
    	}
    	else if(alerts.equals("save")){
    		alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Save");
    	alert.setContentText("Record Saved!");
    	}
    	alert.showAndWait();
    }
         void Clear(){
        	daysLate.setText("");
            id.setText("");
            title.setText("");
        }
         void Exit(){
        	System.exit(0);
        }
         void Save(){
        	String filename="MovieLateFees.txt";
        	try{
        	File f=new File(filename);
        	PrintWriter p=new PrintWriter(new FileWriter(f,false));
        	p.println(table.getText());	
        	p.close();
        	
        	Alert("save");
        	}
        	catch(IOException e){
        		
        	}
        	Clear();
        }
    /**
     * Creates a new instance of <code>MovieRentalSystem</code>.
     */
    public MovieRentalSystem() {
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        Application.launch(args);
        
    }
}

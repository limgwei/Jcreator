/**
 * @(#)MyJavaFX.java
 *
 *
 * @author 
 * @version 1.00 2018/9/27
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import java.util.*;
import java.io.*;

public class RectangleFXOOP extends Application{
        private TextField tfWidth = new TextField();
        private TextField tfHeight = new TextField();
        private TextField tfArea = new TextField();
        private Button btnCalculate = new Button("Calculate");
        private Button btnClear = new Button("Clear");
        private Button btnSort = new Button("Sort");
        private TextArea taBox = new TextArea();
        
       ArrayList<Rectangle> rectArrayList=new ArrayList<Rectangle>();
       Rectangle r;
    //override the start method in the application class
    public void start(Stage primaryStage){
    	BorderPane b = new BorderPane();
    	//create UI
    	GridPane p = new GridPane();
    	p.setHgap(5);
    	p.setVgap(5);
    	//1st row
    	p.add(new Label("Width:"),0,0);
    	p.add(tfWidth,1,0);
    	//2nd row
    	p.add(new Label("Height:"),0,1);
    	p.add(tfHeight,1,1);
    	//3rd row
    	p.add(new Label("Area:"),0,2);
    	p.add(tfArea,1,2);
    	//4th row
    	p.add(btnCalculate,0,3);
    	p.add(btnSort,1,3);
    	
    	//set properties for UI
    	p.setAlignment(Pos.CENTER);
    	tfWidth.setAlignment(Pos.BOTTOM_RIGHT);
    	tfHeight.setAlignment(Pos.BOTTOM_RIGHT);
    	tfArea.setAlignment(Pos.BOTTOM_RIGHT);
    	tfArea.setEditable(false);    	
        b.setTop(p);
        
        
        HBox hTA = new HBox();
    	taBox.appendText("Width\t\tHeight\t\tArea");
    	taBox.setWrapText(true);
    	taBox.setEditable(false);
    	//create a scroll pane to hold the text area
    	ScrollPane sp = new ScrollPane(taBox);
    	
    	hTA.getChildren().addAll(sp);
    	b.setCenter(hTA);
        	
    	//process events
    	btnCalculate.setOnAction(e -> calculateRectangle());
    	btnClear.setOnAction(e -> clear());
    	btnSort.setOnAction(e -> sort());
    	
    	//create a scene and place it in the stage
    	Scene scene = new Scene(b,400,250);//add pane to scene
    	primaryStage.setTitle("Rectagle Calculator");//set the stage title
    	primaryStage.setScene(scene); //place the scene in the stage
    	primaryStage.show();//display the stage
    } 
   private void sort(){
   	Collections.sort(rectArrayList);
   	taBox.setText("Width\t\tHeight\t\tArea\n");
   	for(Rectangle st:rectArrayList){
   		taBox.appendText(st.getWidth()+"\t\t"+st.getLength()+
   			"\t\t"+st.calcArea()+"\n");
   	}
   }
    private void calculateRectangle(){
    	//get values from text fields
    		
    
    		int w = Integer.parseInt(tfWidth.getText());
    		int h = Integer.parseInt(tfHeight.getText());
    	   	r=new Rectangle(w,h);
    	   	rectArrayList.add(r);
    	   	tfArea.setText(r.calcArea()+"");
    	   	taBox.appendText("\n"+w+"\t\t\t"+h+"\t\t\t"+ String.valueOf(r.calcArea()));
    	
     	
    }
    public void clear(){
    	tfWidth.setText(null);
    	tfHeight.setText(null);
    	tfArea.setText(null);     	
    	taBox.setText("Width\t\tHeight\t\tArea");   	
    }
     public static void main(String[] args) {
        Application.launch(args);
    }
}


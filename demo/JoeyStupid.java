/**
 * @(#)JoeyStupid.java
 *
 *
 * @author 
 * @version 1.00 2018/11/23
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
public class JoeyStupid extends Application{
	private static Random r= new Random();
	static int count=0;
	static int countc=0;
	String[] drinks = {"pepsi","lemontea","coffee","orange"};
   String word = drinks[r.nextInt(drinks.length)]; 
   Label countdown=new Label("");
        	Label guess=new Label("");
        	TextField ans=new TextField();
        	Button start=new Button("Start");
        	Button submit=new Button("Submit"); 
        	
        		
        		
    String newword=scramble(word);
        public void start(Stage primaryStage){
        		
        	
        	GridPane gp=new GridPane();
        	
        	
        	gp.add(new Label("Count Down"),0,0);
        	gp.add(countdown,1,0);
        	
        	gp.add(new Label("Guess the word:"),0,1);
        	gp.add(guess,1,1);
        	
        	gp.add(new Label("Answer:"),0,2);
        	gp.add(ans,1,2);
        	
        	gp.add(start,0,3);
        	gp.add(submit,1,3);
        	
        	Scene scene=new Scene(gp);
        	primaryStage.setTitle("Anagram Game UI");
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	
        	start.setOnAction(e->Start());
        	submit.setOnAction(e->Submit());
        }
        
        
    /**
     * Creates a new instance of <code>JoeyStupid</code>.
     */
     
     
    public static String scramble(String word) {
    String newword = "";
    int rndnum;
    Random randGen = new Random();
    boolean letter[] = new boolean[word.length()];
    do {
        rndnum = randGen.nextInt(word.length());
        if (letter[rndnum] == false) {
            newword = newword + word.charAt(rndnum);
            letter[rndnum] = true;
        }
    } while (newword.length() < word.length());
  return newword;
} 
    public JoeyStupid() {
    }
    public void Start(){
    	countdown.setText(50+"");
    	guess.setText(newword);
    	start.setDisable(true);
    	startTask();
    }
    public void startTask(){
    	Runnable task=new Runnable(){
    		public void run(){
    			runTask();
    		}
    	};
    	Thread background=new Thread(task);
    	background.setDaemon(true);
    	background.start();
    }
    public void runTask(){
    	for(int i=10;i>=0;i--){
    		try{
    			if(i==5){
    			countdown.setTextFill(Color.RED);
    			}
    			final String status=i+"";
    			Platform.runLater(()->{
    				countdown.setText(status);
    			});
    			Thread.sleep(1000);
    		}
    		
    		catch(InterruptedException e){
    			
    		}
    	}
    	Platform.runLater(()->{
    		alert("final");
    		submit.setDisable(true);
	try{
      	String filename="output.txt";
      	File f = new File(filename);
      	PrintWriter p = new PrintWriter(new FileWriter(f,true));//append
      	p.println("Number of Question attempted:"+count+"\nNumber that answered correctly:"+countc+"\n");
      	p.close();
      }catch(IOException e){
      	
      }
    		
    	});
    }
    public void alert(String a){
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(a.equals("final")){
    		alert.setTitle("Record");
        alert.setContentText("Number of Question attempted:"+count+"\nNumber that answered correctly:"+countc);
    	}
    	else if(a.equals("wrong")){
    		alert.setTitle("Wrong");
        alert.setContentText("Wrong Answer");
    	}
        
        alert.showAndWait();
    }
    public void Submit(){
    	if(ans.getText().equals(word)){
    		countc++;
    		try{
      	String filename="output.txt";
      	File f = new File(filename);
      	PrintWriter p = new PrintWriter(new FileWriter(f,true));//append
      
      	p.println(ans.getText()+"	O");
      	
      	p.close();
      }catch(IOException e){
      	
      }
    	}
    	else{
    		try{
      	String filename="output.txt";
      	File f = new File(filename);
      	PrintWriter p = new PrintWriter(new FileWriter(f,true));//append
      
      	p.println(ans.getText()+"	X");
      	
      	p.close();
      }catch(IOException e){
      	
      }//end try
    		alert("wrong");
    		
    	}
    
    	
    	
    	
    	int a=(int)(Math.random()*4);
    	word=drinks[a];
    	count++;
    	newword=scramble(word);
    	guess.setText(newword);
    	
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
}

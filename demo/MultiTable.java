/**
 * @(#)MultiTable.java
 *
 *
 * @author 
 * @version 1.00 2018/10/22
 */
import java.io.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class MultiTable extends Application{
	Button generate=new Button("Generate");
	Button save=new Button("Save");
	TextField ans=new TextField();
	TextArea table=new TextArea();
	Button read=new Button("Read");
 public void start(Stage primaryStage){
 	GridPane p=new GridPane();
 	p.add(ans,0,0);
 	p.add(generate,1,0);
 	p.add(save,1,1);
 	p.add(table,0,1);
 	p.add(read,0,2);
 	
 	Scene scene=new Scene(p);
 	primaryStage.setTitle("Multiplication Table");
 	primaryStage.setScene(scene);
 	primaryStage.show();
 	/*read.setOnAction(e->{
 		String filename="lol.txt";
 		File f=new File(filename);
 		Scanner s=new Scanner(f);
 	
 			table.setText(s);
 		
 	});*/
 	save.setOnAction(e->{
 		String oo=ans.getText();
 		try{
 		String filename=("lol"+oo+".txt");
 		File file=new File(filename);
 		PrintWriter po=new PrintWriter(new FileWriter(file,false));
 		
 		Scanner s=new Scanner(table.getText());
 		while(s.hasNext()){
 			String out=s.nextLine();;
 			po.println(out);
 		}
 		po.close();
 		s.close();
 		JOptionPane.showMessageDialog(null,"Record Saved!");
 		}
 		catch(IOException q){
 			
 		}
 	
 	});
 	generate.setOnAction(e->
 	{
 		int o=Integer.parseInt(ans.getText());
 	table.setText(null);
 		for(int count=0;count<13;count++){
 			table.appendText(o+"*"+count+"="+(o*count)+"\n");
 		}
 	});
 }       
    /**
     * Creates a new instance of <code>MultiTable</code>.
     */
    public MultiTable() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Application.launch(args);
    }
    
}

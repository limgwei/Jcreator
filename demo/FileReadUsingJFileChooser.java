/**
 * @(#)FileReadUsingJFileChooser.java
 *
 *
 * @author 
 * @version 1.00 2018/11/16
 */

import java.io.*; //File class
import java.util.*; //Scanner
import javax.swing.*; //JFileChooser

public class FileReadUsingJFileChooser { 
    public static void main(String[] args) {    	
    	JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
        	try{        			      	
		        File f = fileChooser.getSelectedFile();	      	
		      	Scanner s = new Scanner(f);
		      	while(s.hasNext()){
		      		String name = s.nextLine();	
		      		System.out.println(name);
		      	}//end while
	 }catch(IOException e){
		      System.out.println("Exception caught: " + e.getMessage());
	}//end try  
        
        }else{
        	System.out.println("No file selected");
        }//end if           
    }
}

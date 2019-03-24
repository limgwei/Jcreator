/**
 * @(#)FileReadTesting1.java
 *
 *
 * @author 
 * @version 1.00 2018/11/16
 */


import java.io.*; //File class
import java.util.*; //Scanner
public class FileReadTesting1 {    
 
    public static void main(String[] args) {       
        	try{
        			String filename="kk.txt";
      			File f = new File(filename); 	       	      	
			Scanner s = new Scanner(f);
			while(s.hasNext()){
			     String name = s.nextLine();		      		      		     System.out.println(name);
			 }//end while ()
			 s.close();
	 }catch(IOException e){
		 System.out.println("Exception caught: " + e.getMessage());
	}//end try   
	     
			

           
    }
}


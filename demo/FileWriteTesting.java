/**
 * @(#)FileWriteTesting.java
 *
 *
 * @author 
 * @version 1.00 2018/11/16
 */

import java.io.*;
public class FileWriteTesting {        
  
    public static void main(String[] args) {
      try{
      	String filename="kk.txt";
      	File f = new File(filename);
      	PrintWriter p = new PrintWriter(new FileWriter(f,true));//append
      
      	p.println("This will be the 1st line in the output file");
      	p.println("And this will be the 2nd line");
      	p.close();
      }catch(IOException e){
      	System.out.println("Exception caught: " + e.getMessage());
      }//end try
    }
}

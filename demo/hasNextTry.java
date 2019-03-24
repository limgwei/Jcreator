/**
 * @(#)hasNextTry.java
 *
 *
 * @author 
 * @version 1.00 2018/12/6
 */
import java.io.*;
import java.util.*;



public class hasNextTry {
        
    /**
     * Creates a new instance of <code>hasNextTry</code>.
     */
    public hasNextTry() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line,filename="kk.txt";
        try{
        	File inputfile=new File(filename);
        	Scanner input=new Scanner(inputfile);
        	while(input.hasNext()){
        		line=input.next();
        		System.out.println(line);
        	}
        	input.close();
        }
        	catch(FileNotFoundException e){
        		System.out.println(filename+"not found");
        	}
        	finally{
        		System.out.println("Goodbye!");
        	}
        
    }
}

/**
 * @(#)FileScanner.java
 *
 *
 * @author 
 * @version 1.00 2018/10/22
 */


import java.io.*;
import java.util.*;
public class FileScanner {         
    public static void main(String[] args) {
    	String line;
    	try{
    		File inputFile = new File("ScannerTester.java");
    		Scanner input =new Scanner(inputFile);
    		//read one line at a time
    		while(input.hasNextLine()){
    			line=input.nextLine();
    			//line=input.next();
    			System.out.println(line);
    		}
    	}catch(FileNotFoundException e){
    		System.out.println(e.getMessage());
    	}       
    }
}

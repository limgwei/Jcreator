/**
 * @(#)ScannerTester.java
 *
 *
 * @author 
 * @version 1.00 2018/10/22
 */

import java.util.*;
public class ScannerTester {
	
public static void main(String[]args){


    	String s="1 2 3 4";
    	Scanner scanner=new Scanner(s);
    	int sum=0;
    	while(scanner.hasNext()){
    		sum+=scanner.nextInt();
    		System.out.println("Sum is "+sum);
    	}
    
    
}
}
/**
 * @(#)FanMainArray.java
 *
 *
 * @author 
 * @version 1.00 2018/9/14
 */

import java.util.Scanner;
public class FanMainArray {

    public FanMainArray() {
    	
    }
    public static void main(String[]args){
    	Scanner console = new Scanner (System.in);
    	//declare and create two fan objects
    	FanMain[]f=new FanMain[2];
    	
    	//input
    	for (int i=0;i<f.length;i++){
    		System.out.println("Enter speed:");
    		int speed=console.nextInt();
    		
    		System.out.println("Enter on:");
    		boolean on=console.nextBoolean();
    		
    		System.out.println("Enter radius:");
    		double radius=console.nextDouble();
    		
    		System.out.println("Enter color:");
    		String color=console.nextf
    			();
    		
    		f[i]=new FanMain (speed,on,radius,color);
    	}
    	for (int i=0;i<f.length;i++){
    		System.out.println(f[i].toString());
    	}
    	
    }
    
    
}
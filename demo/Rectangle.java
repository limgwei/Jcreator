/**
 * @(#)Rectangle.java
 *
 *
 * @author 
 * @version 1.00 2017/4/13
 */

import java.io.*;
public class Rectangle implements Comparable<Rectangle>{
	//instance variables
	int length;
	int width;

	//default constructor
    public Rectangle() {
    	length=5;
    	 width=5;
    }
    //constructor with parameter
    public Rectangle(int newLength, int newWidth) {
    	length=newLength;
    	width=newWidth;
    }
    
    //get methods
    public int getLength(){
    	return length;
    }
    public int getWidth(){
    	return width;
    }
   //set methods
   public void setLength(int newLength){
   	 length=newLength;
   }
    public void setWidth(int newWidth){
   	 width=newWidth;
   }
   public int calcArea(){
   	 return  length *width;
   }
   public int calcPerimeter(){
   	 return  (2*length)+(2*width);
   }
   //output
   public void printRectangle(){
   	 System.out.println("Length:" + getLength() );
     System.out.println("Width:" + width);
   	 System.out.println("Area:" + calcArea());
     System.out.println("Perimeter:" + calcPerimeter());
   }
   public String toString(){
   	return length + " "+ width + " " + calcArea();
   }
   public int compareTo(Rectangle o){
   	if(calcArea()>o.calcArea())
   		return 1;
   	else if(calcArea()<o.calcArea())
   		return -1;
   		else 
   			return 0;
   }
   
}  
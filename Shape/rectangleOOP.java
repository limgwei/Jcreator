/**
 * @(#)rectangleOOP.java
 *
 *
 * @author 
 * @version 1.00 2018/9/7
 */


public class rectangleOOP 
{

    	//instance variable
        int length;
        int width;
        
        //static variable(one copy)
        static int count=0;
        
    	//default constructor
    	public rectangleOOP() 
    {
	    length=5;
		width=5;
		count++;
    }
    //constructor with parameters
    public rectangleOOP(int newLength,int newWidth){
    	length=newLength;
    	width=newWidth;	
    		count++;																																																							
    	
    }
    //set method
    public int setLength(int newLength){
    	length=newLength;
    	return newLength;
    }
    public int setWidth(int newWidth){
    	length=newWidth;
    	return newWidth;
    }
    //get method
    public void getLength(){
    	System.out.println(length);
    	
    }
    public void getWidth(){
    
    System.out.println(width);
    }
    //task method
    public int calcArea(){
    	return length*width;
    }
    public int calcPerimeter(){
    	return (length+width)*2;
    }
   //output method
    public  String toString(){
    	return "Length:"+length+
                "\nWidth:"+width+
        "\nArea:"+calcArea()+
         "\nPerimeter:"+calcPerimeter();
    }
    //static method
    public  static int getCount(){
    	return count;
    }
}
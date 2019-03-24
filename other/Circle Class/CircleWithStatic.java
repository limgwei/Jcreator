/**
 * @(#)Circle.java
 *
 *
 * @author 
 * @version 1.00 2015/9/4
 */


public class CircleWithStatic {
	//variables or attributes or instance variable
     private double radius; //private - not allow other class to dircet access
     
     //static varible or class variable
     static int countCircle;
     //1)default constructor or special method
    public CircleWithStatic() {
    	radius=5;
    	countCircle++;
    }
    //2)constructor with parameters
    
    public CircleWithStatic(double radius){
    	this.radius=radius;
    	countCircle++;
    }
    
   /* public Circle(double newRadius){
    	radius=newRadius;
    }*/
    //get methods
    public double getRadius(){
    	return radius;
    }
    //set methods
    public void setRadius(double newRadius){
    	radius=newRadius;
    }
    //method
    public double findArea(){
    	return radius * radius * 3.14159;
    }
    
    //static method or class method
    public static int getCircleObject(){
    	return countCircle;
    }
    
}
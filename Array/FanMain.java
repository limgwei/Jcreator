/**
 * @(#)FanMain.java
 *
 *
 * @author 
 * @version 1.00 2018/9/10
 */


public class FanMain {
public static final int SLOW=1,MEDIUM=2,FAST=3;
int speed;
boolean on;
double radius;
String color;
    public FanMain() {
    	speed=SLOW; 	
    	on=false;
    	radius=5.0;
    	color="red";
    }
    public FanMain(int speed,boolean on,double radius,String color){
    	this.speed=speed;
    	this.on=on;
    	this.radius=radius;
    	this.color=color;
    }
    //set method
    public void setSpeed(int speed){
    	this.speed=speed;
    }
    public void setOn(boolean on){
    	this.on=on;
    }
    public void setRadius(double radius){
    	this.radius=radius;
    }
    public void setColor(String color){
    	this.color=color;
    } 
    	
    //get method
    public int getSpeed(){
    	return speed;
    }
    public boolean on(){
    	return on;
    }
    public double radius(){
    	return radius;
    }
    public String color(){
    	return color;
    }
    public String toString(){
    	return ("Fan speed="+speed+
    		"\non="+on+
    			"\nradius="+radius+
    				"\ncolor="+color
    					);
    	
    }
    
    
    
}
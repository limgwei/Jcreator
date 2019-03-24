/**
 * @(#)bmiJOption.java
 *
 *
 * @author 
 * @version 1.00 2018/9/10
 */

import javax.swing.*;
import java.util.Scanner;
public class bmiJOption {
String name;
int age;
double kg;
double height;
String status="";
    public bmiJOption() {
    	name="unknown";
        age=0;
        kg=0.0;
        height=0.0;
    	
    }
    
    public bmiJOption(String name,int age,double kg,double height){
    	this.name=name;
    	this.age=age;
    	this.kg=kg;
    	this.height=height;
    }
    //set method
    public void setName(String name){
    	this.name=name;
    }
    public void setAge(int age){
    	this.age=age;
    }
    public void setKg(double kg){
    	this.kg=kg;
    }
    public void setHeight(double height){
    	this.height=height;
    }
    
    //get methos
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public double getKg(){
    	return kg;
    }
    public double getHeight(){
    	return height;
    }
    public double computeBMI(){
    	return kg/(height*height);
    }
    public String status(String status){
    status="";
    	if(computeBMI()<18.5){
    		status="underweight";
    	}
    	else if(computeBMI()<20.0){
    		status="normal";
    	}
    	else if(computeBMI()<23.0){
    		status="overweight";
    	}
    	else{
    		status="obese";
    	}
    	return status;
    }
   public String toString(){
   	return "Name:"+getName()+
        	"\nAge:"+getAge()+
        		"\nkg:"+getKg()+
        			"\nheight:"+getHeight()+
        				"\nBMI:"+computeBMI()+
        					"\nStatus:"+status(status); 	
   }
}
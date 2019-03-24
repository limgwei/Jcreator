/**
 * @(#)bmi.java
 *
 *
 * @author 
 * @version 1.00 2018/9/7
 */


public class bmi {
double height;
    	double weight;
    	int age;
    	String name;
    	
    public bmi() {
    	height=0.0;
    	weight=0.0;
    	age=0;
    	name="unknown";
    	
    }
   public bmi(String name,int age,double weight,double height){
   	this.name=name;
   	this.age=age;
   	this.weight=weight;
   	this.height=height;
   }
    
    public double computeBMI(){
    	return (weight)/(height*height);
    	
    }
    
    public String findWeightStatus(){
    	double bmi=computeBMI() ;
    	String status="";
    	if(bmi<18.5){
    		status="Underweight";
    	}
    	else if(bmi<25.0){
    		status="Normal";
    	}
    	else if(bmi<30.0){
    		status="Overweight";
    	}
    	else{
    		status="Obese";
    	}
    	return status;
    }
    //get method
    public String getName(){
    	return name;
    }
    
    public int getAge(){
    	return age;
    }
    public double getHeight(){
    	return height;
    }
    public double getWeight(){
    	return weight;
    }
    
    //set method 
    public void setName(String name){
    	this.name=name;
    }
        public void setAge(int age){
    	this.age=age;
    }
    public void setHeight(double height){
    	this.height=height;
    }
    public void setWeight(double weight){
    	this.weight=weight;
    }}
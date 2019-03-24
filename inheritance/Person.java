/**
 * @(#)Person.java
 *
 *
 * @author 
 * @version 1.00 2018/9/14
 */


public class Person {
	//instance variable
public String name;
public int age;
private double payRate;
public double hoursWorked;
    public Person() {
    	
    }
    //constructor with parameter
    public Person(String name,int age)
    	{
    		
    		
    	this.name=name;
    	this.age=age;
    	
    	
    }
    //get methods
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    //set method
    public void setName(String name){
    	this.name=name;
    }
    public void setAge(int age){
    	this.age=age;
    }
    //output
    public String toString(){
    	return 
    		"\nName:"+name+
    			"\nAge:"+age;
    }
    
    
}
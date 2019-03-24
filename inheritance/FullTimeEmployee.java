/**
 * @(#)FullTimeEmployee.java
 *
 *
 * @author 
 * @version 1.00 2018/9/14
 */

//Person-Parent class or Superclass
//FullTimeEmployee - Child class or Subclass
public class FullTimeEmployee extends Person{
	//instance variable
public double payRate;
public double hoursWorked;

//default  constructor
    public FullTimeEmployee() {
    	
    	
    }
    //constructor ith parameters
    public FullTimeEmployee(String name,int age ,double payRate, double hoursWorked){
    super(name,age);//calling Person's parameter constructor
    this.payRate=payRate;
    this.hoursWorked=hoursWorked;
    }
    //get method
    public double getHoursWorked(){
    	return hoursWorked;
    }
    public double getPayRate(){
    	return payRate;
    	
    }
    public double calculatePay(){
    	return hoursWorked*payRate;
    }
    public String toString(){
    	return "Name:"+name+
    		"\nAge:"+age+
    		"\nPayRate:"+payRate+
    			"\nHoursWorked:"+getHoursWorked()+
    				"\nPay:"+calculatePay();
    }
    
    
}
/**
 * @(#)SubClass.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */


public class SubClass extends SuperClass{

    public SubClass() {
    	super(1,2);
    	
    }
    public static void main(String[]args){
    	SubClass f1=new SubClass();
    	System.out.println(f1.a);
    	
    }
    
}
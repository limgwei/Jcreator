/**
 * @(#)PhotoCopy.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */


public class PhotoCopy {
String name;
char code='c';
int numOfPages;
    public PhotoCopy() {
    }
    public PhotoCopy(String name,char code,int numOfPages){
    	this.name=name;
    	this.code=code;
    	this.numOfPages=numOfPages;
    }
    double calculatePrintingCost(){
    	
    	if(code=='c'||code=='C'){
    		if(numOfPages<=10){
    			return numOfPages*0.5;
    		}
    		else if(numOfPages<=20){
    			return numOfPages*0.4;
    		}
    		else{
    			return numOfPages*0.3;
    		}
    	}
    	else if(code=='b'||code=='B'){
    		if(numOfPages<=100){
    			return numOfPages*0.05;
    		}
    		else if(numOfPages<=200){
    			return numOfPages*0.04;
    		}
    		else{
    			return numOfPages*0.03;
    		}
    	}
    else{
    	return 0;
    }
    }
    public String toString(){
    System. out.println("Name:"+name);
    System.out.print("Type of printing:");
    if(code=='b'||code=='B'){
    	System.out.println("Black");
    }
    else if(code=='c'||code=='C'){
    	System.out.println("Color");
    }
    return "Number of pages:"+numOfPages+
    	"\nPrinting cost:$"+calculatePrintingCost();
    }
    
}
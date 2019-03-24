/**
 * @(#)Movie.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */


public class Movie {
int id;
String rating;
String title;
int daysLate;
final double LATE_FEE=2.0;
    public Movie() {
    	
    }
    public Movie(int id,String title,String rating,int daysLate){
    	this.id=id;
    	this.rating=rating;
    	this.title=title;
    	this.daysLate=daysLate;
    }
    public double calcLateFee(){
    	return LATE_FEE*daysLate;
    }
    public String toString(){
    	return id+" "+title+" "+rating+" "+daysLate+calcLateFee();
    			
    }
    
    
}
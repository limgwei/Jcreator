/**
 * @(#)AwardWinnerMovie.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */


public class AwardWinnerMovie extends Movie{
int awardYear;
String awardTitle;
    public AwardWinnerMovie() {
    }
    public AwardWinnerMovie(int id,String title,String rating,int daysLate,int awardYear,String awardTitle){
    	super(id,title,rating,daysLate);
    	this.awardYear=awardYear;
    	this.awardTitle=awardTitle;
    	
    }
    public String toString(){
    		
    		return super.toString()+" "+awardTitle+" "+awardYear;
    			
    } 
    public double calcLateFee(){
    	return super.calcLateFee()*2;
    }
    
    
}
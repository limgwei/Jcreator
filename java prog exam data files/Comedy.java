/**
 * @(#)Comedy.java
 *
 *
 * @author 
 * @version 1.00 2018/12/12
 */


public class Comedy extends Movie{
private String awardWinner;

public Comedy(int id,String title,String rating,int daysLate,String awardWinner)
{
	super(id, title,  rating,  daysLate);
	this.awardWinner=awardWinner;
}

   
   public double calcLateFees(){
   	int a=1;
   	double price=0.0;
		if(super.getDaysLate()<=5){
			price=super.getDaysLate()*2.5;
		}
		else if(super.getDaysLate()<=10){
			price=super.getDaysLate()*5;
		}
		else{
			price=super.getDaysLate()*8;
		}
   	if(awardWinner.equals("yes")){
   		a=2;
   	}
   	
    return super.calcLateFees()+price*a;	
    }
   public String toString(){
    	return super.toString()+
    		"\nAwardWinner:"+awardWinner
    			+"\nLate Fees:"+calcLateFees();
    }
    
}
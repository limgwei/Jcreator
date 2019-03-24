/**
 * @(#)testtry.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */

public class testtry extends moretry{
         /*String name="unknown";
         int age;
         double weight;
         double height;*/
    /**
     * Creates a new instance of <code>testtry</code>.
     */
    public testtry() {
    }
    
    /**
     * @param args the command line arguments
     */
     
     
   public testtry(String name,int age,double weight,double height){
   	  super(name,age,weight,height);
   }
   
   
   
   public String toString(){
   	return ("Name:"+name+"\nAge:"+age+"\nweight:"+weight+"\nHeight"+height);
   }
}

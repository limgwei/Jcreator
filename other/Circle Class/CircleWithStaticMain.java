/**
 * @(#)CircleMain.java
 *
 *
 * @author 
 * @version 1.00 2015/9/4
 */
import java.util.*;
public class CircleWithStaticMain {
        
   
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	//get radius from user
    	System.out.println("Enter radius:");
    	double c2Radius = input.nextDouble();
    	
        CircleWithStatic c1 = new CircleWithStatic(); //calling default constructor radius=5;
        CircleWithStatic c2 = new CircleWithStatic(c2Radius);//calling constructor with parameter radius=8;
       
        c1.setRadius(7);//update c1's radius from 5 to 7
        System.out.println("C1 radius:" + c1.getRadius());
        System.out.println("C1 area:" + c1.findArea());// 5 * 5 * 3.14159
        System.out.println("C2 radius:" + c2.getRadius());
        System.out.println("C2 area:" + c2.findArea());
        
        System.out.println("Total Circle objects created:" + CircleWithStatic.getCircleObject());
        
    }//end main
}

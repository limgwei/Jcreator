/**
 * @(#)InvalidRadiusException.java
 *
 *
 * @author 
 * @version 1.00 2018/11/9
 */

public class InvalidRadiusException extends Exception{
       private double radius; 
    /**
     * Creates a new instance of <code>InvalidRadiusException</code>.
     */
    public InvalidRadiusException(double radius) {
    	super("Invalid radius "+radius);
    	this.radius=radius;
    }
    
    /**
     * @param args the command line arguments
     */
     public double getRadius(){
     	return radius;
     }
    
}

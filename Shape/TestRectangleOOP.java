/**
 * @(#)TestRectangleOOP.java
 *
 *
 * @author 
 * @version 1.00 2018/9/7
 */

public class TestRectangleOOP {
        
    /**
     * Creates a new instance of <code>TestRectangleOOP</code>.
     */
    public TestRectangleOOP() {
    }
    
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create two rectangle objects named r1 and r2
        rectangleOOP r1=new rectangleOOP();
        rectangleOOP r2 = new rectangleOOP(8,8);
        
        System.out.println("R1's area:"+r1.calcArea());
        System.out.println("R2's area:"+r2.calcArea());
        
        r1.setLength(10);
        r1.setWidth(10); 
        
        System.out.println("R1 data:");
        System.out.println(r1.toString());
        
        System.out.println("R2 data:");
        System.out.println(r2.toString());
        
       System.out.println("Length:"+r1.setLength(8));
       System.out.println("Total Rectangle object:"+rectangleOOP.getCount());
    }
}

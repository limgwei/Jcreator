/**
 * @(#)rectangleSP.java
 *
 *
 * @author 
 * @version 1.00 2018/9/7
 */

public class rectangleSP {
        
    /**
     * Creates a new instance of <code>rectangleSP</code>.
     */
    public rectangleSP() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length=20;
        int width=30;
        
        int area=length*width;
        int perimeter=(length*width)*2;
        
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);
    }
}

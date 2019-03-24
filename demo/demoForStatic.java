/**
 * @(#)demoForStatic.java
 *
 *
 * @author 
 * @version 1.00 2018/11/1
 */

public class demoForStatic {
         static int a;
        static int b=2;
    /**
     * Creates a new instance of <code>demoForStatic</code>.
     */
    public demoForStatic() {
    	a=6;
    	b++;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(a+b);
    }
}

/**
 * @(#)ConversionDemo.java
 *
 *
 * @author 
 * @version 1.00 2018/10/9
 */

public class ConversionDemo {
        
    /**
     * Creates a new instance of <code>ConversionDemo</code>.
     */
    public ConversionDemo() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1=new String("Welcome");
        String s2="  to  ";
        String s3="     Java    lol";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s2);
        System.out.println(s3.trim());
    }
}

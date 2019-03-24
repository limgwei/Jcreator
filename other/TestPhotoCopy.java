/**
 * @(#)TestPhotoCopy.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */

public class TestPhotoCopy {
        
    /**
     * Creates a new instance of <code>TestPhotoCopy</code>.
     */
    public TestPhotoCopy() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhotoCopy n1=new PhotoCopy("ng mee mee",'c',400);
        PhotoCopy n2=new PhotoCopy("lol",'b',400);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
    }
}

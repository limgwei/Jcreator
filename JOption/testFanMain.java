/**
 * @(#)testFanMain.java
 *
 *
 * @author 
 * @version 1.00 2018/9/10
 */

public class testFanMain {
     public static final int SLOW=1,MEDIUM=2,FAST=3;
    /**
     * Creates a new instance of <code>testFanMain</code>.
     */
    public testFanMain() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FanMain f1=new FanMain(FAST,true,5.0,"Yellow");
        FanMain f2=new FanMain(SLOW,false,2.0,"Blue");
       
        f1.toString();
        f2.toString();
   
        
        
    }
}

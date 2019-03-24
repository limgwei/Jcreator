/**
 * @(#)TestPayrollSystem.java
 *
 *
 * @author 
 * @version 1.00 2018/9/14
 */

public class TestPayrollSystem {
        
    /**
     * Creates a new instance of <code>TestPayrollSystem</code>.
     */
    public TestPayrollSystem() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FullTimeEmployee f1 = new FullTimeEmployee("Jane",34,8.5,40);
        System.out.println(f1.toString());
        FullTimeEmployee f2=new FullTimeEmployee();
        System.out.println(f2);
    }
}

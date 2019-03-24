/**
 * @(#)TestProblem.java
 *
 *
 * @author 
 * @version 1.00 2018/10/30
 */

public class TestProblem {
        
    /**
     * Creates a new instance of <code>TestProblem</code>.
     */
    public TestProblem() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Problem p = new Problem('+');
    	System.out.println(p);
    	
    	System.out.println(p.getAnswer());
        
    }
}

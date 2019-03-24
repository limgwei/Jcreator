/**
 * @(#)TestMovie.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */

public class TestMovie {
        
    /**
     * Creates a new instance of <code>TestMovie</code>.
     */
    public TestMovie() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Movie n1=new Movie(11,"aaa","G",4);
   AwardWinnerMovie n2=new AwardWinnerMovie(12,"abc","G",4,2014,"got Oscars in ");
    System.out.println(n1.toString());
   System.out.println(n2.toString());
    }
   
}

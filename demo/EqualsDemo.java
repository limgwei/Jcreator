/**
 * @(#)EqualsDemo.java
 *
 *
 * @author 
 * @version 1.00 2018/10/9
 */

public class EqualsDemo {
        
    /**
     * Creates a new instance of <code>EqualsDemo</code>.
     */
    public EqualsDemo() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="Welcome";
        String s2="Welcome";
        String s3="welcome";
        
        if(s1.equals(s2)){
        	System.out.println("same");
        }
        if(s1.equals(s3)){
        	System.out.println("same");
        }
        else{
        	System.out.println("not same");
        }
        s1=s3;
        if(s1==s3){
        	System.out.println("same");
        }
        
        String s4="Welcome";
        String s5="welcome";
        if(s4.compareTo(s5)>0){
        	System.out.println("Bigger");
        }
        else{
        	System.out.println("Smaller");
        }
    }
}

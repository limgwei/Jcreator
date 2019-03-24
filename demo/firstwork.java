/**
 * @(#)firstwork.java
 *
 *
 * @author 
 * @version 1.00 2018/9/3
 */
import java.util.Scanner;
public class firstwork {
        
    /**
     * Creates a new instance of <code>firstwork</code>.
     */
    public firstwork() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();
        int ans2=Triple(ans);
        System.out.println(ans2);
        
    }
    
    
    
    public static int Triple(int a){
    	int b=a*3
    	return b; 
    	
    }
   
   
}
}
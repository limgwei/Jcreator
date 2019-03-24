/**
 * @(#)trycatch.java
 *
 *
 * @author 
 * @version 1.00 2018/11/9
 */

public class trycatch {
        
    /**
     * Creates a new instance of <code>trycatch</code>.
     */
    public trycatch() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        
        System.out.println(sum(new int[]{1,2,3,4,5}));
    }
    catch(ArrayIndexOutOfBoundsException ex){
    	System.out.println("dsjfh");
    }
    }
    public static int sum(int[]list){
    	int result=0;
    	for(int i=0;i<=list.length;i++){
    		result+=list[i];
    	}
    	return result;
    }
}

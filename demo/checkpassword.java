/**
 * @(#)checkpassword.java
 *
 *
 * @author 
 * @version 1.00 2018/10/19
 */
 import java.util.*;
public class checkpassword {
        
    /**
     * Creates a new instance of <code>checkpassword</code>.
     */
    public checkpassword() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="wlkdsjlkjasf2";
        int a=0;
        
        if(s.length()>=8){
        	for(int i=0;i<s.length();i++){
        	
          if (Character.isDigit(s.charAt(i))){
          
        		a++;
        	}	
        }
        }
        else{
        	System.out.println("sorry");
        }
        if(a<2 && s.length()>=8){
        	 System.out.println("lol");
        }
        else if(a>=2){
        	System.out.println("ty");
        }
        String l="to be or not to be";
        StringTokenizer lol=new StringTokenizer(l);
        while(lol.hasMoreTokens()){
        String word=lol.nextToken();
        	if(word.charAt(0)=='b'||word.startsWith("b")){
        	
        	
        	System.out.println(word);
        }
        }
    }
}

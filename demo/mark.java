/**
 * @(#)mark.java
 *
 *
 * @author 
 * @version 1.00 2018/12/6
 */
import java.io.*;
import java.util.*;
public class mark {
        
    /**
     * Creates a new instance of <code>mark</code>.
     */
    public mark() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String filename2="scoreOver90.txt";
        File f2=new File(filename2);
        
        String filename="score.txt";
        
       
      
       	
        int count=0;
        File f=new File(filename);
        Scanner input=new Scanner(f);
        while(input.hasNext()){
        int a=Integer.parseInt(input.nextLine());
        if(a>=90){
        	try{
        	 PrintWriter p=new PrintWriter(new FileWriter(f2,true));	
        		p.println(a+"");
        	
        		count++;
        	p.close();
        			
        }
        catch(IOException e){
        	System.out.println("gg");
        }
        	
        }
        	
        			
        
      
        	
       
        	}
        	try{
        			 PrintWriter p=new PrintWriter(new FileWriter(f2,true));	
        		p.println("Your total score is "+count);
        p.close();
        	}
        	catch(IOException e){
        		
        	}
        
        	
        	   
        	  
        }
        
        
        catch(FileNotFoundException e){
        	
        }
       
        String s1="hello";
        String s2="hello";
        System.out.println(s1.equals(s2));
    }
}

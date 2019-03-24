/**
 * @(#)Assignmnet3q3.java
 *
 *
 * @author 
 * @version 1.00 2014/12/4
 */
import java.util.*;

public class ScrambleWord {
        
    private static Random r= new Random();
    
    public void lol(){
    	Scanner console = new Scanner(System.in);
    	String[] drinks = {"pepsi","lemontea","coffee","orange"};
    	String word = drinks[r.nextInt(drinks.length)]; 
    	
    String newword=scramble(word);
    	 
   	System.out.println("Guess the word: " + newword);
   	
   	

  while(!answer.equals(word))
   {
   	    	   	
		   		System.out.println("Wrong answer. Try again!");
		   	
		   		
		   	System.out.println("Guess the word: " + newword);
		   	      answer=console.next();
		   
   	}
   	System.out.println("You answer is correct");
  
    }
    
   public static String scramble(String word) {
    String newword = "";
    int rndnum;
    Random randGen = new Random();
    boolean letter[] = new boolean[word.length()];
    do {
        rndnum = randGen.nextInt(word.length());
        if (letter[rndnum] == false) {
            newword = newword + word.charAt(rndnum);
            letter[rndnum] = true;
        }
    } while (newword.length() < word.length());
  return newword;
}
public String countDown(){
	return 30;
} 


}

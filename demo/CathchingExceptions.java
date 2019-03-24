/**
 * @(#)CathchingExceptions.java
 *
 *
 * @author 
 * @version 1.00 2018/11/5
 */

import javax.swing.*;
public class CathchingExceptions {
           
    public static void main(String[] args) {
       String s1,s2;
       double num1,num2, average;
       try{
       	 s1=JOptionPane.showInputDialog("Enter a number:");
      	 num1=Double.parseDouble(s1);
       	 s2=JOptionPane.showInputDialog("Great! Now enter another number:");
       	 num2=Double.parseDouble(s2);
         average =(num1+num2)/2.0;
       	 JOptionPane.showMessageDialog(null, "The average of " + num1 + " and " + num2 + " is " + average, "Sample Input Dialog", JOptionPane.INFORMATION_MESSAGE);
       	
       }catch(NumberFormatException n){
       	 JOptionPane.showMessageDialog(null, "You must enter a number", "Input Data Error", JOptionPane.ERROR_MESSAGE);
       }catch(NullPointerException n){
       	 JOptionPane.showMessageDialog(null, "You pressed the cancel button", "Program Termination", JOptionPane.ERROR_MESSAGE);
       }finally{
       	System.out.println("GoodBye");
         System.exit(0);    
       }        
    }
}

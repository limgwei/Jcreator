/**
 * @(#)demo1.java
 *
 *
 * @author 
 * @version 1.00 2018/9/3
 */
import java.util.*;
import javax.swing.*;
public class demo1{

    public static void main(String[] args) {
      /*  // console input
        Scanner console = new Scanner (System.in);
        System.out.print("Please enter your age:");
        int age = console.nextInt();
        int ageInDays = age*365;
        //console output
        System.out.println("So you age is "+ age);
        System.out.println("You have been living in this world for "+ageInDays+".Its really enough ");    
        */
       // -----------------------------------------------------------------------------------------------// 
       //dialogbox input
       ImageIcon icon=new ImageIcon("https://myanimelist.cdn-dena.com/images/characters/14/349249.jpg");
       String age = JOptionPane.showInputDialog("Pleage enter your age");
       //processing  
       int ageInDays = Integer.parseInt(age)*365;
       //dialogbox output
       JOptionPane.showMessageDialog(null,"Your age is :" + age);
       JOptionPane.showMessageDialog(null,"You have been living for "+ageInDays,"blabla",JOptionPane.PLAIN_MESSAGE,icon);
    }
}

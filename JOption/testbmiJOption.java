/**
 * @(#)testbmiJOption.java
 *
 *
 * @author 
 * @version 1.00 2018/9/10
 */
import java.util.Scanner;
        import javax.swing.*;
public class testbmiJOption {
        
    /**
     * Creates a new instance of <code>testbmiJOption</code>.
     */
    public testbmiJOption() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner console=new Scanner(System.in); 
        String name=JOptionPane.showInputDialog("Enter name:");
    	int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
    	double kg=Double.parseDouble(JOptionPane.showInputDialog("Enter your kg:"));
    	double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height in m"));
    	
    	bmiJOption p1=new bmiJOption(name,age,kg,height);
    	
        JOptionPane.showMessageDialog(null,"Name:"+p1.getName()+
        	"\nAge:"+p1.getAge()+
        		"\nkg:"+p1.getKg()+
        			"\nheight:"+p1.getHeight()); 	
    }
}

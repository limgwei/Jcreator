/**
 * @(#)testbmi.java
 *
 *
 * @author 
 * @version 1.00 2018/9/7
 */
import java.util.Scanner;
public class testbmi {
        
    /**
     * Creates a new instance of <code>testbmi</code>.
     */
    public testbmi() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=console.nextLine();
        System.out.println("Enter your age");
        int age=console.nextInt();
        System.out.println("Enter your weight in kg");
        double weight=console.nextDouble();
        System.out.println("Enter your height in meter");
        double height=console.nextDouble();
        
        bmi p1=new bmi(name,age,weight,height);
        
        System.out.println("Name:"+p1.getName());
        System.out.println("Age:"+p1.getAge());
        System.out.println("Weight:"+p1.getWeight());
        System.out.println("Height:"+p1.getHeight());
        System.out.println("BMI:"+p1.computeBMI());
        System.out.println("WeigthStatus:"+p1.findWeightStatus());
       
    }
}

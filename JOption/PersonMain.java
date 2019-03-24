/**
 * @(#)PersonMain.java
 *
 *
 * @author 
 * @version 1.00 2018/9/14
 */
import javax.swing.*;
public class PersonMain {
        int a=5;
    /**
     * Creates a new instance of <code>PersonMain</code>.
     */
    public PersonMain() {
    	a=4;
    }
    public PersonMain(int a){
    	this.a=a;
    }
    static void haha(){
    	System.out.println(a);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* bmiJOption[]p= new bmiJOption[2];
        //input
        for(int i = 0;i < p.length;i++){
        String name=JOptionPane.showInputDialog("Enter name");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        double weight=Double.parseDouble(JOptionPane.showInputDialog("Enter weight"));
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter height in m"));
        p[i]=new bmiJOption(name,age,weight,height);
        }
        //output
        for (int i =0;i<p.length;i++){
        	JOptionPane.showMessageDialog(null,p[i].toString());
        	
        }*/
        PersonMain lol=new PersonMain();
        System.out.println(lol.a);
        }
}
        
    


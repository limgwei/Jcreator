/**
 * @(#)CircleGUI.java
 *
 *
 * @author 
 * @version 1.00 2018/9/28
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CircleGUI  extends JPanel implements ActionListener{
        JLabel l1,l2;
    	JTextField t1,t2;
    	JButton Cal,Cle;
    /**
     * Creates a new instance of <code>CircleGUI</code>.
     */
    public CircleGUI() {
    	this.setLayout(new GridLayout(3,2));
    	
    	this.add(l1=new JLabel("Radius:"));
    	this.add(t1=new JTextField(10));
    	this.add(l2=new JLabel("Area:"));
    	this.add(t2=new JTextField(10));
    	
    	this.add(Cal=new JButton("Calculate"));
    	this.add(Cle=new JButton("Clear"));
    	
    	Cal.addActionListener(this);
    	Cle.addActionListener(this);
    }
    public void actionPerformed(ActionEvent o){
    	if(o.getSource()==Cal){
    		double q=Double.parseDouble(t1.getText());
    		
    		t2.setText((q*3.14159*2)+"");
    	}
    	else if(o.getSource()==Cle){
    		t1.setText(null);
    		t2.setText("");
    	}
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	JFrame application = new JFrame("Rectangle Calculator");
    	CircleGUI panel=new CircleGUI();
    	application.add(panel);
    	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	application.setSize(300,300);
    	application.setVisible(true);
        
    }
}

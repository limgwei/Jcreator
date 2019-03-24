/**
 * @(#)RectangleGUI.java
 *
 *
 * @author 
 * @version 1.00 2018/9/28
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//event-handling

public class RectangleGUIOOP extends JPanel implements ActionListener{
//declare instance variablefe
JButton btnCalculate,btnClear;
JLabel lblWidth,lblHeight,lblArea;
JTextField tfWidth,tfHeight,tfArea;
	rectangleOOP r;
    public RectangleGUIOOP() {
    	//define layout manager-GridLayout
    	this.setLayout(new GridLayout(4,2));//4 rows & 2 columns
    	
    	//-----add GUI components into JPanel-----------//
    	
    	//1st row
    	this.add(lblWidth=new JLabel("Width"));
    	this.add(tfWidth=new JTextField(10));
    	
    	//2ndrow
    	this.add(lblHeight=new JLabel("Height"));
    	this.add(tfHeight=new JTextField(10));
    	
    	//3rd row
    	this.add(lblArea=new JLabel("Area:"));
    	this.add(tfArea=new JTextField(10));
    	
    	//4th row
    	this.add(btnCalculate=new JButton("Calculate"));
    	this.add(btnClear=new JButton("Clear"));
    	
    	//register button listen to click event
    	btnCalculate.addActionListener(this);
    	btnClear.addActionListener(this);
    	
    }
    //button click action coding
    public void actionPerformed(ActionEvent e){
    	//get width and height from GUI testfield
    
    	if(e.getSource()==btnCalculate){
    		int w=Integer.parseInt(tfWidth.getText());
    	int h=Integer.parseInt(tfHeight.getText());
    	
    	//double a=w*h;
    		r=new rectangleOOP(w,h);
    	//	tfArea.setText((w*h)+"");
    	//	tfArea.setText(a+"");
    	//	tfArea.setText(String.valueOf(a));
    	    tfArea.setText(r.calcArea()+"");
    	}
    	else if(e.getSource()==btnClear){
    		tfWidth.setText(null);
    		tfHeight.setText(null);
    		tfArea.setText("");
    	}
    }
    public static void main(String[]args){
    	JFrame application = new JFrame("Rectangle Calculator");
    	RectangleGUI panel=new RectangleGUI();
    	application.add(panel);
    	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	application.setSize(300,300);
    	application.setVisible(true);
    	
    	
    }
    
    
}
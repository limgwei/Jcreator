/**
 * @(#)TestJFileChoose.java
 *
 *
 * @author 
 * @version 1.00 2018/11/16
 */
import java.io.*;
import javax.swing.*;
public class TestJFileChoose {
        
    /**
     * Creates a new instance of <code>TestJFileChoose</code>.
     */
    public TestJFileChoose() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFileChooser chooser = new JFileChooser();
	if(chooser.showOpenDialog(null) ==JFileChooser.APPROVE_OPTION){
       		System.out.println("Open is clicked");
       		File selectedFile = chooser.getSelectedFile();
	       	File directory=chooser.getCurrentDirectory();
	       	System.out.println("Directory:" + directory.getName());
	       	System.out.println("Selected file:" + selectedFile.getName());
	       	System.out.println("Full path:" + selectedFile.getAbsolutePath());
       	}else{
       		System.out.println("Open File Dialog cancelled");
       	}

    }
}

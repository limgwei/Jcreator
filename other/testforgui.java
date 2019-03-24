/**
 * @(#)testforgui.java
 *
 *
 * @author 
 * @version 1.00 2018/9/16
 */
import javax.swing.*;
import java.awt.*;
public class testforgui implements forgui{
        
    /**
     * Creates a new instance of <code>testforgui</code>.
     */
    public testforgui() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String[]option={"apple","orange","grapes"
        };
        int s=JOptionPane.showOptionDialog(null,"What you wan","Pick one",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,option[0]);
        ImageIcon icon=new ImageIcon(new ImageIcon("C:\\Users\\lim\\Desktop\\other\\349249.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        
   JOptionPane.showMessageDialog(null,"Cute","megumi",JOptionPane.INFORMATION_MESSAGE,icon);
        
    }
}

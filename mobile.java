import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.TreeUI;

public class mobile 
{
      public static void main(String args[])
      {
            JFrame screen=new JFrame();
            
            JLabel Label1=new JLabel("Student Name: ");
            Label1.setBounds(30, 30, 150, 25);
            Label1.setVisible(true);
            screen.add(Label1);
            
            JTextField text1=new JTextField();
            text1.setBounds(150,30,250,25);
            screen.add(text1);
            
            
            screen.setBounds(20, 20, 700, 500);
            screen.setLayout(null);
            screen.setVisible(true);
            
            

            
      }
}


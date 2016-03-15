package araay;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Graphiv extends JFrame{
	private JTextField one;
	private JPasswordField two;
	private JTextField three;
	
	public Graphiv(){
		super("The title bar");
		setLayout(new FlowLayout());
		one=new JTextField(10); 
		add(one);
		two=new JPasswordField("mypass");
		add(two);
	    three=new JTextField("Otieno");
	    add(three);
	    
	    handoler hand =new handoler();
	    one.addActionListener(hand);
	    two.addActionListener(hand);
	    three.addActionListener(hand);
	     
	}
      private class handoler implements ActionListener{
    	  public void actionPerformed(ActionEvent eve){
    		  String string="";
    		  if (eve.getSource()==one)
    			  string=String.format("the first is %s",eve.getActionCommand());
    		  else if (eve.getSource()==two)
    			  string=String.format("the password is %s", eve.getActionCommand());
    		  else if (eve.getSource()==three)
    			  string=String.format("the third name is %s", eve.getActionCommand());
    		  JOptionPane.showMessageDialog(null,string);
    		  
    		  
    		
    	  }
      }
}

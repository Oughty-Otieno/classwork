package araay;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkin extends JFrame{
	private JTextField check0;
    private	JCheckBox check1;
	private JCheckBox check2;
	
	public Checkin(){
		super("the checkboxes");
		setLayout(new FlowLayout());
		check0=new JTextField("this is a text statement");
		check0.setFont(new Font("Serif",Font.PLAIN,14));
		add(check0);
		check1=new JCheckBox("Bold");
		check2=new JCheckBox("itallic");
		add(check1);
		add(check2);
		hanler han=new hanler();
		check1.addItemListener(han);
		check2.addItemListener(han);
	}
	private class hanler implements ItemListener{
	
    public void itemStateChanged(ItemEvent event){
    	 Font font=null;
    	if (check1.isSelected()&&check2.isSelected())
     		font=new Font("Serif", Font.BOLD + Font.ITALIC,14);
     	
    	else if(check1.isSelected())
    		font=new Font("Serif",Font.BOLD,14);
    	else if(check2.isSelected())
    		font=new Font("Serif",Font.ITALIC,14);
    	
    	
    	 check0.setFont(font);  
	
		
	}
}
	}
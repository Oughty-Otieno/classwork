package araay;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

import javax.swing.JButton;

public class Button extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JTextField Texto;
	private JCheckBox nat;
	
	public Button(){
		super("this are buttons");
		setLayout(new FlowLayout());
		button1= new JButton("Button1");
		add(button1);
		button2=new JButton("Button2");
		add(button2);
		button3=new JButton("Button3");
		add(button3);
		button4=new JButton("Button4");
		add(button4);
		Texto=new JTextField("this message cannot be edited by anyone");
		Texto.setEditable(false);
		add(Texto);
		nat = new JCheckBox("Nationality");
		add(nat);
		
		
		Hand hand=new Hand();
		button1.addActionListener(hand);
		button2.addActionListener(hand);
		button3.addActionListener(hand);
		button4.addActionListener(hand);
	}
		
		private class Hand implements ActionListener{
			
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(Button.this,String.format("you pressed %s", event.getActionCommand()));
				// TODO Auto-generated method stub
				
			}

			

			}

			// TODO Auto-generated method stub
			

}
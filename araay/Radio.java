package araay;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;

public class Radio extends JFrame{

	private Font bold;
	private Font italic;
	private Font bolditalic;
	private Font plain;
	private JTextField text;
	private JRadioButton BOLD;
	private JRadioButton ITALIC;
	private JRadioButton BOLDITALIC;
	private JRadioButton PLAIN;
	private ButtonGroup RadioGroup;
	private Font plainFont;
	public Radio(){
		super("the radio buttons");
		setLayout(new FlowLayout());
		bold=new Font("Serif",Font.BOLD,14);
		italic=new Font("Serif",Font.ITALIC,14);
		Font plainFont = new Font( "Serif", Font.PLAIN, 14 ); 
		bolditalic=new Font("Serif",Font.BOLD+Font.ITALIC,14);
		text =new JTextField("this is the test statement");
		text.setFont(plainFont);
		PLAIN=new JRadioButton("plain",true);
		BOLD=new JRadioButton("theBold",true);
		ITALIC=new JRadioButton("theitalic",true);
		BOLDITALIC=new JRadioButton("twos",true);
		add(text);
		add(PLAIN);
		add(BOLD);
		add(ITALIC);
		add(BOLDITALIC);
		
	RadioGroup = new ButtonGroup();
	RadioGroup.add(PLAIN);
	RadioGroup.add(BOLD);
	RadioGroup.add(ITALIC);
	RadioGroup.add(BOLDITALIC);
	
	PLAIN.addItemListener(new hanler(plainFont));
	BOLD.addItemListener(new hanler( bold));
	ITALIC.addItemListener(new hanler(italic));
    BOLDITALIC.addItemListener(new hanler(bolditalic));
    
	}
	private class hanler implements ItemListener{
		private Font font;
		public hanler(Font f){
			font=f;
		}
		public void itemStateChanged(ItemEvent event){
			text.setFont(font);
		}
}
		
	}

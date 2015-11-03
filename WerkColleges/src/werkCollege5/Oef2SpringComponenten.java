package werkCollege5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

public class Oef2SpringComponenten extends JFrame{
	
	//UI elements
	private JButton b = new JButton("Klik mij");
	private JButton b2 = new JButton("Klik mij 2");
	private JTextField tf = new JTextField(20);
	private JRadioButton o1 = new JRadioButton("optie1");
	private JRadioButton o2 = new JRadioButton("optie2");
	private JRadioButton o3 = new JRadioButton("optie3");
	private JCheckBox c1 = new JCheckBox("vink mij");


	Oef2SpringComponenten(){
		
		Container c = this.getContentPane();
		SpringLayout s1 = new SpringLayout();
		c.setLayout(s1);
		c.add(b);
		c.add(tf);
		
		JPanel panel = new JPanel(s1);
		panel.add(b2);
		panel.add(o2);
		panel.setBackground(Color.RED);
		
		
		JFrame f1 = new JFrame();
		Container c2 = f1.getContentPane();
		f1.getContentPane().add(panel);
		
		c.add(c2);
		
		
		s1.putConstraint(SpringLayout.HORIZONTAL_CENTER, b, 0, SpringLayout.HORIZONTAL_CENTER, c);
		s1.putConstraint(SpringLayout.NORTH, b, 10, SpringLayout.NORTH, c);

		s1.putConstraint(SpringLayout.HORIZONTAL_CENTER, tf, 0, SpringLayout.HORIZONTAL_CENTER, c);
		s1.putConstraint(SpringLayout.NORTH, tf, 10, SpringLayout.SOUTH, b);

		//s1.putConstraint(SpringLayout.EAST, tf, -20, SpringLayout.EAST, c);
		
		//test
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
	}
	
	
	public static void main(String args[]){
		Oef2SpringComponenten w = new Oef2SpringComponenten();
		w.setVisible(true);
	}
}

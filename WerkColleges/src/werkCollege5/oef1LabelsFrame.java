package werkCollege5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class oef1LabelsFrame extends JFrame {

	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();

	private JButton b = new JButton("OK");
	private JTextField tf = new JTextField("test",20);
	
	public oef1LabelsFrame(){
		
		Container c = this.getContentPane();
		SpringLayout s1 = new SpringLayout();
		c.setLayout(s1);
		c.add(tf);
		s1.putConstraint(SpringLayout.EAST, tf, -20, SpringLayout.EAST, c);
		s1.putConstraint(SpringLayout.NORTH, tf, 5, SpringLayout.NORTH, c);
		c.add(b);
		s1.putConstraint(SpringLayout.EAST, b, -20, SpringLayout.EAST, c);
		s1.putConstraint(SpringLayout.NORTH, b, 5, SpringLayout.SOUTH, tf);
//		s1.putConstraint(SpringLayout.NORTH, b, -50, SpringLayout.SOUTH, c);
		
//		p1.setLayout(new BorderLayout());
//		p1.add(new JLabel("tekst"),BorderLayout.NORTH);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.RED);
//		p2.setBackground(Color.GREEN);
//		p1.setBackground(Color.BLUE);

		this.getContentPane().add(p3,BorderLayout.WEST);
//		this.getContentPane().add(p2, BorderLayout.EAST);
//		p1.add(p3, BorderLayout.WEST);
		//create window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);

	}
	
	public static void main(String args[]){
		oef1LabelsFrame w = new oef1LabelsFrame();
		w.setVisible(true);

	}
	


	

	

}

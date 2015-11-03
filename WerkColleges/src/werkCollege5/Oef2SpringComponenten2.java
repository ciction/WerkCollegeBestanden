package werkCollege5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.plaf.DimensionUIResource;
import javax.tools.DiagnosticCollector;

public class Oef2SpringComponenten2 extends JFrame{
	
	
	//UI elements
	private JButton b = new JButton("Klik mij");
	private JButton b2 = new JButton("Klik mij 2");
	private JTextField tf = new JTextField(20);
	private JRadioButton o1 = new JRadioButton("optie1");
	private JRadioButton o2 = new JRadioButton("optie2");
	private JRadioButton o3 = new JRadioButton("optie3");
	private JCheckBox c1 = new JCheckBox("vink mij");

	WindowListener wlstnr = new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowOpened");
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowIconified");
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowDeiconified");
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowDeactivated");
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowClosing");
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowClosed");
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowActivated");
		}
	};
	
	
	 
	Oef2SpringComponenten2(){
		
		
		 this.addWindowListener(wlstnr);
		 	
		 
		
		//create main container (JPanel)
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
	

		JPanel panel1 = new JPanel();
		JPanel innerPanel = new JPanel();
		//JPanel panel2 = new JPanel();

		//panel 1
		panel1.setBackground(Color.WHITE);
		innerPanel.setBackground(Color.RED);
		SpringLayout s1 = new SpringLayout();
		panel1.setLayout(s1);
		panel1.add(b);
		panel1.add(tf);
		panel1.add(innerPanel);
		
		s1.putConstraint(SpringLayout.HORIZONTAL_CENTER, b, 0, SpringLayout.HORIZONTAL_CENTER, panel1);
		s1.putConstraint(SpringLayout.NORTH, b, 10, SpringLayout.NORTH, panel1);

		s1.putConstraint(SpringLayout.HORIZONTAL_CENTER, tf, 0, SpringLayout.HORIZONTAL_CENTER, panel1);
		s1.putConstraint(SpringLayout.NORTH, tf, 10, SpringLayout.SOUTH, b);
		
		//innerPanel.setPreferredSize(new Dimension(200,200));
		s1.putConstraint(SpringLayout.HORIZONTAL_CENTER, innerPanel, 0, SpringLayout.HORIZONTAL_CENTER, panel1);
		s1.putConstraint(SpringLayout.NORTH, innerPanel, 10, SpringLayout.SOUTH, tf);
		
		//innerpanel
		innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.X_AXIS));
		innerPanel.add(o1);
		innerPanel.add(o2);
		innerPanel.add(o3);
		
		//panel 2
		//panel2.setBackground(Color.gray);
		//panel1.set[Preferred/Maximum/Minimum]Size()

		container.add(panel1);
		//container.add(panel2);
		
		
		//attach main JPannel (container) to window
		this.setContentPane(container);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set window size
		this.setMinimumSize(new Dimension(300, 300));
		this.setSize(400, 400);
	}
	
	
	public static void main(String args[]){
		Oef2SpringComponenten2 w = new Oef2SpringComponenten2();
		w.setVisible(true);
	}
}

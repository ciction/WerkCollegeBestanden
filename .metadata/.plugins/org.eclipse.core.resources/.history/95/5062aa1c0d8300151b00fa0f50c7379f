package SoftwareProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main {

	static JComponent previousElement = null;
//	JScrollPane scroll = null;
//	JPanel panelInsideScrollPane = null;


	
	public static void main(String args[]){
		System.out.println("hello jpannel");
		
		//TestWindow window = new TestWindow();
		//window.setVisible(true);
		//JpanelTest jp = new JpanelTest();
		
		 final JFrame frame = new JFrame("Test");
		 final JFrame frame2 = new JFrame("window 2");
		
		 //frame.setLayout(layout);
		 
		 
		// ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		 final JScrollPane scroll = new JScrollPane();
		 frame.setLayout(new BorderLayout());
		// frame.add(scrollPane,BorderLayout.CENTER);
		 frame.add(scroll);
		 frame.pack();

		 final JPanel panelInsideScrollPane = new JPanel();

		 final SpringLayout layout = new SpringLayout();
		 panelInsideScrollPane.setLayout(layout);
		 scroll.setViewportView(panelInsideScrollPane);
		 
		 //panel inside --> springlayout larger than the scrollpane
		// panelInsideScrollPane.setPreferredSize(new Dimension(panelInsideScrollPane.getWidth(), 800));
	     scroll.setPreferredSize(new Dimension(500,500));

		    JButton b1 = new JButton("click");
		    panelInsideScrollPane.add(b1);
		    previousElement = b1;
		    
		    b1.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent e) {
		            SwingUtilities.invokeLater(new Runnable() {
		                @Override
		                public void run() {
		                	JLabel newElement = new JLabel("Bla");
		                	layout.putConstraint(SpringLayout.NORTH, newElement,25,SpringLayout.SOUTH, previousElement);
		                	previousElement = newElement;
//		                	
//		                	JpanelTest newElement = new JpanelTest();
//		                	newElement.setVisible(true);
//		                	layout.putConstraint(SpringLayout.NORTH, newElement,10,SpringLayout.SOUTH, previousElement);
//		                	previousElement = newElement;
		                	
//		            		 panelInsideScrollPane.setPreferredSize(new Dimension(panelInsideScrollPane.getWidth(), 1500));

		                	panelInsideScrollPane.setPreferredSize(frame.getPreferredSize());
		                	panelInsideScrollPane.setSize(panelInsideScrollPane.getPreferredSize());
		                	System.out.println("panel prefered size: = " + panelInsideScrollPane.getPreferredSize());
		                	panelInsideScrollPane.doLayout();
//		                	 frame.pack();
		                	 
		                	scroll.repaint();
		                	panelInsideScrollPane.revalidate();
		                	frame.setSize(frame.getPreferredSize());
		                	System.out.println("frame prefered size: = "+  frame.getPreferredSize());

		                	frame.pack();

		                	panelInsideScrollPane.add(newElement);
		                	panelInsideScrollPane.validate();
		                	panelInsideScrollPane.repaint();
		                	
		                	//close window
		                	//frame.dispose();
		                	frame2.dispose();
		                }
		            });
		        }
		    });
		    SwingUtilities.invokeLater(new Runnable() {
		        @Override public void run() {
		            frame.setVisible(true);
		        }
		    });
		    

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(500, 600);
		    
//		    frame2.setSize(500, 600);
//		    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		    frame2.setVisible(true);

		    
	}
}

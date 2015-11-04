package SoftwareProject;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;

public class TextFieldsExample {
	public static void main(String args[]) {
		
		//Create window
        JFrame frame = new JFrame("SpringLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        
        //Create scrollpane
        JScrollPane scroll = new JScrollPane();
        
        //Create next button and bottom pannel for it
        JButton next = new JButton("Next");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(next);
        
       
        //Create Main springlayout panel
        SpringLayout layout = new SpringLayout();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(layout);
        //window content
        contentPane.setLayout(new BorderLayout());


        int j = 25;
        for(int i =0;i<18;i++){
            JLabel label = new JLabel("Enter Name " + i );
            JTextField text = new JTextField(15);

        mainPanel.add(label);
        mainPanel.add(text);
        layout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST,
                        contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, j, SpringLayout.NORTH,
                        contentPane);
        layout.putConstraint(SpringLayout.NORTH, text, j, SpringLayout.NORTH,
                        contentPane);
        layout.putConstraint(SpringLayout.WEST, text, 20, SpringLayout.EAST,
                        label);
        j+=30;
        }
        mainPanel.setPreferredSize(new Dimension(mainPanel.getWidth(), 1500));
        scroll.setPreferredSize(new Dimension(500,500));
        scroll.setViewportView(mainPanel);
        contentPane.add(scroll);
        contentPane.add(buttonPanel,BorderLayout.SOUTH);
        //mainWindow.add(contentPane);
        frame.setSize(500, 600);
        frame.setVisible(true);
}
}

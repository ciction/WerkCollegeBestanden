package SoftwareProject;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.DropMode;
import javax.swing.JComboBox;

public class JpanelTest extends JPanel {

	/**
	 * Create the panel.
	 */
	public JpanelTest() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea txtrTextAreaTest = new JTextArea();
		txtrTextAreaTest.setLineWrap(true);
		txtrTextAreaTest.setRows(5);
		txtrTextAreaTest.setText("text area test ksjad\tkdjsdhdvn\tddfsdg\t\t");
		this.add(txtrTextAreaTest);
		
		JComboBox comboBox = new JComboBox();
		this.add(comboBox);


	}

}
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	
	// view elements
	private JButton button = new JButton("load file");
	private JLabel label = new JLabel("i am a label");
	private JTextField textField = new JTextField("i am a text field");
	
	
	// constructor
	public View() {
		
		// if the x is clicked, do nothing (NOT closing!)
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		// main panel
		JPanel mainPanel = new JPanel();
		mainPanel.add(button);
		mainPanel.add(label);
		mainPanel.add(textField);
		
		// crop the frame size corresponding to its stored elements
		this.add(mainPanel);
		this.pack();	// overwrites this.setSize(...) !
	}
	
	// add a listener for the closing events
	public void addDialogWindowListener(WindowListener listener) {
		this.addWindowListener(listener);
	}
	
	public void addFileOpenerListener(ActionListener listener) {
		button.addActionListener(listener);
	}
	
}

package control;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class DialogWindowListener extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		
		// just close the main window if "ok" is clicked
		int option = JOptionPane.showConfirmDialog(null, "Programm beenden?");
		if (option == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}
}

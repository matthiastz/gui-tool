package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class FileOpenerListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		final JFileChooser fileChooser = new JFileChooser();
		
		// TODO: can specify, where the dialogue should be placed, in relation to parent ui component
		// for now, its null (not set)
		fileChooser.showOpenDialog(null);
		
	}

}

package control;

import model.Model;
import view.View;

public class Controller {
	private Model model;
	private View view;
	
	
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
		
		// add a event listener for the closing "x"
		this.view.addDialogWindowListener(new DialogWindowListener());
		this.view.addFileOpenerListener(new FileOpenerListener());
	}
	
	
	// should call methods from the model if an event happens etc.

}

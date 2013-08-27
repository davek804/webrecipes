package net.davidjkelley.recipes.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProcessInterface extends VerticalPanel {
	Button completeButton;
	
	public ProcessInterface() {
		Label lol = new Label("lol - " + getName());
		add(lol);
		completeButton = new Button("I finished this process");
		add(completeButton);
	}
	
	public String getName() {
		double nn = Math.random()*10 + 1;
		int n = (int) nn;
		return "Process " + Integer.toString(n);
	}

}

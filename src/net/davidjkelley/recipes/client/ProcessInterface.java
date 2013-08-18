package net.davidjkelley.recipes.client;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProcessInterface extends VerticalPanel {
	
	public ProcessInterface() {
		Label lol = new Label("lol - " + getName());
		add(lol);
	}
	
	public String getName() {
		return Double.toString(Math.random());
	}

}

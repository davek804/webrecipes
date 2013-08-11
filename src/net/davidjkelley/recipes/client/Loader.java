package net.davidjkelley.recipes.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Loader implements EntryPoint {
	
	public static MainInterface mainInterface = null;
	
	public void onModuleLoad() {
		mainInterface = new MainInterface();
	    RootPanel.get("applicationDialogBox").add(mainInterface);
	}

}

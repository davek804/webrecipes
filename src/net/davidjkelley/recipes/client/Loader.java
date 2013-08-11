package net.davidjkelley.recipes.client;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;


public class Loader implements EntryPoint {
	
	public static MainInterface mainInterface = null;
	
	public void onModuleLoad() {
		mainInterface = new MainInterface();
		mainInterface.show();
	    RootPanel.get().add(mainInterface);
	}

}

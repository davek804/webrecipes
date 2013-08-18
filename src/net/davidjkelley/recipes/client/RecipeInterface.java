package net.davidjkelley.recipes.client;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class RecipeInterface extends VerticalPanel {
	String recipe;
	MainInterface mainInterface;
	TabLayoutPanel tabPanel;
	DialogBox content;
	Set<ProcessInterface> processes = new HashSet<ProcessInterface>();
	
	public RecipeInterface(String passedRecipe, MainInterface passedMainInterface) {
		this.recipe = passedRecipe;
		this.mainInterface = passedMainInterface;
		
		int n = 4;
		for (int j = 0; j < n; j++) {
		processes.add(new ProcessInterface());
		}
		init();
	}
 public void init() {
	 tabPanel = new TabLayoutPanel(2.2, Unit.EM);
	 tabPanel.setAnimationDuration(500);
	 for (ProcessInterface pI : processes) {
		 tabPanel.add(pI, pI.getName());
	 }
	 
	 tabPanel.setSize("50em", "50em");
//	 tabPanel.add(new HTML("this content"), "this");
//	 tabPanel.add(new HTML("that content"), "that");
//	 tabPanel.add(new HTML("the other contentr"), "theOther");
	 this.add(tabPanel);
 }

}

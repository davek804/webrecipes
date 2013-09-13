package net.davidjkelley.recipes.client;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProcessInterface extends VerticalPanel {
	String[] ingredients = {"One -- 23mg", "Two -- 77 kj/h", "Three 3 A.U."};
	
	public ProcessInterface() {
		this.setStyleName("processInterface");
		
		FlexTable ingredientsFlexTable = new FlexTable();
		ingredientsFlexTable.setWidget(0, 0, new HTML("<p>Ingredients:</p><ul>"));
		int j = 1;
		for (String s : ingredients) {
			ingredientsFlexTable.setWidget(j, 0, new HTML("<li>" + ingredients[j-1] + "</li>"));
			j++;
		}
		ingredientsFlexTable.setWidget(j, 0, new HTML("</ul>"));
	
		int row = 0;
		while (row < ingredientsFlexTable.getRowCount()) {
		ingredientsFlexTable.getFlexCellFormatter().setWidth(row, 0, "777px");
		row++;
		}
		this.add(ingredientsFlexTable);
	}
	
	public String getName() {
		double nn = Math.random()*10 + 1;
		int n = (int) nn;
		return "Process " + Integer.toString(n);
	}

}

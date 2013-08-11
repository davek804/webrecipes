package net.davidjkelley.recipes.client;

import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;

public class MainInterface extends com.google.gwt.user.client.ui.DialogBox {
	Button recipeSaveButton = new Button("Save Recipe");
	Label selectRecipeLabel = new Label("Select Recipe: ");
	String[] toBeDBisfied = {"one", "two", "three"};
	EasyListBox<String> recipeDropDown = new EasyListBox<String>();
	Button addRecipeButton = new Button("+");
	//JPanel recipePanel = new JPanel();
	FlexTable recipeFlexTable = new FlexTable();
	
	public MainInterface() {
		
		for (String string : toBeDBisfied ) {
			recipeDropDown.addItem(string);
		}
		
		recipeDropDown.setSelectedIndex(0);
		recipeDropDown.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
			}
			});
		
		this.add(recipeFlexTable);
		recipeFlexTable.setWidget(0, 0, selectRecipeLabel);
		recipeFlexTable.setWidget(0,1,recipeDropDown);
		addRecipeButton.addClickHandler(new AddRecipeListener());
		recipeFlexTable.setWidget(0,2,addRecipeButton);
        recipeSaveButton.addClickHandler(new SaveRecipeListener());   

		recipeFlexTable.setWidget(0,3,recipeSaveButton);

	}
	
	public class RecipeDropDownListener implements ClickHandler {
		public void onClick(ClickEvent e) {
			//TODO - will eventually return the name of the recipe and populate the recipe interface
			System.out.println(e.getSource().toString());
		}
	}
	
	public class AddRecipeListener implements ClickHandler {
		public void onClick (ClickEvent e) {
//			final JFrame junk = new JFrame("Add a new recipe");
//			//TODO - find a way to make this size dynamic again!
//			junk.setSize(150,150);
//			final JTextField newRecipeTextBox = new JTextField(10);
//			JPanel region = new JPanel();
//			JLabel newRecipeLabel = new JLabel("Name: ");
//			region.add(newRecipeLabel);
//			region.add(newRecipeTextBox);
//			JButton cancel = new JButton("Cancel");
//			cancel.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					//TODO - make better memory management
//					junk.setVisible(false);
//				}
//			});
//			JButton okay = new JButton("Save");
//			okay.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					if (newRecipeTextBox.getText().length() >= 1){
//						
//						//TODO - memory mgmt as well as dB interaction needs
//						//to be implement
//						System.out.println("Closed with a save of: " + newRecipeTextBox.getText());
//						junk.setVisible(false);
//					}
//					else {
//						return;
//					}
//					}
//				
//			});
//			region.add(cancel);
//			region.add(okay);
//			junk.add(region);
//			junk.setVisible(true);
			
		}
	}
	
	public class SaveRecipeListener implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			System.out.println("Save Recipe button clicked");
			
		}
	}
//	public class CheckBoxListener implements ItemListener  {
//		
//		   public void itemStateChanged(ItemEvent e) {
//			   System.out.println("Changed");
//		   }
//		
//	}
}

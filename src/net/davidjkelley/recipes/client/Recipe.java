package net.davidjkelley.recipes.client;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	ArrayList<String> ingredients = new ArrayList<String>();
	ArrayList<Process> processes = new ArrayList<Process>();
	String title;
	
	public Recipe(String[] ingredients, List<Process> processes, String title) {
		for (String ingredient : ingredients) {
			this.ingredients.add(ingredient);
		}
		for(Process process: processes) {
			this.processes.add(process);
		}
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

}

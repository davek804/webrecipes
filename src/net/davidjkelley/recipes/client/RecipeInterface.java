package net.davidjkelley.recipes.client;

public class RecipeInterface {
	String recipe;
	MainInterface mainInterface;
	
	public RecipeInterface(String passedRecipe, MainInterface passedMainInterface) {
		this.recipe = passedRecipe;
		this.mainInterface = passedMainInterface;
		init();
	}
 public void init() {
	 System.out.println(recipe);
 }
}

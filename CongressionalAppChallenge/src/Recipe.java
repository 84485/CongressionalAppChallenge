import java.util.ArrayList;

public class Recipe {
	public static ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
	private static ArrayList<Ingredient> getRecipeIngredients(){
		return recipeIngredients;
	}
	private static void setRecipeIngredients(ArrayList<Ingredient> temp){
		recipeIngredients = temp;
	}
	private static void setRecipeIngredients(int position, Ingredient value){
		recipeIngredients.set(position, value);
	}
}


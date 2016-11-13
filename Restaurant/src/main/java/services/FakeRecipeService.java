package services;

import recipe.Recipe;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by U0148394 on 11/13/2016.
 */
public class FakeRecipeService implements RecipeService {
    private static Map<Integer, Recipe> recipes = new HashMap<Integer, Recipe>(){
        {
            put(1, new Recipe(1, "Spicy Lentil Pot"));
            put(2, new Recipe(2, "Bread and Water"));
        }
    };
    public Recipe getRecipeById(Integer id) {
        return recipes.get(id);
    }
}

package actions.recipes;

import com.opensymphony.xwork2.ActionSupport;
import recipe.Recipe;
import services.FakeRecipeService;
import services.RecipeService;

/**
 * Created by U0148394 on 11/13/2016.
 */
public class ShowAction extends ActionSupport {
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    RecipeService recipeService = new FakeRecipeService();
    @Override
    public String execute() throws Exception {
        if(recipe == null){
            return "notfound";
        }
        recipe = recipeService.getRecipeById(recipe.getId());
        return recipe == null ? "notfound": SUCCESS;
    }
}

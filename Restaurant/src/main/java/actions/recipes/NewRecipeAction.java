package actions.recipes;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang.StringUtils;
import recipe.Recipe;

/**
 * Created by U0148394 on 11/5/2016.
 */
public class NewRecipeAction extends ActionSupport{
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void validate() {
        if(recipe == null){
            addFieldError("recipe.name", getText("recipe.name"));
            return;
        }
        if(StringUtils.isBlank(recipe.getName())){
            addFieldError("recipe.name", getText("recipe.name"));
        }
        if(StringUtils.isBlank(recipe.getIngredients())){
            addFieldError("recipe.ingredients", getText("recipe.ingredients"));
        }
    }

    @Override
    public String execute() throws Exception {
        System.out.println(recipe.toString());
        return SUCCESS;
    }

}

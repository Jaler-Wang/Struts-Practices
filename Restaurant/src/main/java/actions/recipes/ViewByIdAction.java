package actions.recipes;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import recipe.Recipe;


/**
 * Created by U0148394 on 11/13/2016.
 */
public class ViewByIdAction extends ActionSupport {

    Recipe recipe = null;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


    public void processValidate() {
        if(recipe == null || recipe.getId() == null){
            addFieldError("recipe.id", "recipe id cannot be null");
        }
    }

    @Override
    public String execute() throws Exception {
        System.out.println("recipe id is " + recipe);
        return SUCCESS;
        
    }

    @Action(value="view-by-id-process",
        results = {
            @Result(name=INPUT, location = "view-by-id.jsp"),
                @Result(name=SUCCESS, type = "redirectAction",
                        location = "show", params = {"recipe.id", "%{recipe.id}"})
        }
    )
    public String process(){
        System.out.println(recipe);
        return SUCCESS;
    }
}

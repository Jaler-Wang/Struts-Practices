package convention.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by U0148394 on 11/6/2016.
 */
public class SantiyAction extends ActionSupport {
    public String execute(){
        System.out.println("Hello from SantiyAction");
        return "success";
    }
}

package actions.i18n.sub;

import actions.i18n.TextExampleAction;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


/**
 * Created by U0148394 on 11/6/2016.
 */
public class TextExampleSubAction extends TextExampleAction {
    @Action(
            value = "/text-example-sub",
            results = {
                    @Result(name = "success", location = "i18n/text-example-sub.jsp")
            }

    )
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}

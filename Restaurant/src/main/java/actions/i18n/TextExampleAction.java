package actions.i18n;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


/**
 * Created by U0148394 on 11/6/2016.
 */
public class TextExampleAction extends ActionSupport implements TextInterface {
    private static Log log = LogFactory.getLog(TextExampleAction.class);

    private String text1;

    public String getText1() {

        return text1;
    }
    @Action(
            value="/text-example",
            results = {
                    @Result(name = "success", location = "/WEB-INF/jsps/i18n/text-example.jsp")
            }
    )
    public String execute() throws Exception {
//        log.debug(getText("from.class.props"));
        System.out.println(getText("from.class.props"));
        text1 = getText("from.class.props");
        return SUCCESS;
    }
}

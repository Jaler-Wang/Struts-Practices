package convention.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by U0148394 on 11/6/2016.
 */
public class WhichresultAction extends ActionSupport {
    private long ctm;

    public long getCtm() {
        return ctm;
    }

    @Action(
            value = "/tristate",
            results = {
                    @Result(name = "three", location = "/WEB-INF/jsps/tristate/tristate-three.jsp"),
                    @Result(name = "six", location = "/WEB-INF/jsps/tristate/tristate-six.jsp"),
                    @Result(name = "nine", location = "/WEB-INF/jsps/tristate/tristate-nine.jsp")
            }
    )
    public String tristate() {
        ctm = System.currentTimeMillis();
        long tmp = ctm % 10L;
        if (tmp <= 3) return "three";
        if (tmp <= 6) return "six";
        return "nine";
    }

    public String execute() {
        ctm = System.currentTimeMillis();
        return ((ctm & 1L) == 1L) ? "odd" : "even";
    }
}

package iterator.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by U0148394 on 11/16/2016.
 */
public class IteratorPractiseAction extends ActionSupport {
    public List<Integer> getData() {
        return data;
    }

    public List<Integer> data;
    public IteratorPractiseAction(){
        data = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            data.add(i);
        }
    }

    @Override
    @Action( value = "iterator-practise",
            results = {
                    @Result(name="success", location="iterator/iterator-practise-success.jsp")
            }
    )
    public String execute() throws Exception {
        System.out.println("------------------");
        System.out.println(data);
        System.out.println("------------------");
        return SUCCESS;
    }
}

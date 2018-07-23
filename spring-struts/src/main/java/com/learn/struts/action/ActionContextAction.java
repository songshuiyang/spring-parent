package com.learn.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

/**
 * 通过 ActionContext 访问Servlet API
 *
 * @author songshuiyang
 * @date 2018/7/23 22:27
 */
@Component
public class ActionContextAction extends ActionSupport {

    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();


        System.out.println(actionContext.getApplication());
        return SUCCESS;
    }

    public String actionContext() {
        return SUCCESS;
    }
}

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

    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();


        System.out.println(actionContext.getApplication());
        return super.execute();
    }
}

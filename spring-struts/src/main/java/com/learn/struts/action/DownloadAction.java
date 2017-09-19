package com.learn.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/9/19 16:36
 */
@Component
public class DownloadAction extends ActionSupport {

    private String inputPath;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * 下载文件的路口
     *
     * @return
     * @throws Exception
     */
    public InputStream getTargetFile() throws Exception {
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }
}

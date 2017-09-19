package com.learn.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/9/19 15:07
 */
@Component
public class UploadAction extends ActionSupport {
    private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Override
    public String execute() throws Exception {
        // 以服务器的文件保存地址和原文件名建立上传文件输出流
        String target = ServletActionContext.getServletContext().getRealPath("uploadFile");
        FileOutputStream fos = new FileOutputStream(target + "\\" + getUploadFileName());
        FileInputStream fis = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        return SUCCESS;
    }
}

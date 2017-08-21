package com.learn.utilsTest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;
import org.springframework.core.io.support.EncodedResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/13 20:11
 */
public class FileSourceExample {

    public static void main (String[] args){
        String filePath = "D:/test.txt";
        try {
            // 使用系统文件路径方式加载文件 WritableResource 可写资源接口
            WritableResource writableResource = new PathResource(filePath);
            OutputStream outputStream = writableResource.getOutputStream();
            outputStream.write("Spring IOC学习".getBytes());
            outputStream.close();
            // 使用类路径方式加载文件
            Resource resource = new ClassPathResource("config/application.properties");
            // 采用特定的编码方式加载文件
            EncodedResource encodedResource =new EncodedResource(resource,"UTF-8");
            System.out.println(encodedResource.getReader());

            InputStream inputStream = resource.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i;
            while ( (i = inputStream.read()) != -1 ){
                byteArrayOutputStream.write(i);
            }
            System.out.println(byteArrayOutputStream.toString());
            System.out.println(writableResource.getFilename());
            System.out.println(resource.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.shiro.learn.encoded;


import org.apache.shiro.codec.Base64;
import org.springframework.util.Assert;

/**
 * @author songsy
 * @Package com.shiro.learn.encoded
 * @Title:
 * @Description:
 * @date 2017/11/22
 */
public class encoded {
    public static void main(String[] args) {
        String str = "hello world";
        String base64Encoded = Base64.encodeToString(str.getBytes());
        String str2 =Base64.decodeToString(base64Encoded);
        System.out.println(str);
        System.out.println(str2);
    }

}

package com.shiro.learn.test;

import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

import java.security.Key;

/**
 * @author songsy
 * @Package com.shiro.learn.test
 * @Title: 编码/加密
 * @Description:
 * @date 2017/11/22
 */
public class EncodedTest {
    /**
     *
     */
    @Test
    public void test1() {
        // 散列算法生成散列值
        String passWord = "hello";
        String salt = "123";
        String md5 = new Md5Hash(passWord, salt).toString();//还可以转换为 toBase64()/toHex()
        System.out.println(md5);
    }

    /**
     * 称式加密/解密算法的支持，AES
     *
     */
    @Test
    public void test2() {
        AesCipherService aesCipherService = new AesCipherService();
        aesCipherService.setKeySize(128); //设置key长度
        //生成key
        Key key = aesCipherService.generateNewKey();
        String text = "hello";
        //加密
        String encrptText = aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();
        System.out.println(encrptText);
        //解密
        String text2 = new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());
        System.out.println(text2);
    }
}

package com.smart.boot.el;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2018/1/14 15:18
 */
@Configuration
@ComponentScan("com.smart.boot.el")
@PropertySource("classpath:el.properties")
public class ELConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 注入普通字符串
     */
    @Value("songsy")
    private String str;
    /**
     * 通过el注入操作系统属性
     */
    @Value("# {systemProperties['os.name']}")
    private String osName;
    /**
     * 表达式结果
     */
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;
    /**
     * 注入其他Bean属性
     */
    @Value("#{eLService.another}")
    public String fromAnothor;
    /**
     * 注入文件资源
     */
    @Value("classpath:el.properties")
    private Resource testFile;
    /**
     * 注入网站资源
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;
    /**
     * 注入配置文件
     */
    @Value("${book.name}")
    private String bookName;

    /**
     * 环境配置
     * 环境在容器中是一个抽象的集合，是指应用环境的2个方面: profiles和 properties.
     * profile:
     * 配置是一个被命名的，bean定义的逻辑组，这些bean只有在给定的profile配置激活时才会注册到容器。不管是XML还是注解，
     * Beans都有可能指派给profile配置。Environment环境对象的作用，对于profiles配置来说，它能决定当前激活的是哪个profile配置，和哪个profile是默认。
     * Properties:
     * 扮演一个非常重要的角色,可能来源于一下源码变量:properties文件，JVM properties,system环境变量，JNDI, servlet context parameters上下文参数,
     * 专门的Properties对象，Maps等等。Environment对象的作用，对于properties来说，是提供给用户方便的服务接口，方便撰写配置、方便解析配置。
     * 作者：不迷失
     * 链接：https://www.jianshu.com/p/49e950b0b008
     * 來源：简书
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    @Autowired
    private Environment environment;

    /**
     * 若使用@Value注入, 则要配置一个PropertySourcesPlaceholderConfigurer
     *
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void print() throws Exception {
        logger.info("str: " + str);
        logger.info("osName: " + osName);
        logger.info("randomNumber: " + String.valueOf(randomNumber));
        logger.info("fromAnothor: " + fromAnothor);
        logger.info("testFile: " + IOUtils.toString(testFile.getInputStream()));
        logger.info("testUrl: " + IOUtils.toString(testUrl.getInputStream()));
        logger.info("bookName: " + bookName);
        logger.info("environment: " + environment.getProperty("book.author"));
    }


}

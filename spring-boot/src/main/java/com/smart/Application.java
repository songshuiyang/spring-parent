package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/13 11:28
 */
@SpringBootApplication
@EnableTransactionManagement  /*开启事物支持，相当于<tx:annotation-driven/> 只要在方法上加 @Transactional 即可支持事物*/
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer{
/*
    *//**
     * 添加自定义事物管理器
     * @param dataSource
     * @return
     *//*
    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }*/

    /**
     * 配置 Spring Mvc
     * @param application
     * @return
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }
}

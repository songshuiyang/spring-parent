package com.learn.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/9/15 9:45
 */
@WebFilter(filterName = "log", urlPatterns = {"/*"})
public class WebFilterTest implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // FilterConfig 可以访问Filter的配置信息
    private FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException {
        config = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletContext context = config.getServletContext();
        long before = System.currentTimeMillis();
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        logger.debug("Filter 已经截取到用户请求的地址" + httpServletRequest.getServletPath());
        chain.doFilter(request, response);
        long after = System.currentTimeMillis();
        logger.debug("过滤结束,请求被定位到" + httpServletRequest.getRequestURI() + "所花时间为" + (after - before));
    }

    public void destroy() {
        config = null;
    }
}

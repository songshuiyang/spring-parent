package com.learn.mvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author songshuiyang
 * @title: 测试 servlet3.0 注解 @WebServlet
 * @description:
 * @date 2017/9/15 0:02
 */
@WebServlet(urlPatterns = {"/webServletTest"}, loadOnStartup = 1)
public class WebServletTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is ");
        out.print(this.getClass());
        out.println(",  测试 servlet3.0 注解 @WebServlet method ");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
}

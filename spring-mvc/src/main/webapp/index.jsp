<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="error.jsp" %>
<html>
<body>
<h2>Hello World!</h2>

<% out.println(new java.util.Date()); %>

<%!
    public int count;

    public String info() {
        return "hello";
    }
%>
<br/>
count:<%=count++%>
<br/>
<%=info()%>
</body>
<br/>
## 测试JSP useBean setProperty getProperty
<br/>
<b>scope:request page session application</b>
<br/>
<jsp:useBean id="test" class="com.learn.mvc.demain.User"/>
<jsp:setProperty name="test" property="realName" value="songshuyang"/>
<jsp:setProperty name="test" property="passWord" value="123456"/>
<jsp:getProperty name="test" property="realName"/>
<jsp:getProperty name="test" property="passWord"/>

<br/>
## 测试Cookie
<br/>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        out.println("Name:" + cookie.getName());
        out.println("Value:" + cookie.getValue());
        out.println("Path" + cookie.getPath());
    }
%>



</html>

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
<%
    for (int i = 0; i < 10; i++) {
%>
<input type="text"/>
<% } %>
</html>

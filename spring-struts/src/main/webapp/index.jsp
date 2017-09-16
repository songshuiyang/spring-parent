<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<h2>Hello World!</h2>

<%--<form action="login">
    姓名<s:property value="user.userName" />
    密码<s:property value="user.passWord" />
</form>--%>
<s:form action="login">
    姓名:<s:textfield name="userName"/>
    密码:<s:textfield name="passWord"/>
    <s:submit/>
</s:form>
</body>
</html>

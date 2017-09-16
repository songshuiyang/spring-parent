<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= session.getAttribute("user").toString() %>
<br/>
使用Struts2标签既可以输出Http请求参数也可以输出Action的处理结果
<br/>
<s:property value="tip"/>
<br/>
<s:property value="userName"/>
<br/>
<s:property value="passWord"/>
<br/>
登入成功
</body>
</html>

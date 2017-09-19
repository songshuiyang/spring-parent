<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
异常页面
<s:property value="exception.message"/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
异常信息:
<br/>
<s:property value="exceptionStack"/>
</body>
</html>

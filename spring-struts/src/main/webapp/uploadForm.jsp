<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>简单的文件上传</title>
</head>
<body>
<s:form action="upload" enctype="multipart/form-data">
    <s:textfield name="title" label="文件标题"/>
    <s:file name="upload" label="选择文件"/>
    <s:submit value="上传"/>
</s:form>

</body>
</html>

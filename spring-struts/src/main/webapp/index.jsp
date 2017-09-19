<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<%--<form action="login">
    姓名<s:property value="user.userName" />
    密码<s:property value="user.passWord" />
</form>--%>
<s:form action="login">
    <s:textfield name="userName" label="姓名"/>
    <s:textfield name="passWord" label="密码"/>
    <s:textfield name="role.id" label="Role id"/>
    <s:textfield name="role.status" label="Role status"/>

    <s:submit value="登入"/>
    <s:submit value="注册" onclick="regist();"/>
</s:form>
</body>

<script type="application/javascript">
    function regist() {
        alert("1");
        targetForm = document.form[0];
        targetForm.action = "regist";
    }
</script>
</html>

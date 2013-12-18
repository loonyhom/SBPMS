<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
</head>
<body id="login">
<center>
<s:actionerror id="actionError"/>
</center>
<s:form action="login">
    <s:textfield name="user.name" label="name"></s:textfield>
    <s:password name="user.password" label="password"></s:password>
    <s:submit></s:submit>
</s:form>
</body>
</html>
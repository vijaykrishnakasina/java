<!DOCTYPE html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<form:form id="loginform" action="login" method="post" modelAttribute="user">
		
			<form:input path="name" id = "name_i"/>
			<form:password path="password" id = "password_p"/>
			<form:button name="register"> login</form:button>
		
		</form:form>
		
		
	</body>
</html>

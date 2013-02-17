<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="css/start/jquery-ui-1.10.0.custom.css" rel="stylesheet">
<script src="js/jquery-1.9.0.js"></script>
<script src="js/jquery-ui-1.10.0.custom.js"></script>

<script>
	$(function() {
		$("#submitButton").button();
	});
</script>

</head>
<body>
	Login Page

	<s:form>
		<s:textfield name="username" label="User name" class="text ui-widget-content ui-corner-all" id="username" />
		<s:password name="password" label="Password" class="text ui-widget-content ui-corner-all" id="password" />
		<s:submit value="Login" id="submitButton" />
	</s:form>

</body>
</html>
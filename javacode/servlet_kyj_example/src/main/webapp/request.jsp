<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%
	out.print("컨텍스트 path "+request.getContextPath()+"<br>");
	out.print("컨텍스트 path "+request.getServerPort()+"<br>");
	out.print("컨텍스트 path "+request.getServerName()+"<br>");
	out.print("컨텍스트 path "+request.getMethod()+"<br>");
	out.print("컨텍스트 path "+request.getRequestURI()+"<br>");
	out.print("컨텍스트 path "+request.getRequestURL()+"<br>");
	%>

</body>
</html>
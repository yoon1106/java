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

	int age = Integer.valueOf(request.getParameter("age"));
	%>
	당신은 <%=age %> 는 미성년자 입니다. 술을 살 수 없습니다.
	<a href="requestage.html">나이 입력 페이지 이름</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>예제</h1>
어플리케이션 스코프: ${applicationScope.app_name}<br>
세션 스코프: ${sessionScope.session_name}<br>
페이지 스코프:${pageScope.page_name}<br>
리퀘스트 스코프:${requestScope.request_name}<br>
   
   
</body>
</html>
<%@page import="edu.ict.bean.Grade"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성적표</h1>

	<jsp:useBean id="grade" class="edu.ict.bean.Grade"/>
	
	<jsp:setProperty property="name" name="grade" value="홍길동"/>
	<jsp:setProperty property="kor" name="grade" value="100"/>
	<jsp:setProperty property="eng" name="grade" value="90"/>
	<jsp:setProperty property="math" name="grade" value="80"/>
				
	이름: <jsp:getProperty property="name" name="grade"/> <br>
	국어: <jsp:getProperty property="kor" name="grade"/> <br>
	영어: <jsp:getProperty property="eng" name="grade"/> <br>
	수학: <jsp:getProperty property="math" name="grade"/> <br>
    총점: <jsp:getProperty property="sum" name="grade"/> <br>
	평균: <jsp:getProperty property="avg" name="grade"/> <br>
	성적: <jsp:getProperty property="grade" name="grade"/> 입니다<br>
</body>
</html>
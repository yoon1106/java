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
	국어: ${gradeVO2.kor}<br>
	영어: ${gradeVO2.eng}<br>
	수학: ${gradeVO2.math}<br>
	평균: ${gradeVO2.getAvg()}<br>
	등급: ${gradeVO2.getGrade()}<br>
	

</body>
</html>
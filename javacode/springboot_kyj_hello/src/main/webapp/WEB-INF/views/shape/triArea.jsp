<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>삼각형 넓이 </h1>
	가로: ${triangleVO.width}<br>
	세로: ${triangleVO.height}<br>
	넓이: ${triangleVO.area}<br>
	넓이: ${triangleVO.getTriArea()}
	

	
</body>
</html>
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
	<form action="/grade2/result" method="post">
	국어: <input type="text" name="kor"><br>
	영어: <input type="text" name="eng"><br>
	수학: <input type="text" name="math"><br>
		<input type="submit" value="제출"><br>
	</form>

</body>
</html>
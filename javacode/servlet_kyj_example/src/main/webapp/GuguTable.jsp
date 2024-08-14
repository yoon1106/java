<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<table border=1>
		<%
		out.print("<tr>");
		for (int i = 2; i < 10; i++) {
			out.print("<td>" + i + "단" + "</td>");
		}
		out.print("</tr>");

		for (int i = 1; i < 10; i++) {
			out.print("<tr>");
			for (int j = 2; j < 10; j++) {
				out.print("<td>" + j + "x" + i + "=" + (j * i) + "</td>");
			}
			out.print("</tr>");
		}
		%>
	</table>

	<hr>
	<h1>구구단</h1>
	<table border="1">
		<%
		for (int i = 1; i <= 9; i++) {
			out.print("<tr>");

			for (int j = 1; j <= 9; j++) {
				out.print("<td>" + i + "*" + j + "=" + (i * j) + "</td>");

			}
			out.print("</tr>");
		}
		%>
	</table>

	<hr>
	<h1>구구단</h1>
	<table border="1">
		<%
		out.print("<tr>");

		for (int i = 1; i <= 9; i++) {
			out.print("<td>" + i + "단" + "</td>");
		}
		out.print("</tr>");
		
		for (int i = 1; i <= 9; i++) {

			out.print("<tr>");

			for (int j = 1; j <= 9; j++) {
				out.print("<td>" + j + "*" + i + "=" + (i * j) + "</td>");
				

			}
			out.print("</tr>");
		}
		%>
	</table>

</body>
</html>
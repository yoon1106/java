<%@page import="edu.ict.prj.vo.EmpVO"%>
<%@page import="edu.ict.prj.dao.EmpDao"%>
<%@page import="edu.ict.prj.dao.DeptDao"%>
<%@page import="edu.ict.prj.vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>emp 테이블</h1>
<%
 	EmpDao dao = new EmpDao();
	
	List<EmpVO> empList = dao.empSelect();
	
	
	out.print("<table border=1>");
	out.print("<tr>");
	
	out.print("<td>" + "사원번호" + "</td>");
	out.print("<td>" + "사원이름" +"</td>");
	out.print("<td>" + "직업" + "</td>");
	out.print("<td>" + "매니저" + "</td>");
	out.print("<td>" + "입사날짜" + "</td>");
	out.print("<td>" + "급여" + "</td>");
	out.print("<td>" + "커미션" + "</td>");
	out.print("<td>" + "부서번호" + "</td>");
	

	out.print("</tr>");
	for( EmpVO vo : empList){
		out.print("<tr>");
		out.print("<td>" + vo.getEmpno() + "</td>");
		out.print("<td>" + vo.getEname() + "</td>");
		out.print("<td>" + vo.getJob() + "</td>");
		out.print("<td>" + vo.getMgr() + "</td>");
		out.print("<td>" + vo.getHiredate() + "</td>");
		out.print("<td>" + vo.getSal() + "</td>");
		out.print("<td>" + vo.getComm() + "</td>");
		out.print("<td>" + vo.getDeptno() + "</td>");
		out.print("</tr>");
	}
	out.print("<table/>");
%>

</body>
</html>
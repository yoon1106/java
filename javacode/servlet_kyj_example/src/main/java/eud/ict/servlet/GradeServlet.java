package eud.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eud.ict.shape.Circle;
import eud.ict.shape.Grade;
import eud.ict.shape.Rectangle;

/**
 * Servlet implementation class GuguServlet
 */
@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GradeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		int kor= Integer.valueOf(request.getParameter("kor"));
		int eng= Integer.valueOf(request.getParameter("eng"));
		int math= Integer.valueOf(request.getParameter("math"));
		String name= request.getParameter("name");
		
		
		Grade grade=new Grade(name,kor, eng,math);
	
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>"+"성적표" +" </h1>");	
		out.print("<h1> 이름"+grade.getName() +" </h1>");
		out.print("<h1>당신의 성적은 "+grade.getGrade()+" 입니다</h1>");	
		out.print("<h1>평균: "+grade.getAvg()+" 입니다</h1>");	
		out.print("<h1>총점: "+(kor+eng+math)+" 입니다</h1>");	
		out.print("<h1>국어 "+kor+" 점</h1>");	
		out.print("<h1>영어 "+eng+" 점</h1>");	
		out.print("<h1>수학 "+math+" 점</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();

	}

}

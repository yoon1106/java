package eud.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloworldServlet
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorldServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World</h1>");

		out.print("</body>");
		out.print("</html>");
		out.close();

		System.out.println("do Get() 함수 입니다");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String kor= request.getParameter("kor");
		String eng= request.getParameter("eng");
		String math= request.getParameter("math");
		
		double total=Integer.valueOf(kor)+Integer.valueOf(eng)+Integer.valueOf(math);
		double avg=total/3;
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1>총점</h1>");
		out.print("<h1>"+total+"</h1>");
		out.print("<h1>평군</h1>");
		out.print("<h1>"+avg+"</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	//	doGet(request,response);
	}

}

package eud.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eud.ict.shape.Circle;

/**
 * Servlet implementation class GuguServlet
 */
@WebServlet("/circle")
public class CircleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CircleServlet() {
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
		

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		Double radius= Double.valueOf(request.getParameter("radius"));
		Circle circle=new Circle(radius);
		
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>"+"원의 면적" +" </h1>");		
		out.print("<h1>원의 넓이 "+circle.getArea()+"</h1>");	
		out.print("</body>");
		out.print("</html>");
		out.close();

	}

}

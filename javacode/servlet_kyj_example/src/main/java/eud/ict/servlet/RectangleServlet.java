package eud.ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eud.ict.shape.Circle;
import eud.ict.shape.Rectangle;

/**
 * Servlet implementation class GuguServlet
 */
@WebServlet("/rectangle")
public class RectangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RectangleServlet() {
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

		Double width= Double.valueOf(request.getParameter("width"));
		Double height= Double.valueOf(request.getParameter("height"));
		
		
		Rectangle rectangle=new Rectangle(width, height);
	
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>"+"사각형의 면적" +" </h1>");		
		out.print("<h1>사각형의 넓이 "+rectangle.getArea()+"</h1>");	
		out.print("<h1>가로 "+width+"</h1>");	
		out.print("<h1>세로 "+height+"</h1>");	
		out.print("</body>");
		out.print("</html>");
		out.close();

	}

}

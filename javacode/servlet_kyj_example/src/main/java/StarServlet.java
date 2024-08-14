

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LottoAnswer
 */
@WebServlet("/star")
public class StarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		
		int num= Integer.valueOf(request.getParameter("num"));

		out.print("<html>");
		out.print("<body>");
	     
	      for(int i =1 ; i <=num ;i++ ) {
	      
	         for(int j =1 ; j <=i ;j++ ) {
	            //System.out.print("*");
	            out.print("*");
	         }
	         //System.out.println();
	         out.print("<br>");
	      }
	      
	      out.print("<hr>");
	      
	      for(int i =1 ; i <=num ;i++ ) {
	         
	         for(int j =i ; j <=num ;j++ ) {
	            //System.out.print("*");
	            out.print("*");
	         }
	         //System.out.println();
	         out.print("<br>");
	      }

		
		
		out.print("</body>");

		out.print("</html>");
		out.close();
		
	}

}

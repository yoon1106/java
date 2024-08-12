

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
 * Servlet implementation class LottoSevlet
 */
@WebServlet("/lottoResult")
public class LottoSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LottoSevlet() {
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

		int n1= Integer.valueOf(request.getParameter("n1"));
		int n2= Integer.valueOf(request.getParameter("n2"));
		int n3= Integer.valueOf(request.getParameter("n3"));
		int n4= Integer.valueOf(request.getParameter("n4"));
		int n5= Integer.valueOf(request.getParameter("n5"));
		int n6= Integer.valueOf(request.getParameter("n6"));
		
		Set<Integer> Lotto = new HashSet<>();

		final int COUNT = 6;

		while (Lotto.size() < COUNT) {
			Lotto.add((int) (Math.random() * 45 + 1));
		}
		
		out.print("<html>");
		out.print("<body>");
		out.print(Lotto);
		out.print("</body>");

		out.print("</html>");
		out.close();
		
		doGet(request, response);
	}

}

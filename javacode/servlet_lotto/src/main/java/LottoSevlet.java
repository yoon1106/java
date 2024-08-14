

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
		
		Set<Integer> useLotto = new HashSet<>();
		useLotto.add(n1);
		useLotto.add(n2);
		useLotto.add(n3);
		useLotto.add(n4);
		useLotto.add(n5);
		useLotto.add(n6);
		
		
		Set<Integer> Lotto = new HashSet<>();

		final int COUNT = 6;

		while (Lotto.size() < COUNT) {
			Lotto.add((int) (Math.random() * 45 + 1));
		}
		
		Set<Integer> sameSet = new HashSet<>();
		Set<Integer> differSet = new HashSet<>();
		
		for (Integer useNum : useLotto) {
			for (Integer n : Lotto) {
				
				if(useNum == n)
					sameSet.add( useNum);
				else
					differSet.add(useNum);
			}
		}
		
		
		
		out.print("<html>");
		out.print("<body>");
		out.print("당첨번호: "+Lotto+"<br>");
		out.print("맞는 숫자: "+sameSet+"<br>");
		out.print("다른 숫자: "+differSet+"<br>");
		out.print("</body>");

		out.print("</html>");
		out.close();
		
		doGet(request, response);
	}

}

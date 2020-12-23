

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lucky
 */
@WebServlet("/Lucky")
public class Lucky extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ラッキー777</title>");
		out.println("</head>");
		out.println("<body>");

		int count = 0;
		int lucky;
		while(true) {
			lucky = new Random().nextInt(900)+100;
			count++;
			out.println(lucky+"<br>");
			if(lucky == 777) {
				break;
			}
		}

		out.println("<p>"+count+"回目にでました！</p>");
		out.println("</body>");
		out.println("</html>");

	}

}

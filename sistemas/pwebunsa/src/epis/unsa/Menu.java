package epis.unsa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Menu extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/WEB-INF/menuComentarios.jsp");
		rd.forward(req, resp);
	}
}

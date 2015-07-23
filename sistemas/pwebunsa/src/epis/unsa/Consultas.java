package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jdo.Query;
import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Consultas extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");

		Lector l = new Lector();
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String cui = req.getParameter("cui");
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/consultas.jsp");
		rd.forward(req, resp);

		

	}
}
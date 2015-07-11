package epis.unsa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Elegir extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		char c =req.getParameter("ingresar").charAt(0);
		RequestDispatcher rd=null;
		
		switch (c) {
		
		case '1':
			rd = req.getRequestDispatcher("/WEB-INF/registro.jsp");
			rd.forward(req, resp);
			
			break;
			
		case '2':
			rd = req.getRequestDispatcher("/WEB-INF/listar.jsp");
			rd.forward(req, resp);
			break;

		case '3':
			rd = req.getRequestDispatcher("/WEB-INF/borrar.jsp");
			rd.forward(req, resp);
			break;
		}
		
	}
}
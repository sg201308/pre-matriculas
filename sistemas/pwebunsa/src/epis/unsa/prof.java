package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import epis.unsa.profesorPersona;

@SuppressWarnings("serial")
public class prof extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		char c =req.getParameter("ingresar").charAt(0);
		RequestDispatcher rd=null;
		
		switch (c) {
		
		case '1':
			rd = req.getRequestDispatcher("/WEB-INF/profesorFormulario.jsp");
			rd.forward(req, resp);
			
			break;
			
		case '2':
			rd = req.getRequestDispatcher("/WEB-INF/listadeprofesores.jsp");
			rd.forward(req, resp);
			break;

		case '3':
			rd = req.getRequestDispatcher("/WEB-INF/profesorLista.jsp");
			rd.forward(req, resp);
			break;
		case '4':
			rd = req.getRequestDispatcher("/WEB-INF/buscarProfesorDni.jsp");
			rd.forward(req, resp);
			break;
		}
		
	}
}
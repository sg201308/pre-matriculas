package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jdo.Query;
import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Consultas extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Lector l = new Lector();
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String cui = req.getParameter("cui");
		out.println("<p>Hola realiza busquedas por medio de:</p>");
		out.println("<form id=consulta>");
		out.println("Ponga nombre para la busqueda..."+"<input type='text' name='name' id='name' >");
		out.println("<br><input type='button' value ='buscar' id='buscar' onclick='consultas()'>");
		out.println("</form>");
//		Persona ser =l.consultaNombre(name);

	}
}
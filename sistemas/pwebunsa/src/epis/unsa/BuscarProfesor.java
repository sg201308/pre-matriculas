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
public class BuscarProfesor extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		PrintWriter out= resp.getWriter();
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(profesorPersona.class);

		String DNI = req.getParameter("numeroDNI");
		
		List<profesorPersona> personas = (List<profesorPersona>) q.execute("");
		
		for(profesorPersona p: personas){

			if(p.getDni().equals(DNI)){
				
				out.println("DNI: "+p.getDni());
				out.println("Nombre: "+p.getNom());
				out.println("Apellido Paterno: "+p.getApep());
				out.println("Apellido Materno: "+p.getApem());
				out.println("Genero:"+p.getSex());
				out.println("Nacionalidad: "+p.getNac());
				out.println("Nacimiento:"+p.getDia()+"/"+p.getMes()+"/"+p.getAnno());
				out.println("Email: "+p.getEmail());
				out.println("Telefono: "+p.getTel());
				out.println("Departamento:"+p.getDep());
				out.println("Carrera: "+p.getEsp());
				out.println("-----------------");
				
				
				
			}
		}
//		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/buscarProfesorDni.jsp");
//		rd.forward(req, resp);
//		resp.sendRedirect("/BuscarProfesor.jsp");

		
	}
	
}
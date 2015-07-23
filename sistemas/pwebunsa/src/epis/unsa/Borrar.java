package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Borrar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Alumno.class);
		q.setFilter("color == colorParam");
//		q.declareParameters("String colorParam");
		
		try{
//			List<Persona> personas = (List<Persona>) q.execute("Amarillo");
			List<Alumno> alumno = (List<Alumno>) q.execute();
//			out.println("<ul>");
			for(Alumno a: alumno){
//				out.print("<li>");
//				out.println(p);
//				q.deletePersistentAll(personas);
				pm.deletePersistent(a);
			}
//			out.println("<ul>");
		}catch(Exception e){
			
		}finally{
			 q.closeAll();
		}
	}
}
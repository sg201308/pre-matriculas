package epis.unsa;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class profesorBorrar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nom")!=null ){
			String nombre = req.getParameter("nom");
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(profesorPersona.class);
			q.setFilter("nom == nomParam");
			q.declareParameters("String nomParam");	
			try{
				q.deletePersistentAll(nombre);
				
				resp.getWriter().println("Se han borrado profesor.");
				resp.sendRedirect("/profesorLista.jsp");
			}
			catch(Exception e){
					System.out.println(e);
					resp.getWriter().println("No se han podido borrar profesor.");
					resp.sendRedirect("/profesory Lista.jsp");
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			resp.getWriter().println("No se ha especificado el profesor.");
			resp.sendRedirect("/index.html");
		}		
	}
}
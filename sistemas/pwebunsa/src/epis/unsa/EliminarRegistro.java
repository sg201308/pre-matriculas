package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.jdo.Query;
import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EliminarRegistro extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String dni= req.getParameter("dni");
		int b=0;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
//		Query q = pm.newQuery(Alumno.class,"name='miguel'");
		String query = "select from "+Alumno.class.getName();
		Query q = pm.newQuery(query);
		q.setFilter("dni == dniParam");
		q.declareParameters("String dniParam");

		try{
			List<Alumno> persona = (List<Alumno>)q.execute(dni);
			String rpta ="alumno eliminado:\n";
			
			
			for(Alumno a : persona){
				pm.deletePersistent(a);
				out.print(b++);
			}
			out.println(rpta);
		}catch(Exception e){
		}finally{
			q.closeAll();
		}
	}
}
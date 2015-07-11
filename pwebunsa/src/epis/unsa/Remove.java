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

public class Remove extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		String cod = req.getParameter("cod");
		Query q = pm.newQuery(Curso.class);
		q.setFilter("cod == codParam");
		q.declareParameters("String codParam");
		try{
			List<Curso> cursos = (List<Curso>) q.execute(cod);
//			List<Persona> personas = (List<Persona>) q.execute();
			for(Curso p: cursos){
				pm.deletePersistent(p);
			}
		}catch(Exception e){
			
		}finally{
			 q.closeAll();
		}
		


	}
}

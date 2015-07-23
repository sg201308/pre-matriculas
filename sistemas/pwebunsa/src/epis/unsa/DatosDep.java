package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DatosDep extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		Query q = pm.newQuery(Curso.class);
		q.setFilter("name == nameParam");
		q.declareParameters("String nameParam");
		try{
			try{
				@SuppressWarnings("unchecked")
				List<Departamentos> dep = (List<Departamentos>) q.execute(name);
				req.setAttribute("departamenos", dep);
				RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/registro.jsp");
				rd.forward(req, resp);
			}catch(Exception e){
				System.out.println(e);

			}finally{
				if( pm.currentTransaction().isActive() ){
					pm.currentTransaction().rollback();
				}
				q.closeAll();
				pm.close();
			}
		}catch(NumberFormatException nfe){
			System.out.println(nfe.getLocalizedMessage());
		}
	}
}
package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class instruccionsave extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String correo = req.getParameter("email");
		String comentario = req.getParameter("comen");
		
		
		consultainstruccion p = new consultainstruccion(correo,comentario);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			pm.makePersistent(p);
			resp.getWriter().println("Datos grabados correctamente");
			resp.sendRedirect("/comentario");
		}
		catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrio un error, <a href='index.html'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
	}
}

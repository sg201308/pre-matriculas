package epis.unsa;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SaveDepartamento extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		try{
			String name = req.getParameter("name");
			String cod = req.getParameter("cod");
			int  cred = Integer.parseInt(req.getParameter("cred"));
			int sem = Integer.parseInt(req.getParameter("sem"));
			String depAca = req.getParameter("depAca");

			final Departamentos cur = new Departamentos(name);

			final PersistenceManager pm = PMF.get().getPersistenceManager();
			try{
				pm.makePersistent(cur);
			}catch(Exception e){
				System.out.println(e);
				resp.getWriter().println("Ocurrió un error, <a href='index.jsp'>vuelva a intentarlo</a>");
			}finally{
				pm.close();
			}
		}catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());
		}
	}
}
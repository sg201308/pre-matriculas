package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MatriculadoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Lector leer = new Lector();
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String ciudad = req.getParameter("ciudad");
		String direccion = req.getParameter("direccion");
		String cui = req.getParameter("cui");
		String dni = req.getParameter("dni");
		String [] cursos = req.getParameterValues("curso");
		Alumno alumno = new Alumno(name, lastname, ciudad, direccion, cui, dni, cursos);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/matricular.jsp");
		rd.forward(req, resp);

		try{
			pm.makePersistent(alumno);
		}catch(Exception e){
			System.out.println(e);
			out.println("Ocurrió un error, <a href='portada.jsp'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
//		leer.enviarDatos(cui, cursos);
		
	}
}
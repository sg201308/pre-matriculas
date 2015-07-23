package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class profesorSave extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nom");
		String apellidop = req.getParameter("apep");
		String apellidom = req.getParameter("apem");
		String sexo = req.getParameter("sex");
		String carnet = req.getParameter("dni");
		String nacionalidad=req.getParameter("nac");
		String dias = req.getParameter("dia");
		String meses = req.getParameter("mes");
		String annos = req.getParameter("anno");
		String correo = req.getParameter("email");
		String telefono = req.getParameter("tel");
		String departamento = req.getParameter("dep");
		String especialidad = req.getParameter("esp");
		
		profesorPersona p = new profesorPersona(nombre,apellidop,apellidom,sexo,carnet,nacionalidad,dias,meses,annos,correo,telefono,departamento, especialidad);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			pm.makePersistent(p);
			resp.getWriter().println("Datos grabados correctamente");
			resp.sendRedirect("/msnguardar.jsp");
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrio un error, <a href='index07.html'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
	}
}

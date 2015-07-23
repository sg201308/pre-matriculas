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

public class Modificar extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
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
			
			for (Alumno alumno : persona) {
			out.println("<form action='/matriculado' id='modifcar'>"+"<br>");
			out.print("Nombres ");
			out.println("<br><input type='text' value ='"+alumno.getName()+"' id='name' >");
			out.print("Apellidos ");
			out.println("<br><input type='text' value ='"+alumno.getLastname()+"' id='lastname' >");
			out.print("Ciudad ");
			out.println("<br><input type='text' value ='"+alumno.getCiudad()+"' id='ciudad' >");
			out.print("Direccion ");
			out.println("<br><input type='text' value ='"+alumno.getDireccion()+"' id='direccion' >");
			out.print("DNI ");
			out.println("<br><input type='number' value ='"+alumno.getDni()+"' id='dni' >");
			out.print("CUI ");
			out.println("<br><input type='number' value ='"+alumno.getCui()+"' id='cui' >");
			out.println("<br><input type='button' value ='modificar' id='matricular' onclick='status()'>");
			out.println("</form>");
			}
		}catch(Exception e){
		}finally{
			q.closeAll();
		}
	}
}
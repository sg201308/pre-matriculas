package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.jdo.Query;
import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		String cui = req.getParameter("cui");
		out.println("Ud. se ha matriculado en los siguientes cursos: ");
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Alumno.class);
		q.setFilter("cui == cuiParam");
		q.declareParameters("String cuiParam");
	
		try{
			List<Alumno> persona = (List<Alumno>)q.execute(cui);
			String rpta ="Datos del alumno matriculado:\n";
			rpta+="<table>";
			for (Alumno alumno : persona) {
				rpta+="<tr><td>Nombre: </td><td>"+alumno.getName()+"</td></tr>";
				rpta+="<tr><td>Apellidos: </td><td>"+alumno.getLastname()+"</td></tr>";
				rpta+="<tr><td>Ciudad: </td><td>"+alumno.getCiudad()+"</td></tr>";	
				rpta+="<tr><td>Direccion: </td><td>"+alumno.getDireccion()+"</td></tr>";
				rpta+="<tr><td>DNI: </td><td>"+alumno.getDni()+"</td></tr>";	
				rpta+="<tr><td>CUI: </td><td>"+alumno.getCui()+"</td></tr>";	

			
			for(Alumno a : persona){
				for(int i =0; i<a.getCursos().length;i++){
					rpta+="<tr>";
					rpta+="<td>"+a.getCui()+"\t</td>";
					rpta+="<td>"+a.getCursos()[i]+"\t</td>";
					rpta+="</tr>\n";
				}
			}}			
			rpta+="<br><br>";
			rpta+="</table>";
			out.println(rpta);
		}catch(Exception e){
		}finally{
			q.closeAll();
		}
	}
}
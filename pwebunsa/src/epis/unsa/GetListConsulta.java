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

public class GetListConsulta extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		//obtencion de los datos
		String cons= req.getParameter("cons");
		int valor = Integer.parseInt(req.getParameter("c"));
		String filtro="" ;
		switch(valor){
		case 1:  
			filtro="name";
			break;
		case 2:
			filtro="lastname";
			break;
		case 3:
			filtro="cui";
			break;
		case 4:
			filtro="dni";
			break;
		}
		out.println("Ud. se ha matriculado en los siguientes cursos: ");
		PersistenceManager pm = PMF.get().getPersistenceManager();
//		Query q = pm.newQuery(Alumno.class,"name='miguel'");
		//variable para la consultas a la base de datos
		String query = "select from "+Alumno.class.getName();
		Query q = pm.newQuery(query);
//		q.setFilter("cui == cuiParam");
		//filtro para la consulta
		q.setFilter(filtro+"== nameParam");
		q.declareParameters("String nameParam");
		try{
			List<Alumno> persona = (List<Alumno>)q.execute(cons);
			out.print(cons+" "+filtro);
			String rpta ="Datos del alumno matriculado:\n";
			rpta+="<table>";
			for (Alumno alumno : persona) {
				rpta+="<tr><td>Nombre: </td><td>"+alumno.getName()+"</td>";
				rpta+="<td>Apellidos: </td><td>"+alumno.getLastname()+"</td>";
				rpta+="<td>Ciudad: </td><td>"+alumno.getCiudad()+"</td>";	
				rpta+="<td>Direccion: </td><td>"+alumno.getDireccion()+"</td>";
				rpta+="<td>DNI: </td><td>"+alumno.getDni()+"</td>";	
				rpta+="<td>CUI: </td><td>"+alumno.getCui()+"</td>";	
//				rpta+="<td>"+"<button onclick=\"location.href=\'****\'\">MODIFICAR</button>"+"</td>";	
				rpta+=" <td><a href='/eliminar?dni="+alumno.getDni()+"'>ELIMINAR</a></td>";	
				rpta+=" <td><a href='/modificar?dni="+alumno.getDni()+"'>MODIFICAR</a></td></tr>";	

					

			
			rpta+="<br><br>";
			for(Alumno a : persona){
				for(int i =0; i<a.getCursos().length;i++){
					rpta+="<tr>";
					rpta+="<td>"+a.getCui()+"\t</td>";
					rpta+="<td>"+a.getCursos()[i]+"\t</td>";
					rpta+="</tr>\n";
				}
			}}			rpta+="<br><br>";

			rpta+="</table>";
			out.println(rpta);
		}catch(Exception e){
		}finally{
			q.closeAll();
		}
	}
}
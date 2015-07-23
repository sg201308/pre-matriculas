package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Administrar extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
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
//		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/vista1.jsp");
//		rd.forward(req, resp);
		
		RequestDispatcher ra = req.getRequestDispatcher("/WEB-INF/vista2.jsp");
		ra.forward(req, resp);

}}
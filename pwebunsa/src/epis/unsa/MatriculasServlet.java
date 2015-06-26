package epis.unsa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MatriculasServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		Lector l = new Lector();
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String cui = req.getParameter("cui");
		
		if(l.validarCui("text.txt", cui)==true){
			ArrayList<String>aprobado = new ArrayList<String>();
			ArrayList<String>prerequisitos = new ArrayList<String>();
			ArrayList<String>curso = new ArrayList<String>();
			ArrayList<String>libre = new ArrayList<String>();
			
			aprobado = l.procesarCui("text.txt", cui);
			libre = l.cursosLibres("hola.csv");
			libre = l.verificar(libre,aprobado);
			
			out.println("<p>Hola "+name+" estos son los cursos que Ud. ha aprobado:</p>");
			for(String s : l.juntar(l.obtenerNombre("hola.csv", aprobado))){
				out.println("<li>"+s+"</li>");
			}
			
			prerequisitos = l.cursosPre("hola.csv");

			curso = l.comparar(aprobado, prerequisitos);
			curso = l.verificar(curso, aprobado);
			
			curso.addAll(libre);
			curso = l.juntar(curso);
//			out.print("<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"%>");
			out.println("<p>Ud. puede llevar los siguientes cursos: </p>");
			out.println("<p>Marque los cursos a los que Ud. desee matricularse y presione el boton matricularme</p>");
			int i=0;
			String n="";
			out.println("<form id=form1>");
			for(String s : l.obtenerNombre2("hola.csv", curso)){
				n=String.valueOf(i);
				
				out.println("<input type='checkbox' name='curso' id='curso' value='"+s+"'>"+s.substring(0,s.indexOf(" Semestre"))+"<br>");
				i++;
			}
			out.println("<br><input type='button' value ='matricularme' id='matricular' onclick='showCursos()'>");
			out.println("</form>");
		}else{
			out.println("<h3>CUI INVALIDO</h3>");
		}
	}
}
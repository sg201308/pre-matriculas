 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="epis.unsa.*" %>
    <%@ page import="java.util.List"%>
	<% List<Curso> cursos = (List<Curso>)request.getAttribute("cursos");%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="description" content="Ejemplos de proyectos de aplicaciones Web con Google App Engine.">
<meta name="keywords" content="Google app engine,Servlets,Java,GAE,HTML,CSS,JSP,Eclipse">
<title>Lista de Cursos</title>
<style>
.slogan {
	position: relative;
	left: 4%;
}

.linea {
	position: absolute;
	top: 13%;
	left: 14%;
}

h2 {
	color: #471252;
	text-align: center;
	font-family: "Bookman Old Style";
	font-size: 40px;
}

.epis {
	position: absolute;
	top: 3%;
	left: 15%;
}

#header {
	position: absolute;
	top: 18%;
	left: 20%;
	margin: auto;
	width: 900px;
	font-family: Arial, Helvetica, sans-serif;
	color: #FFFFFF;
}

ul, ol {
	list-style: none;
}

.nav>li {
	float: left;
}

.nav li a {
	background-color: #ffffff;
	color: #000000;
	text-decoration: none;
	padding: 10px 12px;
	display: block;
}

.nav li a:hover {
	background-color: #434343;
}

.nav li ul {
	display: none;
	position: absolute;
	min-width: 140px;
}

.nav li:hover>ul {
	display: block;
}

.nav li ul li {
	position: relative;
}

.nav li ul li ul {
	right: -140px;
	top: 0px;
}
</style>
</head>
<body>


<div style="background-color: #E5DFDF">
		<div id="header">
			<nav> <!-- Aqui estamos iniciando la nueva etiqueta nav -->
			<ul class="nav">
				<li><a href="portada.jsp">Inicio</a></li>
				<li><a href="vista1.jsp">Instrucciones</a> <li><a href="vista2.jsp">Ubicacion</a>
				
				
				<li><a href="vista4.jsp">Comunicados</a></li>
				<li><a href=""> acerca de </a>
					<ul>
						<li><a href="vista5.jsp">Nosotros</a></li>
						<li><a href="vista6.jsp">EPIS</a></li>

					</ul></li>
			</ul>
			</nav>
			<!-- Aqui estamos cerrando la nueva etiqueta nav -->
		</div>
		<div class="slogan">
			<img border="0" src="estilos/simbolo_epis.png" width="150"
				height="120">
		</div>

		<div class="linea">
			<img border="0" src="estilos/linea.png" width="650" height="25">
		</div>


		<div class="epis">
			<h2>INGENIERIA DE SISTEMAS</h2>
		</div>
		<br> <br> <br> <br>
	</div>
<h3>Cursos registrados:</h3>
<table border="1px">
<tr><td>Codigo</td><td>Semestre</td><td>Nombre</td><td>Creditos</td><td>Departamento</td></tr>
<% for( Curso c : cursos){%>
	<tr>
		<td><%= c.getCod() %></td>
		<td><%= c.getSem() %></td>
		<td><%= c.getName() %></td>
		<td><%= c.getCred() %></td>
		<td><%= c.getDepAca() %></td>
	</tr>
<%}%>
</table>	
</body>
</html>
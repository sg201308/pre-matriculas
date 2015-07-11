<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ page import="epis.unsa.*" %>
    <%@ page import="java.util.List"%>
	<% List<Departamentos> deps = (List<Departamentos>)request.getAttribute("departamento");%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src ="../script/script3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro</title>
<style>
.gg{
	box-shadow: 10px 10px 20px #FFFFFF;
	border-radius: 30px;
	background-color: #F9DAFA;
	width: 800px;
	filter: alpha(opacity = 50);
	opacity: 0.95;
}

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

<center>
<div class="gg">
<h1>registro de curso</h1>
<form id="myDiv">
	Codigo del curso: <input type=text id=cod name=cod><br><br>
	Semestre del curso: <input type=text id=sem name=sem><br><br>
	Nombre del curso: <input type=text id=name name=name><br><br>
	Creditos del curso: <input type=text id=cred name=cred><br><br>
	
	
	<% for( Departamentos c : deps){%>
	<tr>
		
		<td><%= c.getName() %></td>
		
	</tr>

	
	
	
	
	<select name="c" id="c">
<option value="1"></option>
<option value="2">c.getName</option>
<option value="3">cui</option>
<option value="4">dni</option>

<%}%>
	Departamento academico: <input type=text id=depAca name=depAca><br><br>
	<input type=button value="Guardar" onClick="local()"><br>
</form>
<div id="myDiv"></div>

<br>
<input type="button" value="Regresar">
</div>
</center>
</body>
</html>
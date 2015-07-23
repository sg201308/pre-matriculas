<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>portada</title>
<style type="text/css">
body {
	background-color: #331111;
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

.seccion {
	position: absolute;
	top: 90%;
	left: 0%;
}

.acerca {
	margin: 15px 20px;
	padding: 2px;
	height: 46px;
	padding-top: 1px;
	font: 15px/18px 'Lucida Grande', Arial, sans-serif;
	color: #666;
	text-align: center;
	background: rgba(250, 250, 250, 0.8);
	border-radius: 4px;
	background-image: -webkit-linear-gradient(top, rgba(0, 0, 0, 0),
		rgba(0, 0, 0, 0.1));
	background-image: -moz-linear-gradient(top, rgba(0, 0, 0, 0),
		rgba(0, 0, 0, 0.1));
	background-image: -o-linear-gradient(top, rgba(0, 0, 0, 0),
		rgba(0, 0, 0, 0.1));
	background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0),
		rgba(0, 0, 0, 0.1));
	-webkit-box-shadow: inset 0 1px rgba(255, 255, 255, 0.3), inset 0 0 0
		1px rgba(255, 255, 255, 0.1), 0 0 6px rgba(0, 0, 0, 0.2);
	box-shadow: inset 0 1px rgba(255, 255, 255, 0.3), inset 0 0 0 1px
		rgba(255, 255, 255, 0.1), 0 0 6px rgba(0, 0, 0, 0.2);
	padding: 3px;
	width: 1300px;
}

.cuadro {
	text-align: center;
	position: absolute;
	top: 42%;
	left: 65%;
	border-radius: 10px;
	background-color: #1BAE9F;
	width: 280px;
	filter: alpha(opacity = 50);
	opacity: 0.95;
	border: 2px solid #ffffff;
	aling-text: center;
}

.cuadro1 {
	text-align: center;
	position: absolute;
	top: 55%;
	left: 65%;
	border-radius: 10px;
	background-color: #27BF40;
	width: 280px;
	filter: alpha(opacity = 50);
	opacity: 0.95;
	border: 2px solid #ffffff;
	left: 65%;
	border-radius: 10px;
	background-color: #27BF40;
}

.cuadro2 {
	text-align: center;
	position: absolute;
	top: 68%;
	left: 65%;
	border-radius: 10px;
	background-color: #CCA422;
	width: 280px;
	filter: alpha(opacity = 50);
	opacity: 0.95;
	border: 2px solid #ffffff;
	position: absolute;
}

.cuadro3 {
	text-align: center;
	position: absolute;
	top: 81%;
	left: 65%;
	border-radius: 10px;
	background-color: #CCA422;
	width: 280px;
	filter: alpha(opacity = 50);
	opacity: 0.95;
	border: 2px solid #ffffff;
	position: absolute;
}

.twiter {
	position: absolute;
	top: 35%;
	left: 0%;
}

.face {
	position: absolute;
	top: 50%;
	left: 0%;
}

.face2 {
	position: absolute;
	top: 49%;
	left: 0%;
}

.mensajes {
	position: absolute;
	top: 64%;
	left: 0%;
}

.escuela {
	position: absolute;
	top: 40%;
	left: 16%;
}
</style>
</head>
<body>
	<div style="background-color: #E5DFDF">
		<div id="header">
			<nav> <!-- Aqui estamos iniciando la nueva etiqueta nav -->
			<ul class="nav">
				<li><a href="portada.jsp">Inicio</a></li>
				<li><a href="menu1">Instrucciones</a>
				<li><a href="vista2.jsp">Ubicacion</a>
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







	<!-- div del hipervinculo de facebook -->

	<div class="face">
		<a href="http://www.facebook.com"> <img border="0" alt="W3Schools"
			src="estilos/fondoface.png" width="90" height="80">
		</a>
	</div>


	<div class="face2">
		<a href="http://www.facebook.com"> <img border="0" alt="W3Schools"
			src="estilos/facebook.png" width="100" height="100">
		</a>
	</div>

	<!-- div del hipervinculo de twiter -->

	<div class="twiter">
		<a href="http://www.facebook.com"> <img border="0" alt="W3Schools"
			src="estilos/twiter.png" width="100" height="100">
		</a>
	</div>
	<!-- div del hipervinculo de gmail -->

	<div class="mensajes">
		<a href="http://www.facebook.com"> <img border="0" alt="W3Schools"
			src="estilos/mensajes.png" width="100" height="100">
		</a>
	</div>

	<div class="escuela">
		<img border="0" src="estilos/escuela.jpg" width="600" height="280">
	</div>



	<div class="cuadro">
		<br> <a href="/login">Iniciar sesion<br></a> <br>
	</div>

	<div class="cuadro1">
		<br> <a href="/consultas">consultas por busqueda...<br></a> <br>
	</div>

	<div class="cuadro2">
		<br> <a href="/login1"> <br>Administrativos<br></a>
		<br>
	</div>
	
	<div class="cuadro3">
		<br> <a href="/login2"> <br>Profesor - Admin<br></a>
		<br>
	</div>

	<div class="seccion">
		<section class="acerca">
		<p class="about-links">
			Escuela Profesional de Ingenieria de Sistemas <a
				href="http://www.episunsa.edu.pe/web/"> <img
				src="estilos/escudo_unsa.png" width=20, hight=30></a>
		</p>
		</section>




	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src ="script/script3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

div{
	position: absolute;

	box-shadow: 10px 10px 20px #FFFFFF;
	border-radius: 30px;
	background-color: #F9DAFA;
	width: 800px;
	filter: alpha(opacity = 50);
	opacity: 0.95;
}
</style>
</head>
<body>
<center>
<div>

	<form>
		Codigo del curso: <input type=text id=cod name=cod><br><br>
		Semestre del curso: <input type=text id=sem name=sem><br><br>
		Nombre del curso: <input type=text id=name name=name><br><br>
		Creditos del curso: <input type=text id=cred name=cred><br><br>
		Departamento academico: <input type=text id=depAca name=depAca><br><br>
		<input type=button value="Guardar" onClick="status()"><br>
		<input type=button value="Ver Cursos" onClick="showList()"><br>
		
		<a href=listar.jsp><input type=button value="Listar"></a><br>
		<a href=borrar.jsp><input type=button value="Borrar"></a>
		
	</form>
	<div id="myDiv"></div>
	<div id="myDiv2"></div>
</div>


</center>
</body>
</html>
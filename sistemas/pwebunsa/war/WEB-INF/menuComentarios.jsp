<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
    <h1>INDICE</h1>
    <br><br><br><br>
	<form action="/escoger" method="GET" id = "myForm">
	<h3>Que desea hacer:</h3>
	<select name="ingresar" id="ingresar">
		<option value="">Seleccione un opcion</option>
		<option value="1">Comentar</option>
		<option value="2">Ver comentarios</option>
	</select>
	<br><br>
	<input type="submit" value="Enviar">
	</form>
    </center>

</body>
</html>
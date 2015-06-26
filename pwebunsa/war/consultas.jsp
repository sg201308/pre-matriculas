<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src ="script/script.js"></script>
    <link rel="stylesheet" type="text/css" href="estilos/Style.css">
<title>Insert title here</title>
</head>
<body><center>
Seleccione busqueda por<br>
<form action="/consulta" method="get">
<select name="c" id="c">
<option value="1">nombres</option>
<option value="2">apellidos</option>
<option value="3">cui</option>
<option value="4">dni</option>
<br>
<input type="text" id="cons" name="cons" placeholder="Ingrese caracteres de busqueda" >
  <input type="button" id="boton" value="BUSCAR" onClick="statusconsulta()">

</select>

</form>
<div id="myDiv"></div>
</center>
</body>
</html>
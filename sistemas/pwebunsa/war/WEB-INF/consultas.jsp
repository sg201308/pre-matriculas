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
<option required value="1" pattern="([a-zA-ZáéíóúÁÉÍÓÚñÑ]+[\s]?[a-zA-ZáéíóúÁÉÍÓÚñÑ]*)">nombres</option>
<option required value="2" pattern="([a-zA-ZáéíóúÁÉÍÓÚñÑ]+[\s]?[a-zA-ZáéíóúÁÉÍÓÚñÑ]*)">apellidos</option>
<option pattern="[0-9]{4}" value="3">cui</option>
<option pattern="[0-9]{8}" value="4">dni</option>
<br>
<input type="text" id="cons" name="cons" placeholder="Ingrese caracteres de busqueda" >
  <input type="button" id="boton" value="BUSCAR" onClick="statusconsulta()">

</select>

</form>
<div id="myDiv"></div>
</center>
</body>
</html>
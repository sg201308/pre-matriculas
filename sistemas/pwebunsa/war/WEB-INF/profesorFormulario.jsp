<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro de Profesor</title>
</head>
<body>

	<font color="black">
		<center>
			<h1>
				<u>REGISTRO DE PROFESOR</u>
			</h1>
			<br>
			<br>
			<form action="profesorSave" method="Get">
				<u>Nombre</u> : <input  required type="text" size="20" name="nom"  pattern=([a-zA-ZáéíóúÁÉÍÓÚñÑ]+[\s]?[a-zA-ZáéíóúÁÉÍÓÚñÑ]*) placeholder="Juan"  value="">
				<br>
				<br>
				<u>Apellido Paterno</u>: <input required type="text" size="20" name="apep" pattern="([a-zA-ZáéíóúÁÉÍÓÚñÑ]+[\s]?[a-zA-ZáéíóúÁÉÍÓÚñÑ]*)" placeholder="Perez" value="">
				<br>
				<br>
				<u>Apellido Materno</u>: <input required  type="text" size="20" name="apem"  pattern="([a-zA-ZáéíóúÁÉÍÓÚñÑ]+[\s]?[a-zA-ZáéíóúÁÉÍÓÚñÑ]*)" placeholder="García" value="">
				<br>
				<br>
				<u>Sexo</u>: <select name="sex">
					<option value=""></option>
					<option value="Masculino">Masculino</option>
					<option value="Femenino">Femenino</option>
					
				</select> <br>
				<br>
				<br>
				<u>DNI:</u> : <font color="black"></font> 
				<input type="text" size="20" name="dni" pattern="[0-9]{8}" placeholder="76986422" value="">
				<br>
				<br>
				<u>Nacionalidad</u>: <select name="nac">
				     <option value=""></option>
					<option value="Peruana">Peruana</option>
					<option value="Chilena">Chilena</option>
					<option value="Brasileña">Brasileña</option>
					<option value="Ecuatoriana">Ecuatoriana</option>
					<option value="Boliviana">Boliviana</option>
					<option value="Venezolana">Venezuela</option>
					<option value="Alemana">Alemana</option>
					<option value="Mexicana">Mexicana</option>
				    <option value="Otra">Otra</option>
					
				</select> <br>
				<br>
				<br>
				<u>Nacimiento</u>:<br> dia / mes / año
				<br>
				<input type="text" size="1" maxlength="2" name="dia"  pattern="[0-9]{1}|[0-9]{2}" placeholder="05" value="">
				<input type="text" size="1" maxlength="2" name="mes" pattern="[0-9]{1}|[0-9]{2}" placeholder="09" value="">
				<input type="text" size="1" maxlength="4" name="anno" pattern="[0-9]{4}|[0-9]{2}" placeholder="1995" value="">
				<br>
				<br>
				<u>Email</u>: <input type="text" name="email" pattern="^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$" placeholder="a@ejemplo.com" value="">
				<br>
				<br>
				<u>Telefono</u>: <input type="text" name="tel" placeholder="245222" pattern="[0-9]{6}|[0-9]{9}" value="">
				<br>
				<br>
				<br>
				<br>
				<u>Departamento</u>: <input type="text" name="dep" pattern=([a-zA-ZáéíóúÁÉÍÓÚñÑ]+[\s]?[a-zA-ZáéíóúÁÉÍÓÚñÑ]*) placeholder="Sistemas"  value="">
				<br>
				<br>
				<u>Carrera</u>: <select name="esp">
				        <option value=""></option>
					<option value="Ing de Sistemas">Ing de Sistemas</option>
					<option value="Ing Civil">Ing Civil</option>
					<option value="Ing Mecanica">Ing Mecanica</option>
					<option value="Ing Electrica">Ing Electrica</option>
					<option value="Ing Electrica">Ing Electronica</option>
				</select>
				<br>
				<br>
				<input type="reset" name="NO" value="Cancelar"><input
					type="submit" name="OK" value="Guardar">
			</form>
		</center>
		<table border="2" bgcolor="#81BEF7">
			<tr>
				<td><a href="index.html">Regresar</a></td>
			</tr>
		</table>
	</font>
</body>
</html>
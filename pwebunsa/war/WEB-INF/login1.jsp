<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>portada 1</title>
    
<meta charset="ISO-8859-1">
<script type="text/javascript">
	function enviar() {
		var loggin = document.getElementById('login').value;
		var pass = document.getElementById('password').value;

		if (loggin != "sergio" || pass != "sergio") {
			alert("llena correctamente los datos porfavor");
			return;
		} else
			document.getElementById("myform").submit();
	}
</script>
<link rel="StyleSheet" href="estilos/sama.css" type="text/css">
<title></title>
</head>
<body id="todo">
	<br>
	<div id="lol">
		<table WIDTH=500 HEIGHT=100 border="0">
			<tr>
				<td id="loq"><span id="span">UNIVERSIDAD NACIONAL DE SAN
						AGUSTIN <br>
					<br>ESCUELA PROFESIONAL DE INGENIERIA DE SISTEMAS
				</span><br></td>
				<td rowspan="15"><img src="estilos/unsa1.jpg" width=120, hight=130></td>
			</tr>
			<tr>
				<td></td>
			</tr>
		</table>
	</div>

	<div>
		<form method="post" action="/pweb" class="login" id="myform">
			<p>
				<label for="login">Usuario </label> <input type="text" name="login"
					id="login" value="name">
			</p>

			<p>
				<label for="password">Password:</label> <input type="password"
					name="password" id="password" value="4815162342">
			</p>
			<p class="login-submit">
				<button type="button" class="login-button" onclick="enviar()">Login
				</button>
			</p>

			<p class="forgot-password">
				<a href="index.html">Forgot your password?</a>
			</p>
		</form>

		<section class="acerca">
			<p class="about-links">
				2015     <a href="http://www.episunsa.edu.pe/web/"><img
					src="estilos/unsa1.jpg" width=20, hight=30></a>
			</p>
		</section>
	</div>
</body>
</html>
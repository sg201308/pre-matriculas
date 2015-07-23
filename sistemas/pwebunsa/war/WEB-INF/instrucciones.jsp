<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Instrucciones</title><link rel="stylesheet" href="estiloinstrucciones.css">
</head>
<body>
<h2>Procedimiento de Prematriculas en linea 2016</h2>
<hr>

<center><div>
<p>Para las prematriculas en linea es necesario seguir las siguientes instrucciones</p>
<ol class="c">
  <li>Ingresar a la página web: pwebunsa.appspot.com</li>
  <li>En el vínculo: Matriculas. Pulsar en: Prematriculas en linea.</li>
  <li>Ingresar su usuario</li>
  <li>Ingresar su contraseña</li>
  <li>Seleccione las asignaturas en las que desea prematricularse.</li>
  <li>Revisa las asignaturas seleccionados.</li>
  <li> Luego hacer clic en el botón continuar.</li>
  <li>A continuacion haga click en  la opcion prematricular</li>
  <li>Despues del ultimo paso.Se encontrara prematriculado</li>
  <li>Aparecera el comprobante de prematricula.</li>
  
  
</ol>
</div>
</center>
<div class="transbox">
<form action = "../instruccionsave" method='get'>
<h3>Consultas que desee realizar</h3>
<br>
<span class="lf">Ingrese su Correo</span> 
							<input type="email" name="email" id="email" pattern="^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$"  placeHolder="Ejemplo: usuario@gmail.com">
<br>
Consultar:<br>
<textarea  name="comen" id="comen"placeHolder="Escriba aqui su consulta.." rows="4" cols="50"></textarea>
<br>
<input type="submit"  value="ENVIAR">
</form> 
</div>
<br>
<br>
</body>
</html>
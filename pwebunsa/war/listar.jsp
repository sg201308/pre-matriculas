<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src ="script/script3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action=getList method=GET>
	Semestre: <input type=text id=sem name=sem><br>
	<input type=submit value=Enviar onClick="showList2()">
	</form>
	<div id="myDiv"></div>
</body>
</html>
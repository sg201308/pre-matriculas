<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import ="javax.jdo.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="epis.unsa.*"%>
<%@ page import="java.util.List"%>
<%@ page import ="javax.jdo.PersistenceManager "%>
<% List<consultainstruccion> comentarios = (List<consultainstruccion>)request.getAttribute("comentarios");%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link type="text/css" href="admin.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Lista de Comentarios</title>
</head>
<% PersistenceManager pm = PMF.get().getPersistenceManager();%>
		<%Query q = pm.newQuery(consultainstruccion.class);
				%>

				<body bgcolor=#00FFFF>
				<div>
				<center>
				<u><h1>Lista de Comentarios</h1></u>
				<br><br>
				
				<table border = "2" bgcolor="white">
				<tr>
				<font color="black">
				<td>Correo</td>
				<td>Comentarios</td>
				
				</tr>
		
		<%try{
			List<consultainstruccion> consultas = (List<consultainstruccion>) q.execute("");

			for(consultainstruccion p: consultas){
			%>
				<tr>
				<% 
				out.println(p);
			}%>
			</tr>
			<% 
		}catch(Exception e){
			
		}
		finally{
			 q.closeAll();
		}
		%>
		</td>
				</tr>
				</table>
				<br><br>
				</center>
				
				<br>
				</div>
				</body>
				</html>
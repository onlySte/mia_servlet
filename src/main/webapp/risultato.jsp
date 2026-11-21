<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="it.exolab.model.Automobile" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Risultato</title>
	</head>
	<body>
	
		<% Automobile auto = (Automobile) request.getAttribute("car"); %>
	
		<h2>Risultato della Registrazione</h2>
	
		<p> <strong>Marca : </strong> <%= auto.getMarca() %></p>
		<p> <strong>Modello : </strong><%= auto.getModello() %></p>
	
	
	</body>
</html>
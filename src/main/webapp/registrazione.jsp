<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registrazione Automobili</title>
	</head>
	<body>
	
		<h1>Reistrazione :</h1>
	
		<form action="registrazione" method="POST">
			<div>
				<label><strong>Marca :</strong></label>
				<input type="text" name="marca"/>
			</div>
			<div>
				<label><strong>Modello :</strong></label>
				<input type="text" name="modello" />
			</div>
			<button type="submit">Invia</button>
		</form>
	
	</body>
</html>
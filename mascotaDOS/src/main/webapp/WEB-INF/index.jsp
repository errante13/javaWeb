<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
		form {
			margin: 5px;
			align-items: center;
			text-align: left;
		}
		form label {
			display: inline-block;
			width: 50px;
		}
</style>
<title>formulario mascota</title>
</head>
<body>
	<h1>Formulario Perro</h1>
	<form action="PerroControlador" name="formulario" method="get">
		<label>nombre</label> <input type="text" name="nombre"> <br>
		<label>raza</label> <input type="text" name="raza"> <br>
		<label>peso</label> <input type="text" name="peso"> <br>
		<br> <input type="submit">

	</form>

	<h1>Formulario gato</h1>

	<form action="GatoControlador" name="formulario" method="get">
		<label>nombre</label> <input type="text" name="nombre"> <br>
		<label>raza</label> <input type="text" name="raza"> <br>
		<label>peso</label> <input type="text" name="peso"> <br>
		<br> <input type="submit">

	</form>
</body>
</html>
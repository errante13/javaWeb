<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrando un perro</title>
</head>
<body>
	<h1>mostrando un perro</h1>
	<h1> <c:out value="${perro.afecction()}"/>  </h1>
</body>
</html>
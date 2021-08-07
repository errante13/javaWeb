<%@page import="java.io.PrintWriter"%>
<%@page import="jdk.internal.net.http.hpack.Huffman.Writer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilos.css">
<title>Insert title here</title>
</head>
<body>
	<h1>tablero de damas</h1>
	
	
	 <% String req = request.getParameter("ancho"); 
	    String req2 = request.getParameter("largo"); 
   	  	int ancho = Integer.parseInt(req);
   	 	int largo = Integer.parseInt(req2);
   	  %>
		<%for(int x = 1; x <= largo; x++){%>
			<%if(x%2!=0){%>
				 	<%for(int y = 1; y <= ancho; y++){%>
				 		<%if(y%2!=0){%>
				 			<div class="par"></div>
				 		<%}else{  %>
							 <div class="impar"></div>	
						<%}%>
					<%}%>	
					<br>	
			 <%}else{%>
				  	<%for(int y = 1; y <= ancho; y++){%>
					 		<%if(y%2!=0){%>
					 			<div class="impar"></div>
					 		<%}else{  %>
								 <div class="par"></div>	
							<%}%>
				     <%}%>
				    <br>
	    	 <%}%>
		<%}%>
	   
		
	
	
	
	 
</body>
</html>
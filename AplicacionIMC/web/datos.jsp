<%-- 
    Document   : datos
    Created on : 28/09/2019, 09:58:03 AM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingrese sus datos</title>
    </head>
    <body>
        <form action="DatosUsuarios" method="post">
        <% String u  = request.getAttribute("usuario").toString();%>
        <h2>Bienvenido <%=u%></h2><br>
        <h1>Ingrese sus datos</h1>
        <input type="text" name="u" value=<%=u%> /><br>
        Ingrese su peso: <input type="text" name="peso"/><br>
        Ingrese su estatura: <input type="text" name="estatura"/><br>
        
        <input type="submit" value ="Calcular"/>    
        </form>
    </body>
</html>

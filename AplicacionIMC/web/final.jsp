<%-- 
    Document   : final
    Created on : 28/09/2019, 02:38:24 PM
    Author     : David
--%>

<%@page import="controlador.Datos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="Calculos" method="post">
        
        <h1>Confirme</h1>
        <%           
        String usuario = request.getAttribute("regAlias").toString();
        float peso = Float.parseFloat(request.getAttribute("regPeso").toString());
        float estatura = Float.parseFloat(request.getAttribute("regEstatura").toString());
        %>
                
        <input type="text" name="usuario" value=<%=usuario%> /><br>
        <input type="text" name="peso" value=<%=peso%> /><br>
        <input type="text" name="estatura" value= <%=estatura%> /><br>
        
        <input type="submit" value ="Calcular"/>    
        </form>
      
    </body>
</html>

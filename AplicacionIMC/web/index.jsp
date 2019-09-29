<%-- 
    Document   : index
    Created on : 28/09/2019, 09:17:19 AM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenidos</title>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action="Validar" method="post">
        Usuario: <input type="text" name="alias"/><br>
        Contraseña: <input type="password" name="pass"/><br>
        <input type="submit" value ="Iniciar sesion"/>    
        </form>
        ¿Quieres registrar un nuevo usuario?<a href="registrarUsuario.jsp">Registrar nuevo usuario</a>
    </body>
</html>

<%-- 
    Document   : registrarUsuario
    Created on : 27/09/2019, 12:52:57 PM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario</title>
    </head>
    <body>
        <div>Ingrese sus datos</div>
        <form action="Registrar" method="post">
        Nombre Completo:    <input type="text" name="nombre"/><br> 
        Sexo:               <input type="radio" name="sexo" value="masculino"/> Masculino<input type="radio" name="sexo" value="femenino"/> Femenino<br>
        Edad:               <input type="text" name="edad"/><br>
        Estatura:           <input type="text" name="estatura"><br>
        Alias:              <input type="text" name="alias"/><br>
        Contraseña:         <input type="text" name="pass"/><br>
        <input type="submit" value="Registrar">
        </form>
    </body>
</html>

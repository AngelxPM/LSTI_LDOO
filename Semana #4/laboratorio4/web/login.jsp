<%-- 
    Document   : index
    Created on : 21/02/2017, 07:40:22 PM
    Author     : LSTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorio 4</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
            <h1>
                Bienvenido, por favor inicia sesion. 
            </h1>
        </header>
        <form name="Formulario" action="loginController" method="post">
            
            <br>
            
            
            
            <label>Usuario: </label> 
            <br>
            <input type="text" id="user" name="txt-username" />
            <br><br>
            <label>Contraseña: </label> 
            <br>
            <input type="password" id="pass" name="txt-password" />
            <br><br>
            
            <br>
            
            <input type="submit" id="sent" name="btn-enviar" value="Envar" />
            
        </form>
    </body>
</html>

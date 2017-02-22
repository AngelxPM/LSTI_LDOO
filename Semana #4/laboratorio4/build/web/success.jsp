<%-- 
    Document   : success
    Created on : 19/02/2017, 09:09:12 PM
    Author     : AngelxPM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión válido</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>

        <h1>Inicio de sesión válido</h1>

        <h2>Hola <%= request.getAttribute("username") %></h2>
        
        <br>
        <br>
        
        <h3>Informacion:</h3>
        <label>Nombre: </label>     <%= request.getAttribute("name") %>
        <br>
        <label>Apellido: </label>   <%= request.getAttribute("apellido") %>
        <br>
        
        <label>E-MAIL: </label>     <%= request.getAttribute("email") %>
        <br>
        <label>Ocupacion: </label>  <%= request.getAttribute("ocupacion") %>
        <br>
        <label>Username: </label>   <%= request.getAttribute("username") %>
        
    </body>
</html>

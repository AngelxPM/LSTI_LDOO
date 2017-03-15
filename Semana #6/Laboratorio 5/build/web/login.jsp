<%-- 
    Document   : login
    Created on : 21/02/2017, 07:45:26 PM
    Author     : Angel Adolfo Pacheco Mazuca 1656991
--%>
<% 
    String username = "";
    if(session.getAttribute("username") != null){
        response.sendRedirect("success.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1>Bienvenido, por favor inicia sesio.</h1>
        
        <form action="LoginController" method="POST">
            <label>Usuario:</label><br>
            <input type="text" name="username" value="">
            <br></br>
            <label>Password:</label><br>
            <input type="password" value="" name="password">
            <br></br>
            <input type="submit" value="Enviar" name="submit">
        </form>
    </body>
</html>

<%-- 
    Document   : success
    Created on : 21/02/2017, 07:45:45 PM
    Author     : Angel Adolfo Pacheco Mazuca 1656991
--%>

<%
    if (session.getAttribute("username")== null){
    response.sendRedirect("login.jsp");
    }
    
    Cookie []c = request.getCookies();
    String value = "";
    for(int i = 0; i<c.length;i++){
        String nombre = c[i].getName();
        if(nombre.equals("Color")){
            value = c[i].getValue();
        }
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfile Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body style="background-color: <%=value%>">
        
        <form action="Perfilcontroller">
            <h1>Bienvenido de nuevo, <%= session.getAttribute("username") %></h1>
            <br>
            <h2>Datos personales: </h2>
            <br>
            Usuario: <%= session.getAttribute("username") %>        <br><br>
            Email: <%= session.getAttribute("email") %>             <br><br>
            Nombre: <%= session.getAttribute("nombre") %>           <br><br>
            Apellidos: <%= session.getAttribute("apellido") %>      <br><br>
            Ocupacion: <%= session.getAttribute("ocupacion") %>     <br><br>
            <br>
            <h2>Configuracion: </h2>
            <br>
            Color: 
            <select name="color">
                <option value="blue">Azul</option>
                <option value="purple">Morado</option>
                <option value="red">Rojo</option>
                <option value="white">Blanco</option>
            </select>
            <input type="submit" value="Guardar"/>
            
            <br>
            <br>
            <a href="logout" onclick="document.form.submit();">Cerrar sesion</a>
        </form>
        
    
    
    </body>
</html>

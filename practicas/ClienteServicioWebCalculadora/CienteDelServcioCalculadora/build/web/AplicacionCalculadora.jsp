<%-- 
    Document   : AplicacionCalculadora
    Created on : 27-jun-2015, 21:02:16
    Author     : Patricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        
        <form action="Inicio" method="POST">
            <p>  Valor de  x:</p>
            <input type="text" id="x" name="x"/>
            <p>   Valor de  y: </p>
            <input type="text" id="y" name="y"/><br><br>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>

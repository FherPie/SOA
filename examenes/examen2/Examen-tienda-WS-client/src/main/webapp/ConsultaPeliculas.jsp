<%-- 
    Document   : ConsultaPeliculas
    Created on : 01-ago-2015, 19:46:19
    Author     : Patricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Peliculas</title>
        <style>
            table thead tr th{
                
                color:gold;
                font-size: 30px;
                
            }
              table tbody tr td{
                
                color:gold;
                font-size: 30px;
                
            }
            #boton{
               color:red;
               font-size: 30px;
               background-color: darkslateblue;
               }
               
               body{
                   
                   background-size: cover;
                   background-color: navy;
                   
               }
               
               .entry{
                      color:red;
               font-size: 30px;
               background-color: darkslateblue;
                   
               }
            
        </style>
        
        
        
        
    </head>
    <body>
 
        <form action="peiliculasconsulta" method="POST">
            
            <table>
                <thead>
                    
                     <tr>
                         <th colspan="2">Buscar Peliculas por Director</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Ingrese el Nombre del Director:</td>
                        <td><input type="text" name="peliculatitulo" value="Director" class="entry" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Buscar"  id="boton"/></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 21/03/2014, 14:34:39
    Author     : filipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/csslogin.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="top_bar">
            <div id="home">

            </div>
        </div>
        <div id="wrapper">
            <div id="box">
                <div id="top_header">
                    <h3>Login</h3>
                    <br>
                </div>
                <form name="login" method="POST" action="Login">
                    <di id="inputs">
                        <input type="text" name="usuario" placeholder="Login">
                        <input type="password" name="senha" placeholder="Senha">
                        <input type="submit" value="Entrar">
                    </di>
                </form>
                <br>
            </div>
        </div>
    </body>
</html>

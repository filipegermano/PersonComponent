<%-- 
    Document   : cadastropessoa
    Created on : 22/03/2014, 10:46:22
    Author     : filipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/cssform.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="../css/cssmenu.css">
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div id="top_bar">
            <div id="home">

            </div>
        </div>
        <div id="wrapper">
            <div id="box">
                <div id="top_header">
                    <h3>Cadastro de Pessoa</h3>
                    <br>
                </div>
                <di id="inputs">
                    <input type="text" placeholder="Nome">
                    <input type="text" placeholder="CPF">
                    <input type="text" placeholder="CPF">
                    <input type="text" placeholder="CPF">
                    <input type="text" placeholder="CPF">
                    <input type="text" placeholder="E-mail">
                    <textarea type="text" placeholder="Mensagem"></textarea>
                    <input type="password" placeholder="Senha">
                    <input type="submit" value="Entrar">
                </di>
                <br>
            </div>
        </div>
    </body>
</html>

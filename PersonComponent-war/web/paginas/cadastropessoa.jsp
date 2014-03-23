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
                <form name="cadastro_pessoa" method="POST" action="SalvarPessoa">
                    <di id="inputs">
                        <input type="text" value="${pessoa.nome}" name="nome" placeholder="Nome" required="true">
                        <input type="text" value="${pessoa.cpf}" name="cpf" placeholder="CPF" required="true">                    
                        <input type="text" value="${pessoa.email}" name="email" placeholder="E-mail" required="true">
                        <input type="text" name="foto1" placeholder="Caminho da 1ª foto..." required="true">
                        <!--<input type="file" name="foto1" placeholder="Foto 1" required="true">-->
                        <input type="text" name="foto2" placeholder="Caminho da 2ª foto..." required="true">
                        <input type="text" name="foto3" placeholder="Caminho da 3ª foto..." required="true">
                        <input type="text" name="foto4" placeholder="Caminho da 4ª foto..." required="true">
                        <!--                    <textarea type="text" placeholder="Mensagem"></textarea>
                                            <input type="password" placeholder="Senha">-->
                        <input type="submit" value="Gravar">
                    </di>
                </form>
                <br>
            </div>
        </div>
    </body>
</html>

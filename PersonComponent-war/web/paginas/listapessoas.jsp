<%-- 
    Document   : listapessoas
    Created on : 22/03/2014, 17:03:43
    Author     : filipe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <title>Consulta de Pessoas</title> 
        
        <link rel="stylesheet" type="text/css" href="../css/cssmenu.css">
        <link href="../css/cssformtable.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="../css/csstable.css">
    </head>    
    <body>
        <jsp:include page="menu.jsp"/>

        <div class="container">
            <div style="margin:15px auto; width:1000px" id="scroll">
                <center>
                    <h3>Consulta de Pessoas</h3>
                    <form name="cadastro_pessoa" method="POST" action="ListaPessoas">
                        <input type="text" name="email" placeholder="E-mail">
                        <input type="submit" value="Buscar">
                    </form>
                    <br>
                    <table class="table-light">
                        <tr>
                            <th style="width:4%;">Id</th>
                            <th style="width:20%;">Nome</th>
                            <th style="width:10%;">CPF</th>
                            <th style="width:20%;">E-Mail</th>
                            <th style="width:5%;">Actions</th>		
                        </tr>
                        <c:forEach var="pessoas" items="${listaPessoas}">
                            <tr>
                                <td><c:out value="${pessoas.id}"/></td>
                                <td><c:out value="${pessoas.nome}"/></td>
                                <td><c:out value="${pessoas.cpf}"/></td>
                                <td><c:out value="${pessoas.email}"/></td>
                                <td><a href="AlteraPessoa?idPessoa=<c:out value="${pessoas.id}"/>" title="Editar"><img src="img/edit.png" alt=""></a> <a href="ExcluirPessoa?idPessoa=<c:out value="${pessoas.id}"/>" title="Excluir"><img src="img/delete.png" alt=""></a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </center>
            </div>
        </div>
    </body>
</html>

<%-- 
    Document   : menu
    Created on : 22/03/2014, 11:23:01
    Author     : filipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="#">Cadastros</a>
            <ul>
                <li><a href="CadastroPessoa">Pessoa</a></li>
                <li><a href="CadastroDataShow">Data Shows</a>
                </li>
            </ul>
        </li>
        <li><a href="#">Listar</a>
            <ul>
                <li><a href="ListaProfessor">Professores</a></li>
                <!--<li><a href="ListaProfessores">Professores</a></li>-->
                <li><a href="ListaAluno">Alunos</a></li>
                <li><a href="ListaDataShows">Data Shows</a></li>
            </ul>
        </li>
        <li><a href="#">Emprestimos</a>
            <ul>
                <li><a href="CadastroEmprestimo">Emprestar</a></li>
                <li><a href="Devolver">Devolver</a></li>
            </ul>
        </li>
        <li><a href="#">Consultas</a>
            <ul>
                <li><a href="ListaEmpAtivos">Emprestimos Ativos</a></li>
                <li><a href="ListaEmpProfessor">Emprestimos Professores</a></li>
                <li><a href="ListaEmpAluno">Emprestimos Alunos</a></li>
                <li><a href="ListaEmpHistorico">Histórico de Emprestimos</a></li>
            </ul>
        </li>
        <li><a href="sobre.jsp">Sobre</a></li>
    </ul>
</nav>

<%-- 
    Document   : index
    Created on : 10/04/2017, 21:45:24
    Author     : rosenhaim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADICIONAR ALUNO</h1>
         <form name="formularioLogin" action="ActionAluno">
        </br>Nome = <input type="text" name="nome" value="" size="40" />
        </br>Matricula = <input type="text" name="matricula" value="" size="40" />
        <input type="submit" value="Adicionar" name="btlogin" />
        
        </form>
        <a href="http://localhost:8080/autenticacao/adicionarocorrencia.jsp">NOVA OCORRÊNCIA</a>
        
        
        
    </body>
</html>

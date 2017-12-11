<%-- 
    Document   : adicionarocorrencia
    Created on : 23/04/2017, 20:00:15
    Author     : jessyca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>CADASTRO DE OCORRÊNCIAS</h1>
         <form name="formularioLogin" action="ActionIncluirOcorrencia">
        </br>Matricula = <input type="text" name="matricula" value="" size="40" />
        </br>Ocorrencia = <select name="Ocorrencias">
            <option>Aluno faltou</option>
            <option>Aluno desrespeitou professor</option>
        </select></br>
        <input type="submit" value="gravar" name="btgravar" />
        
        </form>
        
        
        
    </body>
</html>

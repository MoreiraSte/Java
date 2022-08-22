<!-- Stephany Moreira Casa Grande HT3001946  -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Tarefas</title>
        <link href="estilo.css" rel="stylesheet">
    </head>
    <body>
        <h1> Tarefas Cadastradas:</h1>

        
        <table id="customers">
            <tr>
                <th>Tarefa</th>
                <th>Prioridade</th>
            </tr>
			
			<c:forEach var="tarefa" items="${lista_tarefas}">
				<tr> 
					<td>${tarefa.descricao}</td>
					<td>${tarefa.prioridade}</td>
				</tr>
			
			</c:forEach>
           
        </table>
    </body>
</html>

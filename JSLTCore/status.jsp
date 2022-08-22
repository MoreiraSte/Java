<!--Stephany Moreira Casa Grande HT3001946--> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Status</title>
    </head>
    <body>
        <h1>
		
			<c:choose>
				<c:when test="${status}">
					A tarefa foi ${operacao} com sucesso!
				</c:when>
				
				<c:otherwise>
					Erro! A tarefa não pôde ser ${operacao}.
				</c:otherwise>
			</c:choose>
            
        </h1>
    </body>
</html>

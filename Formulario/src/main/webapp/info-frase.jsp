<%@ page import = "atividade.OperacoesString" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
Frase informada : ${param.frase}<br>

Curiosidades sobre a frase informada:
<br>
Frase em maiuscula :<br><%
String frase = request.getparameter("frase");
 String novafrase = OperacoesString.converteMaiuscula(frase); %>
out.println(novafrase);

</body>
</html>
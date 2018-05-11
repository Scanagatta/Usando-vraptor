<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<br/>Tabela de pontos
<br/>
<br/>
<table>
<tr>
	<td>Código</td>
	<td>Nome</td>
	<td>Pontos</td>
</tr>
<c:forEach var="equipe" items="${equipes}">
<tr>
	<td>${equipe.codigo}</td>

	<td>
		<a href="editar/${equipe.codigo}">
			${equipe.nome}
		</a>
	</td>

	<td>
		${equipe.pontos}
	</td>
</tr>
</c:forEach>
</table>
&emsp;
&emsp;
&emsp;
<a href="../menu/menujogo">
<input type="button"value="Menu"></input>
</a>

</body>
</html>
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
<br/>Confederações
<br/>
<br/>
<table>
<tr>
	<td>Código</td>
	<td>Nome</td>
</tr>
<c:forEach var="confederacao" items="${confederacaos}">
<tr>
	<td>${confederacao.codigo}</td>
	<td>
		<a href="editar/${confederacao.codigo}">
			${confederacao.nome}
		</a>
	</td>
</tr>
</c:forEach>
</table>
&emsp;
&emsp;
&emsp;
<a href="../index/index"><input type="button"value="Menu"></input></a>

</body>
</html>
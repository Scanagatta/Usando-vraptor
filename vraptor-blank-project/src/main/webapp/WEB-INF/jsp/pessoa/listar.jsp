<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
	<td>Código</td>
	<td>Nome</td>
	<td>Cidade</td>

</tr>
<c:forEach var="pessoa" items="${pessoas}">
<tr>
	<td>${pessoa.codigo}</td>
	<td>
		${pessoa.nome}
	</td>
		<td>
		${pessoa.cidade.nome}
	</td>
</tr>
</c:forEach>
</table>
	

</body>
</html>
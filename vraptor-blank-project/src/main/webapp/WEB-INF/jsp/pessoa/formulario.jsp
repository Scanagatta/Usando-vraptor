<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<form action="cadastrar" method="post">
	<br />Codigo: <input type= "text" name="pessoa.codigo"/>
	<br />Nome: <input type="text" name="pessoa.nome"/>
	<br/>Cidade: 
<select name="pessoa.cidade.codigo">
	<c:forEach var="cidade" items="${cidades}">
		<option value="${cidade.codigo}">
		${cidade.nome}
		</option>
	</c:forEach>
</select>
	<br /> <input type="submit" value= "Ok"/>
	

</form>

</body>
</html>
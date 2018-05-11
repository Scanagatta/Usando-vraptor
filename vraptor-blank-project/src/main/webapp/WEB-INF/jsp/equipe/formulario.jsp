<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<br/>Cadastrar Equipe
<br/>
<form action="cadastrar" method="post">
<c:if test="${equipe.codigo != null}">
<br/>Código: <input type="text" name="equipe.codigo" value="${equipe.codigo}" readonly="readonly"/>
</c:if>
<c:if test="${equipe.codigo == null}">
<br/>Código: <input type="text" name="equipe.codigo" value="${equipe.codigo}"/>
</c:if>
<br/>Nome:   <input type="text" name="equipe.nome" 	value="${equipe.nome}"/>
<br/>Serie: 

		<c:if test="${'a'== equipe.serie}">
			<input type="radio" name="equipe.serie" value="a" checked="checked"/> A
		</c:if> 
		<c:if test="${! ('a' == equipe.serie)}">
			<input type="radio" name="equipe.serie" value="a"/> A
		</c:if> 
		
		<c:if test="${'b' == equipe.serie}">
			<input type="radio" name="equipe.serie" value="b" checked="checked"/> B
		</c:if> 
		<c:if test="${! ('b' == equipe.serie)}">
			<input type="radio" name="equipe.serie" value="b"/> B
		</c:if> 

		<c:if test="${'c' == equipe.serie}">
			<input type="radio" name="equipe.serie" value="c" checked="checked"/> C
		</c:if> 
		<c:if test="${! ('c' == equipe.serie)}">
			<input type="radio" name="equipe.serie" value="c"/> C
		</c:if> 

		<c:if test="${'d' == equipe.serie}">
			<input type="radio" name="equipe.serie" value="d" checked="checked"/> D
		</c:if> 
		<c:if test="${! ('d' == equipe.serie)}">
			<input type="radio" name="equipe.serie" value="d"/> D
		</c:if> 


<br/>Confederacao: 
<select name="equipe.confederacao.codigo">
	<c:forEach var="conf" items="${confederacaos}">

		<c:if test="${conf.codigo == equipe.confederacao.codigo}">
			<option value="${conf.codigo}" selected="selected">${conf.nome}</option>
		</c:if> 
		<c:if test="${! (conf.codigo == equipe.confederacao.codigo)}">
			<option value="${conf.codigo}">${conf.nome}</option>
		</c:if>
	</c:forEach>
</select>
<br/>
<br/><input type="submit" value="Salvar" />
&emsp;
&emsp;
&emsp;
<a href="../menu/menujogo">
<input type="button" value="Menu"></input>
</a>
</form>


</body>
</html>
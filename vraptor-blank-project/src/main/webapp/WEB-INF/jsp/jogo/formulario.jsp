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
<br/>Cadastrar jogo
<br/>
<form action="cadastrar" method="post">
<br/>
<c:if test="${jogo.codigo != null}">
Código: <input type="text" name="jogo.codigo" value="${jogo.codigo}" readonly="readonly"/>
</c:if>
<c:if test="${jogo.codigo == null}">
Código: <input type="text" name="jogo.codigo" value="${jogo.codigo}"/>
</c:if>
<br></br>
<br/>Equipe1
	<select name="jogo.equipe1.codigo">
		<c:forEach var="equipe" items="${equipes}">

		<c:if test="${equipe.codigo == jogo.equipe1.codigo}">
			<option value="${equipe.codigo}" selected="selected">${equipe.nome}</option>
		</c:if> 
		<c:if test="${! (equipe.codigo == jogo.equipe1.codigo)}">
			<option value="${equipe.codigo}">${equipe.nome}</option>
		</c:if>

		</c:forEach>
	</select>
<br/>Gols <input type="text" name="jogo.resultado1" value="${jogo.resultado1}"/>

<br/>
<br/>

<br/>Equipe2
	<select name="jogo.equipe2.codigo">
		<c:forEach var="equipe" items="${equipes}">
			
		<c:if test="${equipe.codigo == jogo.equipe2.codigo}">
			<option value="${equipe.codigo}" selected="selected">${equipe.nome}</option>
		</c:if> 
		<c:if test="${! (equipe.codigo == jogo.equipe2.codigo)}">
			<option value="${equipe.codigo}">${equipe.nome}</option>
		</c:if>
		
		</c:forEach>
	</select>

<br/>Gols <input type="text" name="jogo.resultado2" value="${jogo.resultado2}"/>

<br/>
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
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
<br/>Cadastrar Confederação
<br/>
<form action="cadastrar" method="post">
<c:if test="${confederacao.codigo != null}">
	<br/>Código: <input type="text" name="confederacao.codigo" value= "${confederacao.codigo}" readonly="readonly"/>
</c:if>
<c:if test="${confederacao.codigo == null}">
	<br/>Código: <input type="text" name="confederacao.codigo" value= "${confederacao.codigo}"/>
</c:if>

<br/>Nome:   <input type="text" name="confederacao.nome" value= "${confederacao.nome}"/>
<br/>
<br/><input type="submit" value="Salvar" />
&emsp;
&emsp;
&emsp;
<a href="../index/index"> <input type="button" value="Menu"></input> </a>

</form>



</body>
</html>
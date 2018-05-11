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

<c:forEach var="j" items="${jogos}">
  <br/> 
  <a href="editar/${j.codigo}">
  jogo numero ${j.codigo}
  </a>
  <br>
  [ equipe: ${j.equipe1.nome} | gols: ${j.resultado1} ]<br>
  [ equipe: ${j.equipe2.nome} | gols: ${j.resultado2} ]
  <br />
</c:forEach>
<br>
<a href="../menu/menujogo">
<input type="button" value="Menu"></input>
</a>
</body>
</html>
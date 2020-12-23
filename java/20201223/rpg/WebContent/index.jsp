<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="rpg.*"%>
    <% Monster[] monsters={
    		new Slime("スラきち"),
    		new DeathBat("ゴメス"),
    		new Slime("スラッチ"),
    };
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RPG</title>
</head>
<body>
<% for(Monster m:monsters){ %>
<p><%=m.run() %></p>
<%} %>
</body>
</html>
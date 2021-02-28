<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="static poly.util.CmmUtil.nvl" %>

<% 
	String name = nvl((String)request.getAttribute("name"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	안녕하세요, <%=name %>님!
</body>
</html>
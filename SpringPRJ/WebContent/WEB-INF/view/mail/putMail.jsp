<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일 전송 폼</title>
</head>
<body>
<form action="sendMail.do" method="get">
<table border="1">
<tr>
<td>받는 사람</td>
<td><input type="text" name="toMail"></td>
</tr>

<tr>
<td>메일 제목</td>
<td><input type="text" name="title"></td>
</tr>

<tr>
<td>메일 내용</td>
<td><input type="text" name="contents"></td>
</tr>

</table>
<input type="submit" value="[메일 전송]">
<input type="reset" value="[내용초기화]">
</form>
</body>
</html>
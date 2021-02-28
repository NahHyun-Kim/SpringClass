<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
		border : 1px solid black;
	}
</style>
</head>
<body>
<a href="/user/loginForm.do">로그인</a>
<a href="/user/userRegForm.do">회원가입</a>
<a href="/movie/getMovieInfoFromWEB.do">영화 크롤링하기</a>
<a href="/ocr/imageFileUpload.do">이미지 인식하기</a>
<br />
<%for(int i=1; i<=5; i++) { %>
<p><%=i %>번째 줄입니다.</p>
<% } %>
<br />
<h1>테이블 연습</h1>
<table border="1">
<% for(int row=0; row<3; row++) { %>
	<tr>
	<% for(int col=0; col<4; col++) { %>
		<td><%=row %>행 <%=col %>열</td>
	<% } %>
	</tr>
	<% } %>
</table>
</body>
</html>
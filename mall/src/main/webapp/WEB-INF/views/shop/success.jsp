<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 로그인 성공</h1>
<p>
${sessionScope.memId } 님 로그인 중입니다</p>
<a href="/shop/logout" >로그아웃</a>
</body>
</html>
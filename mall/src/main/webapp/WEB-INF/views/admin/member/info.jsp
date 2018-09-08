<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set value="${memberInfo}" var="mem" />
<table>
	<tr>
		<td colspan="2" style="text-align: center;">사용자정보</td>
	</tr>
	<tr>
		<td>고유번호</td><td><input type="text" value="${mem.memSq}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>아이디</td><td><input type="text" value="${mem.memId}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>비밀번호</td><td><input type="text" value="${mem.memPw}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>전화번호</td><td><input type="text" value="${mem.memPhone}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>이름</td><td><input type="text" value="${mem.memName}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>우편번호</td><td><input type="text" value="${mem.memPostAddr}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>주소</td><td><input type="text" value="${mem.memAddr}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>등급</td><td><input type="text" value="${mem.memLevel}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>상태</td><td><input type="text" value="${mem.memState}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>마케팅 동의여부</td><td><input type="text" value="${mem.memMarketing}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>가입일시</td><td><input type="text" value="${mem.memJoinDate}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>마지막로그인일시</td><td><input type="text" value="${mem.memLastLogin}" readonly="readonly"/></td>
	</tr>
</table>
</body>
</html>
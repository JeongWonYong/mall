<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/admin/adminHeader.jsp" %>
</head>
<body>
<c:forEach items="${memberList}" var="i">
	<p>${i }</p>
</c:forEach>

</body>
</html>
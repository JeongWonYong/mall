<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/admin/adminHeader.jsp" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:admin_template>
    <jsp:attribute name="customCss">
    </jsp:attribute>
    <jsp:attribute name="customJs">
		<script type="text/javascript">
			$(function(){
				$('p').on('click',function(){
					var sq = $(this).data().memSq;
					
					location.href = "/member/detail?memSq="+sq;
				});
			});
		</script>
    </jsp:attribute>
<jsp:body>

<c:forEach items="${memberList}" var="i">
	<p data-mem-sq="${i.memSq }">${i }</p>
</c:forEach>

</jsp:body>
</t:admin_template>
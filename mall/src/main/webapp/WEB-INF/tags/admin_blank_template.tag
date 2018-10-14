<%@ tag description="Admin Template" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="i" tagdir="/WEB-INF/tags/include" %>
<%@ attribute name="customCss" fragment="true" required="false" %>
<%@ attribute name="customJs" fragment="true" required="false"  %>
<!DOCTYPE html>
<html>
<head>
    <i:admin_include_meta/>
    <i:admin_include_css/>
    <jsp:invoke fragment="customCss"/>
</head>
<body>
<div class="container-fluid">
    <jsp:doBody/>
    <i:admin_include_js/>
    <jsp:invoke fragment="customJs"/>
</div>
</body>
</html>
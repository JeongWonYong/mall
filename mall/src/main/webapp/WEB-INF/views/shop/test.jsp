<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:admin_template>
    <jsp:attribute name="customCss">
    </jsp:attribute>
    <jsp:attribute name="customJs">
    </jsp:attribute>
<jsp:body>
<div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="/shop/login" method="post">
                        <input type="hidden" name="action" value="login" > <%--ë¡ê·¸ì¸  ì¡ì--%>
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="memId" name="memId" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="memPw" name="memPw" type="password" value="">
                                </div>
<!--                                 <div class="checkbox"> -->
<!--                                     <label> -->
<!--                                         <input name="remember" type="checkbox" value="Remember Me">Remember Me -->
<!--                                     </label> -->
<!--                                 </div> -->
                                <!-- Change this to a button or input when using this as a form -->
                                <input type="submit" class="btn btn-lg btn-success btn-block" value="Login">
                                <span class="bg-danger">${msg }</span>${msg }
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</jsp:body>
</t:admin_template>
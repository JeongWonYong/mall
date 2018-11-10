<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:admin_template>
	<jsp:attribute name="customCss">
    </jsp:attribute>
	<jsp:attribute name="customJs">
    </jsp:attribute>
	<jsp:body>
<div class="container">

<nav class="navbar navbar-inverse">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbarBtn"
                aria-expanded="false">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#"> 커뮤니티 </a>
    </div>

    <div class="collapse navbar-collapse" id="navbarBtn">

        <ul class="nav navbar-nav">
            <li><a href="#" onclick="url_post('main.spring','main')"> 메인</a></li>
            <li><a href="#" onclick="url_post('main.spring','boardlist')"  class="active"> 게시판</a></li>
        </ul>

        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                   aria-expanded="false">접속하기 <span class="caret"></span></a>

                <ul class="dropdown-menu">
                    <li><a href="#" onclick="url_post('main.spring','login')">로그인</a></li>
                    <li><a href="#" onclick="url_post('main.spring','join')">회원가입</a></li>
                </ul>
            </li>

        </ul>
    </div>
</nav>
<div class="row">
    <div class="text-center"><h1>글목록</h1></div>
</div>
<div class="container-fluid">
    <table class="table table-bordered">
        <thead>
        <th>No</th>
        <th>제목</th>
        <th>작성자</th>
        <th>날짜</th>
        </thead>
        <tbody>
        
<c:forEach var="list" items="${noticeList}">
        <tr>
            <td>${list.noticeSeq }</td>
            <td><a href="#">${list.noticeTitle}</a> </td>
            <td>${list.insertID }</td>
            <td>${list.insertDate }</td>
        </tr>
</c:forEach>
        </tbody>
         <tr> 
            <td>1</td>
            <td>제목</a> </td>
            <td>회원번호</td>
            <td>수정일</td>
        </tr>
    </table>
    <a href="boardwrite.jsp" class="btn btn-primary pull-right">글쓰기</a>
</div>

       
    </div>
</jsp:body>
</t:admin_template>
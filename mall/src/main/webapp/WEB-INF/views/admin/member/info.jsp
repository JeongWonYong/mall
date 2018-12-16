<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:admin_template>
    <jsp:attribute name="customCss">
    </jsp:attribute>
    <jsp:attribute name="customJs">
		<script type="text/javascript">
			$(function(){
				var memberInfo = {
						memSq : $('#memSq').val()
						,memLevel : $('#memLevel').attr('data-default')
						,memState : $('#memState').attr('data-default')
						,memMarkegintYn : $('#memMarketingYn').attr('data-default')
				};
				
				$('#memLevel option[value='+memberInfo.memLevel+']').prop('selected',true);
				$('#memState option[value='+memberInfo.memState+']').prop('selected',true);
				$('#memMarketingYn option[value='+memberInfo.memMarkegintYn+']').prop('selected',true);
				
				//이전
				$('#btnLeft').on('click',function(){
					if($(this).hasClass('back')){
						history.go(-1);
					} else if ($(this).hasClass('false')){
						$('#memLevel option[value='+memberInfo.memLevel+']').prop('selected',true);
						$('#memState option[value='+memberInfo.memState+']').prop('selected',true);
						$('#memMarketingYn option[value='+memberInfo.memMarkegintYn+']').prop('selected',true);
						$('#memLevel, #memState, #memMarketingYn').prop('disabled',true);
						$('#btnSubmit').removeClass().addClass('modify').text("수정");
					}
				});
				$('#btnSubmit').on('click',function(){
					if($(this).hasClass('modify')){
						$(this).text('수정 적용').removeClass('modify').addClass('submit');
						$('#btnLeft').removeClass().addClass('false').text('취소');
						$('#memLevel, #memState, #memMarketingYn').prop('disabled',false);
					} else if($(this).hasClass('submit')){
						memberInfo.memLevel = $('#memLevel').val();
						memberInfo.memState = $('#memState').val();
						memberInfo.memMarkegintYn = $('#memMarketingYn').val();
						
						console.log(memberInfo);
						$.ajax({
							type : "POST"
							, url : "/member/modify"
							, contentType: "application/json; charset=utf-8"
							, dataType : "json"
							, data : 	JSON.stringify(memberInfo)
							,success : function(data){
								if("0000" == data.result.CODE){
									//성공
								}
								//9999 : 실패
								alert(data.result.MSG);
							}
						});
					}
				});
			});
		</script>
    </jsp:attribute>
<jsp:body>
<c:set value="${memberInfo}" var="mem" />
<div id="wrapper">
	<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">사용자 정보</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <!-- <div class="panel-heading">
                            
                        </div> -->
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" action="" id="memInfo">
                                        <div class="form-group">
                                            <label>고유번호</label>
                                            <input type="text" id="memSq" class="form-control" placeholder="고유번호" value="${mem.memSq }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>아이디</label>
                                            <input type="text" class="form-control" placeholder="아이디" value="${mem.memId }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>비밀번호</label>
                                            <input type="text" class="form-control" placeholder="비밀번호" value="${mem.memPw }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>이름</label>
                                            <input type="text" class="form-control" placeholder="이름" value="${mem.memName }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>전화번호</label>
                                            <input type="text" class="form-control" placeholder="전화번호" value="${mem.memPhone }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>우편번호</label>
                                            <input type="text" class="form-control" placeholder="우편번호" value="${mem.memPostAddr }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>주소</label>
                                            <input type="text" class="form-control" placeholder="주소" value="${mem.memAddr }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>등급</label>
                                            <%-- <input type="text" class="form-control" placeholder="등급" value="${mem.memLevel }" readonly="readonly"> --%>
                                            <select class="form-control" id="memLevel" disabled="disabled" data-default="${mem.memLevel }">
	                                                <option value="1">준회원</option>
	                                                <option value="2">정회원</option>
	                                                <option value="3">VIP</option>
                                            </select>
                                            
                                        </div>
                                        <div class="form-group">
                                            <label>상태</label>
                                            <%-- <input type="text" class="form-control" placeholder="상태" value="${mem.memState }" readonly="readonly"> --%>
                                            <select class="form-control" id="memState" disabled="disabled"data-default="${mem.memState }">
	                                                <option value="Y">회원</option>
	                                                <option value="N">탈퇴</option>
	                                                <option value="S">휴면</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>마케팅동의여부</label>
                                            <%-- <input type="text" class="form-control" placeholder="마케팅동의여부" value="${mem.memMarketingYn }" readonly="readonly"> --%>
                                           <select class="form-control" id="memMarketingYn" disabled="disabled" data-default="${mem.memMarketingYn }">
	                                                <option value="Y" selected>Y</option>
	                                                <option value="N">N</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label>가입일시</label>
                                            <input type="text" class="form-control" placeholder="가입일시" value="${mem.memJoinDate }" readonly="readonly">
                                        </div>
                                        <div class="form-group">
                                            <label>마지막로그인일시</label>
                                            <input type="text" class="form-control" placeholder="마지막로그인일시" value="${mem.memLastLogin }" readonly="readonly">
                                        </div>
                                    </form>
                                </div>
                                <div>
                                	<button id="btnLeft" class="back">이전</button>
                                	<button id="btnSubmit" class="modify">수정</button>
                                </div>
                                </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
	</div>
<!-- /#wrapper -->
</jsp:body>
</t:admin_template>
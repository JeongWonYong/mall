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
				$('#dataTables tr').on('click',function(){
					var sq = $(this).data().memSq;
					
					location.href = "/member/detail?memSq="+sq;
				});
			});
		</script>
    </jsp:attribute>
<jsp:body>
<div id="wrapper">
	<div id="page-wrapper">
		<div class="row">
		    <div class="col-lg-12">
		        <h1 class="page-header">사용자 목록</h1>
		    </div>
		    <!-- /.col-lg-12 -->
		</div>
            <!-- /.row -->
		<div class="row">
		    <div class="col-lg-12">
		        <div class="panel panel-default">
		           <!--  <div class="panel-heading">
		                DataTables Advanced Tables
		            </div> -->
		            <!-- /.panel-heading -->
		<div class="panel-body">
		    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
				<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>level</th>
					<th>state</th>
					<th>lastLoginDate</th>
				</tr>
				</thead>
		<tbody>
			<c:forEach items="${memberList}" var="i">
				<tr class="odd gradeX" data-mem-sq="${i.memSq }">
					<td>${i.memId}</td>
					<td class="center">${i.memName}</td>
					<td>${i.memLevel}</td>
					<td>${i.memState}</td>
					<td>${i.memLastLogin}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
                   <!-- /.table-responsive 
                   <div class="well">
                       <h4>DataTables Usage Information</h4>
                       <p>DataTables is a very flexible, advanced tables plugin for jQuery. In SB Admin, we are using a specialized version of DataTables built for Bootstrap 3. We have also customized the table headings to use Font Awesome icons in place of images. For complete documentation on DataTables, visit their website at <a target="_blank" href="https://datatables.net/">https://datatables.net/</a>.</p>
                       <a class="btn btn-default btn-lg btn-block" target="_blank" href="https://datatables.net/">View DataTables Documentation</a>
                   </div>
                   -->
               </div>
               <!-- /.panel-body -->
           </div>
           <!-- /.panel -->
       </div>
       <!-- /.col-lg-12 -->
		</div>
	</div>
	<!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
</jsp:body>
</t:admin_template>
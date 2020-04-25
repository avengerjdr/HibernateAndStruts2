<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script src="js/jquery-3.4.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<body>
		<div class="col-md-8 col-md-offset-2"><h3>修改部门</h3></div>
<div class="col-md-8 col-md-offset-2">
	<form action="deptUpdate.action" method="post" class="form-horizontal"
		role="form">
		<input name="dept.deptno" type="hidden" value="${dept.deptno}"/>
		<div class="form-group">
			<label class="col-md-3">部门名称</label>
			<div class="col-md-6">
				<input name="dept.dname" value="${dept.dname}" class="form-control"/>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3">部门地址</label>
			<div class="col-md-6">
				<input name="dept.loc" class="form-control" value="${dept.loc }"/>
			</div>
		</div>
		<button class="btn btn-primary btn-block col-md-2">确认修改</button>
	</form>
	</div>
</body>
</html>
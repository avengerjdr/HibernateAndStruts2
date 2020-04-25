<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<div class="col-md-8 col-md-offset-2"><h3>添加部门</h3></div>
<div class="col-md-8 col-md-offset-2">
	<form action="deptSave.action" method="post" class="form-horizontal"
		role="form">
		<div class="form-group">
			<label class="col-md-3">部门名称</label>
			<div class="col-md-6">
				<input name="dept.dname" class="form-control" placeholder="请输入名称"/>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3">部门地址</label>
			<div class="col-md-6">
				<input name="dept.loc" class="form-control" placeholder="请输入地址"/>
			</div>
		</div>
		<button class="btn btn-primary btn-block col-md-2">添加</button>
	</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加人员</title>
</head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script src="js/jquery-3.4.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<body>
	<div class="col-md-8 col-md-offset-2">
		<h3>添加人员</h3>
	</div>
	<div class="col-md-8 col-md-offset-2">
		<form action="empSave.action" method="post" class="form-horizontal"
			role="form">
			<div class="form-group">
				<label class="col-md-3">人员姓名</label>
				<div class="col-md-6">
					<input name="emp.ename" class="form-control" placeholder="请输入名称" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">人员职位</label>
				<div class="col-md-6">
					<input name="emp.job" class="form-control" placeholder="请输入职位" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">上级</label>
				<div class="col-md-6">
					<select name="emp.manager.empno">
						<c:forEach items="${emps}" var="emp">
							<option value="${emp.empno}">${emp.ename}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">入职时间</label>
				<div class="col-md-6">
					<input name="emp.hiredate" class="form-control" placeholder="请输入入职时间" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">工资</label>
				<div class="col-md-6">
					<input name="emp.sal" class="form-control" placeholder="请输入工资" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">奖金</label>
				<div class="col-md-6">
					<input name="emp.comm" class="form-control" placeholder="请输入奖金" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">部门</label>
				<div class="col-md-6">
					<select name="emp.dept.deptno">
						<c:forEach items="${depts}" var="dept">
							<option value="${dept.deptno}">${dept.dname}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<button class="btn btn-primary btn-block col-md-2">添加</button>
		</form>
	</div>
</body>
</html>
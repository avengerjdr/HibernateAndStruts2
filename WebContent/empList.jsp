<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script src="js/jquery-3.4.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<body>
<%@ include file="nav.jsp" %>
	<div class="col-md-8">
	<table class="table table-bordered table-striped table-hover">
		<h3>人员管理</h3>
		<tr>
			<th>人员编号</th>
			<th>人员姓名</th>
			<th>职位</th>
			<th>上级</th>
			<th>入职时间</th>
			<th>工资</th>
			<th>奖金</th>
			<th>部门</th>
			<th>删除</th>
			<th>编辑</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<th>${emp.empno}</th>
				<th>${emp.ename}</th>
				<th>${emp.job}</th>
				<th>${emp.manager.ename}</th>
				<th>${emp.hiredate}</th>
				<th>${emp.sal}</th>
				<th>${emp.comm}</th>
				<th>${emp.dept.dname}</th>
				<th><a href="empDel.action?emp.empno=${emp.empno}">删除</a></th>
				<th><a href="empFindOne.action?emp.empno=${emp.empno}">修改</a></th>
			</tr>
		</c:forEach>
	</table>
	<button	class="btn btn-primary" onclick="location.href='empAddForm.action'">添加人员</button>
	</div>
</body>
</html>
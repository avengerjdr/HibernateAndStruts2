<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h3>部门管理</h3>
		<tr>
			<th>部门编号</th>
			<th>部门名称</th>
			<th>部门地址</th>
			<th>删除</th>
			<th>编辑</th>
		</tr>
		<c:forEach items="${depts}" var="dept">
			<tr>
				<th>${dept.deptno}</th>
				<th>${dept.dname}</th>
				<th>${dept.loc}</th>
				<th><a href="deptDel.action?dept.deptno=${dept.deptno}">删除</a></th>
				<th><a href="deptFindOne.action?dept.deptno=${dept.deptno}">修改</a></th>
			</tr>
		</c:forEach>
	</table>
	<button	class="btn btn-primary" onclick="location.href='deptAdd.jsp'">添加部门</button>
	</div>
</body>
</html>
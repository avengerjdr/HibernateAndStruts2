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
	<div class="col-md-8 col-md-offset-2">
		<h3>修改人员</h3>
	</div>
	<div class="col-md-8 col-md-offset-2">
		<form action="empUpdate.action" method="post" class="form-horizontal"
			role="form">
			<input type="hidden" name="emp.empno" value="${emp.empno}">
			<div class="form-group">
				<label class="col-md-3">人员姓名</label>
				<div class="col-md-6">
					<input name="emp.ename" class="form-control" value="${emp.ename}" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">人员职位</label>
				<div class="col-md-6">
					<input name="emp.job" class="form-control" value="${emp.job}" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">上级</label>
				<div class="col-md-6">
					<select name="emp.manager.empno">
						<c:forEach items="${emps}" var="p">
							<c:choose>
								<c:when test="${p.empno==emp.manager.empno}">
									<option value="${p.empno}" selected="selected">${p.ename}</option>
								</c:when>
								<c:otherwise>
									<option value="${p.empno}">${p.ename}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">入职时间</label>
				<div class="col-md-6">
					<input name="emp.hiredate" class="form-control"
						 value="${emp.hiredate}" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">工资</label>
				<div class="col-md-6">
					<input name="emp.sal" class="form-control" value="${emp.sal}" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">奖金</label>
				<div class="col-md-6">
					<input name="emp.comm" class="form-control" value="${emp.comm}" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-3">部门</label>
				<div class="col-md-6">
					<select name="emp.dept.deptno">
						<c:forEach items="${depts}" var="d">
						<c:choose>
							<c:when test="${d.deptno==emp.dept.deptno}">
							<option value="${d.deptno}" selected="selected">${d.dname}</option>
							</c:when>
							<c:otherwise>
							<option value="${d.deptno}">${d.dname}</option>
							</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
				</div>
			</div>
			<button class="btn btn-primary btn-block col-md-2">修改</button>
		</form>
	</div>
</body>
</html>
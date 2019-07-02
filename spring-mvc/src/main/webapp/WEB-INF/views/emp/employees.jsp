<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HR</title>
</head>
<body>
	<h1>해당 부서에 맞는 사원들</h1>
	
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>이메일</th>
				<th>연락처</th>
				<th>입사일</th>
				<th>직종 아이디</th>
				<th>월급</th>
				<th>커미션</th>
				<th>매니저 아이디</th>
				<th>부서 아이디</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${emps }">
				<tr>
					<td>${emp.id }</td>
					<td><a href="employee.do?empid=${emp.id }">${emp.firstName } ${emp.lastName }</a></td>
					<td>${emp.email }</td>
					<td>${emp.tel }</td>
					<td>${emp.createDate }</td>
					<td>${emp.jobId }</td>
					<td>${emp.salary }</td>
					<td>${emp.commission }</td>
					<td>${emp.managerId }</td>
					<td>${emp.departmentId }</td>
				</tr>
			</c:forEach>		
		</tbody>
	</table>
</body>
</html>
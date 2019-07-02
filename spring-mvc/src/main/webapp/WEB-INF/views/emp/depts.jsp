<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>부서 목록</h1>
	
	<div>
		<a href="form.do">사원 등록</a>
	</div>

	<table>
		<thead>
			<tr>
				<th>부서 아이디</th>
				<th>부서 이름</th>
				<th>부서 관리자 아이디</th>
				<th>지역 아이디</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dept" items="${depts }">
				<tr>
					<td>${dept.id }</td>
					<td><a href="employees.do?deptid=${dept.id }">${dept.name }</a></td>
					<td>${dept.managerId }</td>
					<td>${dept.locationId }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>
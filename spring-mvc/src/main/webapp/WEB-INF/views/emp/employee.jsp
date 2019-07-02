<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 상세정보</h1>
	
	<dl>
		<dt>아이디</dt><dd>${emp.id }</dd>
		<dt>이름</dt><dd>${emp.firstName } ${emp.lastName }</dd>
		<dt>이메일</dt><dd>${emp.email }</dd>
		<dt>연락처</dt><dd>${emp.tel }</dd>
		<dt>입사일</dt><dd>${emp.createDate }</dd>
		<dt>직종 아이디</dt><dd>${emp.jobId }</dd>
		<dt>월급</dt><dd>${emp.salary }</dd>
		<dt>커미션</dt><dd>${emp.commission }</dd>
		<dt>매니저 아이디</dt><dd>${emp.managerId }</dd>
		<dt>부서 아이디</dt><dd>${emp.departmentId }</dd>
	</dl>

</body>
</html>
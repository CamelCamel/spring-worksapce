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
	<h1>직종 상세정보</h1>
	
	<div>
		<p><Strong>직종아이디 : </Strong>${job.id }</p>
		<p><Strong>직종제목 : </Strong>${job.title }</p>
		<p><Strong>최소급여 : </Strong>${job.minSalary }</p>
		<p><Strong>최대급여 : </Strong>${job.maxSalary }</p>
	</div>
	
	<div>
		<a href="list.do">목록으로</a>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../temp/header.jsp"></c:import>
	
	<div class="container">
		<div class="row">
			<h1>Error Page</h1>
			<h3>${message}</h3>
		</div>
	</div>

	<c:import url="../temp/header_script.jsp"></c:import>
</body>
</html>
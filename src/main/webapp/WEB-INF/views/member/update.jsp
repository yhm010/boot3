<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<c:import url="../temp/header.jsp"></c:import>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정</h1>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="name" value="${vo.name}" class="form-control" id="name" placeholder="이름을 변경하세요">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">E-mail</label>
  <input type="email" value="${vo.email}" class="form-control" id="email" placeholder="이메일을 변경하세요">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Phone</label>
  <input type="phone" value="${vo.phone}" class="form-control" id="phone" placeholder="번호를 변경하세요">
</div>

<div class="mb-3">
  <label for="formFile" class="form-label">File</label>
  <input class="form-control" value="${vo.file}"type="file" id="formFile">
</div>

<a href="/"><button type="submit" class="btn btn-secondary">완료</button></a>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
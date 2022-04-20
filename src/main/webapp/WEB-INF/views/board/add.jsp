<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<c:import url="../temp/header.jsp"></c:import>

<div class="container mt-4">
<div class="row mt-4 ">
<div class="alert alert-dark" role="alert">
  <h4 class="text-center" style="text-transform: uppercase;">${board} List</h4>
</div>
</div>
</div>
	<form action="./add" method="post" enctype="multipart/form-data">
	<div class="row mb-3">
  <label for="title" class="col-sm-2 col-form-label">제목</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="제목을 입력하세요." name="title">
</div>
<div class="row mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">내용</label>
  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="contents"></textarea>
</div>
<label for="title" class="col-sm-2 col-form-label">작성자</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="writer">
</div>

	<div class="row mb-3">
  <label for="files" class="col-sm-2 col-form-label">파일</label>
  <input type="file" class="form-control" id="exampleFormControlInput1" name="files">
	</div>
	
		<div class="row mb-3">
  <label for="files" class="col-sm-2 col-form-label">파일</label>
  <input type="file" class="form-control" id="exampleFormControlInput1" name="files">
	</div>
	

 <button type="submit">등록</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
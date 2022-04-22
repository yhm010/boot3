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

<div>
	<form action="./list" method="get">
	<fieldset>
		<select name="kind">
			<option value="col1">제목</option>
			<option value="col2">본문</option>
			<option value="col3">작성자</option>
		</select>
		<input type="text" name="search" value="${pager.search}">
		<button type="submit">검색</button>
	</fieldset>
	</form>
</div>

	<div class="container mt-4">
		<div class="row mt-4 ">
			<div class="alert alert-dark" role="alert">
				<h4 class="text-center" style="text-transform: uppercase;">${board}
					List</h4>
			</div>
		</div>
	<c:forEach items="${list}" var="vo">
	<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">캐릭터 정보</h5>
 <img src="../resources/upload/product/${vo.productFilesVOs[0].fileName}" class="card-img-top" alt="...">
    <p class="card-text">${vo.productName}</p>
    <p class="card-text">${vo.productPrice}</p>
    <p class="card-text">${vo.productCount}</p>
    <p class="card-text">${vo.productDetail}</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
	</c:forEach>

		<div class="row justify-content-end">
			<a href="./add" type="button" class="col-1 btn btn-outline-primary">WRITE</a>
		</div>
	</div>
	
	<div class="row">
		<nav aria-label="Page navigation example">
		  <ul class="pagination align-self-center">
		    <li class="page-item">
		      <a class="page-link" href="./list?pn=${pager.pre?pager.startNum-1:1}&kind=${pager.kind}&search=${pager.search}" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    
		    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		    <li class="page-item"><a class="page-link" href="./list?pn=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
		    </c:forEach>
		    
		    <li class="page-item">
		      <a class="page-link" href="./list?pn=${pager.next?pager.lastNum+1:pager.lastNum}&kind=${pager.kind}&search=${pager.search}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		</nav>
	
	</div>
	
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
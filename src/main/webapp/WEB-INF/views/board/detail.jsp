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

<div class="alert alert-warning" role="alert">
번호: ${vo.num}
</div>
<div class="alert alert-warning" role="alert">
제목: ${vo.title}
</div>
<div class="alert alert-warning" role="alert">
내용: ${vo.contents}
</div>
<div class="alert alert-warning" role="alert">
글쓴이: ${vo.writer}
</div>
<div class="alert alert-warning" role="alert">
날짜: ${vo.regDate}
</div>
<div class="alert alert-warning" role="alert">
조회수: ${vo.hit}
</div>


<h4>첨부파일</h4>
<c:forEach items="${vo.filesVOs}" var="f">
<a href="./fileDown?fileNum=${f.fileNum}">${f.oriName}</a>

</c:forEach>

<a href="./update?num=${vo.num}"><button type="submit" class="btn btn-warning">수정</button></a>
<a href="./delete?num=${vo.num}"><button type="submit" class="btn btn-warning">삭제</button></a>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
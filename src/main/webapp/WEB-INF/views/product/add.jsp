<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<c:import url="../temp/header_css.jsp"></c:import>
<c:import url="../temp/header_script.jsp"></c:import>
<c:import url="../temp/header.jsp"></c:import>

<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>

</head>
<body>

<div class="container mt-4">
<div class="row mt-4 ">
<div class="alert alert-dark" role="alert">
  <h4 class="text-center" style="text-transform: uppercase;">${board} List</h4>
</div>
</div>
</div>
	<form action="./add" method="post" enctype="multipart/form-data">
	<div class="row mb-3">
  <label for="name" class="col-sm-2 col-form-label">이름</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="productName">
</div>
<label for="conunt" class="col-sm-2 col-form-label">수량</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="productCount">
</div>
<label for="price" class="col-sm-2 col-form-label">가격</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="productPrice">
</div>
<div class="row mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">상세내용</label>
  
  <textarea class="form-control" id="contents" rows="3" name="productDetail"></textarea>
</div>


<button type="button" id="fileAdd" class="btn btn-success d-block">FileAdd</button>
	
<div id="fileResult">

</div>

 <button type="submit">등록</button>
</form>

<script type="text/javascript">
$("#contents").summernote({
	height: 400
	
});

	let count=0;
	$("#fileAdd").click(function() {
		if(count>4){
			alert('최대 5개만 가능합니다');
			return;
		}
		let result = '<div class="input-group">';
		result = result + '<input name="files" type="file" class="form-control" id="inputGroupFile04" aria-describedby="inputGroupFileAddon04" aria-label="Upload">'
		result = result + '<button class="btn btn-outline-secondary del" type="button" id="inputGroupFileAddon04">X</button>'
		result = result + '</div>';
		$("#fileResult").append(result);
		count++;
	});
	
	$("#fileResult").on("click", ".del", function() {
		$(this).parent().remove();
		count--;
	} );
</script>


</body>
</html>
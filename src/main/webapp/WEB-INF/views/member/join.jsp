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
	<h1>회원가입</h1>

	<form action="./join" method="post">
		<div class=" container mb-3">
			<label for="exampleFormControlInput1" class="form-label">ID</label> <input
				type="id" class="form-control" name="id" id="id"
				placeholder="ID를 입력하세요">
		</div>

		<div class="container mb-3">
			<label for="exampleFormControlInput1" class="form-label">Password</label>
			<input type="password" class="form-control" name="pw" id="pw"
				placeholder="비밀번호를 입력하세요">
		</div>

		<div class="container mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="name" class="form-control" name="name" id="name"
				placeholder="이름을 입력하세요">
		</div>

		<div class="container mb-3">
			<label for="exampleFormControlInput1" class="form-label">E-mail</label>
			<input type="email" class="form-control" name="email" id="email"
				placeholder="이메일을 입력하세요">
		</div>

		<div class="container mb-3">
			<label for="exampleFormControlInput1" class="form-label">Phone</label>
			<input type="phone" class="form-control" name="phone" id="phone"
				placeholder="번호를 입력하세요">
		</div>

		<div class="container mb-3">
			<label for="formFile" class="form-label">File</label> <input
				class="form-control" type="file" id="formFile">
		</div>

		<div class="container mb-3">
			<a href="/"><button type="submit" class="btn btn-secondary">완료</button></a>

			<div class="row">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="all"> <label class="form-check-label"
						for="all"> checkbox-ALL </label>
				</div>
				<div class="form-check">
					<input class="form-check-input ch" type="checkbox" value=""
						id="check1"> <label class="form-check-label"
						for="check1"> checkbox2 </label>
				</div>
				<div class="form-check">
					<input class="form-check-input ch" type="checkbox" value=""
						id="check2"> <label class="form-check-label"
						for="check2"> checkbox3 </label>
				</div>
				<div class="form-check">
					<input class="form-check-input ch" type="checkbox" value=""
						id="check3"> <label class="form-check-label"
						for="check3"> checkbox4 </label>
				</div>
			</div>
		</div>
		
	</form>

<c:import url="../temp/header_script.jsp"></c:import>
<script type="text/javascript">
    $("#all").click(function(){
        $(".ch").prop("checked", $("#all").prop("checked"));
    });

    $(".ch").on("click", function(){
        let check = true;

        $(".ch").each(function(idx, item){
            if(!$(item).prop("checked")){
                check=false;
            }            
        });

        $("#all").prop("checked", check);
    });
</script>
</body>
</html>
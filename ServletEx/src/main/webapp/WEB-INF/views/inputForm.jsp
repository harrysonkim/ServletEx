<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputForm.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>

<form action="./form.do" method="post">
<div class="container">
<h1>입력 폼</h1>
<hr>

<div class="form-floating mb-3">
  <input type="text" class="form-control" name="userid" id="userid" placeholder="id를 입력하세요">
  <label for="userid">ID</label>
</div>

<div class="form-floating">
  <input type="password" class="form-control" name="userpw" id="userpw" placeholder="Password를 입력하세요">
  <label for="userpw">Password</label>
</div>

<div class="mt-5 text-end">
	<button class="btn btn-primary">로그인</button>
</div>

</div>
</form>

</body>
</html>
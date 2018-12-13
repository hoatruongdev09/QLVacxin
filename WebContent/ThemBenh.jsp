<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="content/css/bootstrap.min.css">
<script src="content/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
  <h2>Thêm bệnh</h2>
  <form action="BenhController" method="POST">
    <div class="form-group">
      <label for="email">Tên bệnh:</label>
      <input type="text" class="form-control" id="email" placeholder="Tên bệnh" name="tenbenh" required>
    </div>
    <div class="form-group">
      <label for="pwd">Mô tả:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Mô tả" name="mota">
    </div>
    <button type="submit" class="btn btn-primary" value=" " name="add">Thêm</button>
  </form>
</div>
</body>
</html>
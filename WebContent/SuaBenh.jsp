<%@page import="bean.BenhBean"%>
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
<%
	BenhBean benh = (BenhBean)request.getAttribute("benh");
%>
<body>
<div class="container">
<form action="BenhController" method="POST">
  <div class="form-group">
	  <h2>Sửa bệnh</h2>
	    <label for="email">Tên bệnh:</label>
	    <input type="text" class="form-control" id="email" name="tenbenh" value="<%=benh.getTenBenh()%>" required>
	  </div>
	  <div class="form-group">
	    <label for="pwd">Mô tả:</label>
	    <input type="text" class="form-control" id="pwd" name="mota" value="<%=benh.getMoTa()%>">
	  </div>
	  <div class="checkbox">
	    <label><input type="hidden" name="mabenh" value="<%=benh.getMaBenh() %>"></label>
	  </div>
	  <button type="submit" class="btn btn-default" name="submit-change" value=" ">Thay đổi</button>
	</form>
	</div>

</body>
</html>
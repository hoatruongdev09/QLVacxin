<%@page import="bean.BenhBean"%>
<%@page import="java.util.ArrayList"%>
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
	ArrayList<BenhBean> dsBenh = (ArrayList<BenhBean>)request.getAttribute("dsBenh");
	int dsBenhSize = dsBenh.size();
%>
<body>
	<div class="container">
  <h2>Danh sách bệnh</h2>            
  <table class="table">
    <thead>
      <tr>
        <th>Mã bệnh</th>
        <th>Tên bệnh</th>
        <th>Mô tả</th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    <%
    	for(int i = 0; i < dsBenhSize; i++){%>
    	<tr>
        <td><%=dsBenh.get(i).getMaBenh() %></td>
        <td><%=dsBenh.get(i).getTenBenh() %></td>
        <td><%=dsBenh.get(i).getMoTa() %></td>
        <form action="BenhController" method="POST">
        	<input type="hidden" name="mabenh" value=<%=dsBenh.get(i).getMaBenh() %>>
        	<td><button type="submit" name="edit" value=" " class="btn btn-primary">Sửa</button></td>
        	<td><button type="submit" name="delete" value=" " class="btn btn-primary">Xóa</button></td>
        </form>
      </tr>
    	
    <%}%>
    </tbody>
  </table>
</div>
	
</body>
</html>
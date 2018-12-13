<%@page import="bean.KH_LS_VC"%>
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
	ArrayList<KH_LS_VC> listLS =  (ArrayList<KH_LS_VC>)request.getAttribute("listLS");
	int listLSSize = listLS.size();
%>
<body>
	<div class="container">
  <h2>Lịch sử tiêm phòng</h2>         
  <table class="table">
    <thead>
      <tr>
        <th>Tên khách hàng</th>
        <th>Mã vacxin</th>
        <th>Tên vacxin</th>
        <th>Số thứ tự mũi</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    <%for(int i = 0; i < listLSSize; i++){%>
     <tr>
        <td><%=listLS.get(i).getKhacHang().getHoTenKH() %></td>
        <td><%=listLS.get(i).getVacxin().getMaVacxin() %></td>
        <td><%=listLS.get(i).getVacxin().getTenVacxin() %></td>
        <td><%=listLS.get(i).getLichSu().getSttMui() %></td>
        <%if(listLS.get(i).getLichSu().getNgayHenTiepTheo() != null) {%>
       		<form action="LichSuTiemPhongController" method="POST"> 
       			<input type="hidden" name="makhachhang" value="<%=listLS.get(i).getKhacHang().getMaKH()%>">
       			<input type="hidden" name="mavacxin" value="<%=listLS.get(i).getVacxin().getMaVacxin()%>">
       			<input type="hidden" name="sttmui" value="<%=listLS.get(i).getLichSu().getSttMui()%>">
       			<td><button type="submit" name="delete" value=" " class="btn btn-primary">Xóa</button></td>
       		</form>
        <%}else{ %>
        <td><button type="submit" name="delete" value=" " class="btn btn-primary">Không thể xóa</button></td>
        <%} %>
      </tr>
    <%} %>
    </tbody>
  </table>
</div>
</body>
</html>
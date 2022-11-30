<%@ page import="model.XepHangTayDua" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 10/11/2022
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" href="<c:url value='assets/bootstrap/css/bootstrap.min.css' />">
    <script src="<c:url value='assets/bootstrap/js/bootstrap.min.js' /> "></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="<c:url value='assets/jquery/jquery.min.js'/>"></script>
    <title>Xếp Hạng Tay Dua</title>
</head>
<body>
<div class="container p-5">
    <h1 class="mb-5 text-center">Xếp Hạng Tay Đua</h1>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>STT</th>
                <th>Tên tay đua</th>
                <th>Quốc tịch</th>
                <th>Tên đội đua</th>
                <th>Tổng điểm</th>
                <th>Tổng thời gian</th>
                <th>Xem chi tiết</th>
            </tr>
        </thead>
        <tbody>
        <%
            ArrayList<XepHangTayDua> dsXepHangTayDua = (ArrayList<XepHangTayDua>)request.getAttribute("dsXepHangTayDua");
            int index=0;
            for(XepHangTayDua xepHangTayDua : dsXepHangTayDua){ %>
                <tr>
                    <th><%=++index%></th>
                    <th><%=xepHangTayDua.getDsKetQua().get(0).getDoiDuaTayDua().getTayDua().getTen()%></th>
                    <th><%=xepHangTayDua.getDsKetQua().get(0).getDoiDuaTayDua().getTayDua().getQuocTich()%></th>
                    <th><%=xepHangTayDua.getDsKetQua().get(0).getDoiDuaTayDua().getDoiDua().getTen()%></th>
                    <th><%=xepHangTayDua.getTongDiem()%></th>
                    <th><%=xepHangTayDua.getTongThoiGian()%></th>
                    <th><a href="<c:url value="/chi-tiet-tay-dua"/>">Xem chi tiết</a></th>
                </tr>
        <%}%>
        </tbody>
    </table>
</div>
</body>
</html>

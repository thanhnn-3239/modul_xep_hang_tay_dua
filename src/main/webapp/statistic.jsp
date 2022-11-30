<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 08/11/2022
  Time: 08:22
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
    <title>Thống kê</title>
</head>
<body>
    <h1 class="text-center text-uppercase font-weight-bold">Trang chủ</h1>
    <div class="jumbotron">
        <a href="<c:url value="/xep-hang-tay-dua"/>" class="btn btn-primary uppercase">
            Xếp hạng tay đua
        </a>
    </div>
</body>
</html>

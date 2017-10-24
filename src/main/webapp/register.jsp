<%--
  Created by IntelliJ IDEA.
  User: becca
  Date: 10/24/17
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <%@include file ="/WEB-INF/partials/head.jsp"%>
</head>
<body>
<%@include file="/WEB-INF/partials/navbar.jsp"%>
<div class="container">
    <form action="/register" method="post">
        <div class="form-group">
            <label for "username">username</label>
        </div>
    </form>
</div>
</body>
</html>

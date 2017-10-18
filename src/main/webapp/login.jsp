<%--
  Created by IntelliJ IDEA.
  User: becca
  Date: 10/17/17
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Log In" %></title>
    <%@include file="partials/style.jsp"%>
    <%--<link rel="stylesheet/bootstrap" href= "bootstrap.min.css">--%>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<div class="logIn-form text-center">
<h2>Hey you, Nice to see you again, Log in please..</h2>
<form class="center-block">
    <%@include file="partials/form.jsp"%>
   </form>
</div>
<%@include file="partials/scripts.jsp"%>
</body>
</html>

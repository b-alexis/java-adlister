<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
    <%@include file="partials/styles.jsp"%>
</head>
<body>
    <%@include file="partials/navbar.jsp"%>
    <%--${SessionScope.get("firstAd")}--%>

    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

</body>
</html>

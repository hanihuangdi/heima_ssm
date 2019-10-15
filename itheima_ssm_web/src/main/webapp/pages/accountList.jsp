<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>测试成功</h2>

<c:forEach items="${accountList}" var="ac">
    <li>${ac.id}</li>
    <li>${ac.productNum}</li>
    <li>${ac.productName}</li>
</c:forEach>

</body>
</html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
<head>
    <title>회원가입</title>
</head>
<body>
<form action="/users" method="post">

        <input type="text" name="name">
    <spring:hasBindErrors name="user">
        <c:if test="${errors.hasFieldErrors('name')}">
            ${errors.getFieldError("name")}
        </c:if>
        <c:if test="${errors.hasFieldErrors('age')}">
            ${errors.getFieldError("age")}
        </c:if>
    </spring:hasBindErrors>
        <input type="number" name="age">

    <button>제출</button>
</form>
</body>
</html>
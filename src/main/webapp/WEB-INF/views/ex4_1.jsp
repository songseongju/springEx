<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>
    <h1>${dto}</h1>
    <br/>
    <h1> ${message} </h1>
    <br/>
    <h1><c:out value="${message}"> </c:out> </h1>

</h1>
<br/>


</body>
</html>
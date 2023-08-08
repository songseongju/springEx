<%--
  Created by IntelliJ IDEA.
  User: sj881
  Date: 2023-08-04
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    int n1= Integer.parseInt(request.getParameter("num1"));
    int n2= Integer.parseInt(request.getParameter("num2"));

   int result = n1+n2;

    out.print(n1+" + "+n2 + " = "+result);

%>
<html>
<head>
    <title>계산기</title>
</head>
<body>

<h1>${param.num1} + ${param.num2} = ${param.num1 + param.num2}</h1>

</body>
</html>

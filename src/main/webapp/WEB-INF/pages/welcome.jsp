<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: gihnm
  Date: 19.09.2020
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WELCOME</title>
</head>
<body>
    <spring:form method="get" action="/generateinput">
        <input type="submit" name="button" value="Сгенерировать вх. данные">
<%--        <spring:button>Generate input data</spring:button>--%>
    </spring:form>

<%--   <form name = "First" action="generateinput" method="post">--%>
<%--        <input type="submit" name="button" value="Сгенерировать вх. данные">--%>
<%--    </form>--%>
</body>
</html>

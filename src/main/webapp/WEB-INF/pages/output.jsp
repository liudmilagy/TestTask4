<%--
  Created by IntelliJ IDEA.
  User: gihnm
  Date: 16.09.2020
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Тестовое задание</title>
</head>
    <body>
        <h5>Выходные данные</h5>
<%--        <form name = "Output" action="/output" method="get">--%>
            <textarea name="output" rows="20"> ${outputData} </textarea>

            </br>
<%--        </form>--%>

    </body>
</html>

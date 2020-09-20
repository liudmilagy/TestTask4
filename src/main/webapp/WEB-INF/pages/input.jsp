<%--
  Created by IntelliJ IDEA.
  User: gihnm
  Date: 16.09.2020
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<html>
<head>
    <title>Тестовое задание</title>
</head>
    <body>
        <h5>Входные данные</h5>
<%--        <form name = "Input" action="sort" method="get">--%>
<%--            <textarea name="input" rows="20"> ${inputData} </textarea>--%>
<%--            </br>--%>
<%--&lt;%&ndash;            <input type="text" name="inputData" value="${inputData}">&ndash;%&gt;--%>
<%--            <input type="submit" name="button" value="Отсортировать">--%>
<%--        </form>--%>
<%--        <spring:form method="get|post" action="/input/sort">--%>
<%--            <textarea name="input" rows="20"> ${inputData} </textarea>--%>
<%--            </br>--%>
<%--            <input type="submit" name="button" value="Отсортировать">--%>
<%--        </spring:form>--%>

        <spring:form method="post" action="/sort" model="inputFromServer">
            <textarea name="input" rows="20"> ${inputData} </textarea>
<%--            </br>--%>

            <input type="submit" value="Отсортировать">
        </spring:form>

    </body>
</html>

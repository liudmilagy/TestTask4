<%--
  Created by IntelliJ IDEA.
  User: gihnm
  Date: 16.09.2020
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<html>
<head>
    <title>Тестовое задание</title>
</head>
    <body>
        <h5>Входные данные</h5>
<%--        <form name = "Input" action="sort" method="post">--%>
<%--            <textarea name="input" rows="20"> ${inputData} </textarea>--%>
<%--            </br>--%>
<%--&lt;%&ndash;            <input type="submit" name="button" value="Отсортировать">&ndash;%&gt;--%>
<%--        </form>--%>
        <form name = "Input" action="sort" method="get">
            <textarea name="input" rows="20"> ${inputData} </textarea>
            </br>
            <input type="text" name="inputData" value="${inputData}">
            <input type="submit" name="button" value="Отсортировать">
        </form>



    </body>
</html>

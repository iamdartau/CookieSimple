<%--
  Created by IntelliJ IDEA.
  User: Alexey.Dartau
  Date: 15.01.2020
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/home" method="post">
    <button type="submit">see cookie</button>
  </form>


  <%

    Cookie [] cookies = (Cookie[]) request.getAttribute("cookies");

    for (Cookie cookie: cookies
         ) {
  %><h1><%=cookie.getName()%></h1><%

    }
%>
  <a href="/delete">delete</a>
  </body>
</html>

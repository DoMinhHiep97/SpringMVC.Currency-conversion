<%--
  Created by IntelliJ IDEA.
  User: 19tha
  Date: 10/17/2019
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <form method="post" action="/conversion">
<h3>RATE:</h3>
  <input type="text" name="rate" value="22000">
  <br>
<h3>USD:</h3>
  <input type="text" name="USD" id="USD" value="1">
  <input type="submit" value="Conversion">
    VND:<span>${vnd}</span>
  </form>
  </body>
</html>

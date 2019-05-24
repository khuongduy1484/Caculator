<%--
  Created by IntelliJ IDEA.
  User: duy
  Date: 24/05/2019
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <form action="/home" method="post">

      <tr>
        <td>
          <input type="text" name="number1">
          <input type="text" name="number2">
        </td>
      </tr>
    <br>
    <br>
      <tr>
        <td>
          <input type="submit" name="caculator" value="Addtion(+)">
        </td>
        <td>
          <input type="submit" name="caculator" value="Subtraction(-)">
        </td>
        <td>
          <input type="submit" name="caculator" value="Multiplication(x)">
        </td>
        <td>
          <input type="submit" name="caculator" value="Division(/)">
        </td>
      </tr>
      <tr>
        <td>
         <h1>Result : ${result}</h1>
        </td>
      </tr>

  </form>
  </body>
</html>

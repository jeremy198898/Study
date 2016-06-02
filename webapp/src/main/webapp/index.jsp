<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 2016/5/11
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>HI</title>
  </head>
  <body>
  <div>Hello!This is just test!</div><br />
  <div>
    <form method="post" action="/webapp/hello">
      <input type="text" name="typein" /><br />
    <select name="color">
      <option value="0">--Please Choose--</option>
      <option value="red">RED</option>
      <option value="green">GREEN</option>
      <option value="blue">BLUE</option>
    </select>
      <br />
      <input type="submit" value="submit"/>
    </form>
  </div>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 986520
  Date: 9/18/2018
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <h1>Login Form</h1>
  <form action="login" method="post">
    <label>Username</label>
    <input name="name" value=${user}> <br>
    <label>Password</label>
    <input name="pass" type="password"> <br>
    <label for="remember">Remember Me</label>
    <input id="remember" name="remember" type="checkbox"> <br>
    <input type="submit" value="Login">
  </form>
  </body>
</html>

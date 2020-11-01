<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/2/2020
  Time: 1:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Customer</title>
</head>
<body>
<form name="addForm" method="post" action="/add">
    First Name<br>
    <input type="text" name="firstName" placeholder="..." style="width: 150px"><br>
    Last Name<br>
    <input type="text" name="lastName" placeholder="..." style="width: 150px"><br>
    Phone Number<br>
    <input type="text" name="phoneNumber" placeholder="..." style="width: 150px"><br>
    Address<br>
    <input type="text" name="address" placeholder="..." style="width: 150px"><br>
    <input type="submit" value="Save">
</form>
</body>
</html>

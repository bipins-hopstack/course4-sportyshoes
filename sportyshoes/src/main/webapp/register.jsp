<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Register User</h1>
<div class="form-group">
<form action="register" method="post">
<table class="table-primary">
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
<tr><td>Gender:</td><td><input type="text" name="gender"/></td></tr>
<tr><td>Age:</td><td><input type="text" name="age"/></td></tr>
<tr><td>Address:</td><td><input type="text" name="address"/></td></tr>
<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
<tr><td>Mobile Number:</td><td><input type="number" name="mobileno"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
<tr><td><input type="submit" value="Submit" id="button-1"/></td></tr>
</table>
</form>
</div>
</body>
</html>
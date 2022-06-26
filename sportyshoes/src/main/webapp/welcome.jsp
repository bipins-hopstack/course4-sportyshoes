<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Welcome to Sporty shoes</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Welcome to Sporty shoes</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/register.jsp">Register</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/login.jsp">Login</a>
      </li>
    </ul>
    <span class="navbar-text">
      Cart \__/
    </span>
  </div>
</nav>
<%// List eList = (List)session.getAttribute("shoes");
   //request.setAttribute("eList", eList);
%>
<table class="table">
<th>Item id: </th>
<th>Item Category: </th>
<th>Item Description:</th>
<th>Item Size:</th>
<th>Item Cost:</th>
<th>Buy</th>
<c:forEach items="${shoes}" var="shoes">
    <tr>
        <td><c:out value="${shoes.itemid}"/></td>
        <td><c:out value="${shoes.category}"/></td> 
        <td><c:out value="${shoes.description}"/></td> 
        <td><c:out value="${shoes.size}"/></td> 
        <td><c:out value="${shoes.cost}"/></td>  
        <td><form action="/buy"><button type="submit" value="${shoes.itemid}" name="buy">BUY</button></form></td>
    </tr>  
</c:forEach>
</table>
</body>
</html>
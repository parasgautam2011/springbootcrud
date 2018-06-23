<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Restaurant</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Restaurant</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">AllCustomers</a></li>
      <li><a href="#">New Customer</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
<table class="table table-striped">
    <thead>
      <tr>
        <th>Id</th>
        <th>FirstName</th>
        <th>LastName</th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="tempCustomers" items="${customers}">
    	<tr>
    		<td><c:out value="${tempCustomers.id}"></c:out> </td>
    		<td> <c:out value="${tempCustomers.firstName}"></c:out>  </td>
    		<td> <c:out value="${tempCustomers.lastName}"></c:out> </td>
    	</tr>
    	</c:forEach>
    </tbody>
  </table>

  <h3>Welcome to the Restaurant</h3>
  <p>Tastes of all over the world!</p>
</div>

</body>
</html>

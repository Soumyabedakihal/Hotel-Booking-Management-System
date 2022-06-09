<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer register </h1>
<form action="customer" method="post">
  	Id : &nbsp<input type ="text" name ="custId"> <br> <br>
    Name : &nbsp<input type ="text" name ="custName"> <br> <br>
    Email : &nbsp<input type ="email" name ="custEmail"> <br> <br>
    Gender : &nbsp male<input type="radio" value="male" name="custGender">&nbsp female &nbsp<input type="radio" value="female" name="gender"><br><br>
    Phone : &nbsp<input type ="number" name ="custPhone"> <br> <br>
    
    
    <input type="submit" value="Create Customer"> <br> <br>
</body>
</html>
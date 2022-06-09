<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee register </h1>
<form action="employee" method="post">
  	Id : <input type ="text" name ="empId"> <br> <br>
    Name : <input type ="text" name ="empName"> <br> <br>
    Phone : <input type ="number" name ="empPhone"> <br> <br>
    Email : <input type ="email" name ="empEmail"> <br> <br>
    Password : <input type ="password" name ="empPassword"> <br> <br>
    Designation : <input type ="text" name ="empDesignation"> <br> <br>
    
    
    <input type="submit" value="Create Employee"> <br> <br>
</body>
</html>
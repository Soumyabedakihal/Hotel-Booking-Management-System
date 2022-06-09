<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Room Deatails</h1>
<form action="rooms" method="post">
  Room No : <input type ="text" name="room_no" ></input> <br> <br>
  Room type : <input type ="text" name="roomtype" ></input> <br> <br>
  Check In : <input type ="text" name="checkin" ></input> <br> <br> 
  Check Out : <input type ="text" name="checkout" ></input> <br> <br> 
  Cost : <input type ="number" name="cost" ></input> <br> <br>
  <input type="submit" value="Add Room">

</body>
</html>
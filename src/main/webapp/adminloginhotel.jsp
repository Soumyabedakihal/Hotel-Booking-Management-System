<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin add the Hotel</h1> 
<form action="hotel" method="post">
     Id : <input type ="text" name ="hotelId"> <br> <br>
     Name : <input type ="text" name ="hotelName"> <br> <br>
     Phone : <input type ="number" name ="hotelPhone"> <br> <br>
     Address : <input type ="text" name ="hotelAddress"> <br> <br>
     WebSite : <input type ="url" name ="hotelWebsite"> <br> <br>
     
	<input type="submit" value="CREATE HOTEL"> <br> <br>
</form>
</body>
</html>
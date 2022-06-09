<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Book to be returned</h1>
<form action="returnRoom" method ="post">

Room No: <input type="text" name ="roomNo"> </input> <br> <br>
Hotel Id: <input type="text" name ="hotelId"> </input> <br> <br>
<input type="submit" value ="vacate Room">

</form>
</body>
</html>
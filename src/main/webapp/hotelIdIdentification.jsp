<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter student ID</h1>
<form action="roombook" method="post">
 Hotel Id <input type="number" name ="hotelId" value=""> </input> <br> <br>
 Room No <input type="number " name="roomNo" value="<%=request.getParameter("id")%>">
 <input type="submit" value ="Submit"> </input> <br> <br>

</form>


</body>
</html>
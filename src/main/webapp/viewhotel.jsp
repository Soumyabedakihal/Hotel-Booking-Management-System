<%@page import="com.ty.hotelmanagement.service.HotelService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ty.hotelmanagement.dto.Hotel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="viewhotel" method="post">

	<%
	 HotelService hotelService=new HotelService();
	 List<Hotel> hotels= hotelService.getAllHotels();
	%>
	<table border="3px" cellpadding=20px>
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Phone</th>
	<th>Address</th>
	<th>WebSite</th>
	<th>Book Hotel</th>
	<th>Cancel Hotel</th>
	</tr>
	
	<% for(Hotel hotel: hotels) {
	%>
	
	<tr>
	<td><%=hotel.getId()%></td>
	<td><%=hotel.getName()%></td>
	<td><%=hotel.getPhone()%></td>
	<td><%=hotel.getAddress()%></td>
	<td><%=hotel.getWebsite()%></td>
	<td><a href="edit?id=<%=hotel.getId()%>">Book</a></td>
	<td><a href="delete?id=<%=hotel.getId()%>">Cancel</a></td>
	</tr>
	<%} %>
	</table>
	</form>
</body>
</html>
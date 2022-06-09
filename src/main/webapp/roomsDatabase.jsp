<%@page import="com.ty.hotelmanagement.dto.Room"%>
<%@page import="com.ty.hotelmanagement.service.RoomService"%>

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
<h1>Room Database Details</h1>
<form action="roomdatabase">

<% RoomService roomService=new RoomService();
 List<Room> rooms= roomService.getAllRoom();
%>

<table border="2px" cellpadding=22px>
<tr>
<th>Room No</th>
<th>Room Type</th>
<th>Room Checked In</th>
<th>Room Checked Out</th>
<th>Cost</th>
<th>Hotel id</th>

</tr>
<% for(Room r: rooms) {
%>
<tr>
<td><%= r.getRoom_no() %></td>
<td><%= r.getType()  %></td>
<td><%= r.getCheckin() %></td>
<td><%= r.getCheckout() %></td>
<td><%= r.getCost() %></td>
<td><%= r.getHotel() %></td>
</tr>

<%} %>
</table>

</form>

</body>
</html>
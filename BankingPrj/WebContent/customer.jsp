<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jain.banking.dto.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>

	Customer Details
	<hr width="100%" noshade="true">

	<table border=2>
		<tr>
			<th bgcolor="red">User Id</th>
			<th bgcolor="red">First Name</th>
			<th bgcolor="red">Last Name</th>
			<th bgcolor="red">Username</th>
			<th bgcolor="red">Password</th>
			<th bgcolor="red">Email Address</th>
			<th bgcolor="green">Bank Name</th>
			<th bgcolor="green">Bank Address</th>
			<th bgcolor="green">Bank Phone</th>
			<th bgcolor="blue">Account Type</th>
		</tr>

		<%
			System.out.println("on bank.jsp");
			List<CustomerDetailsDTO> list = (List<CustomerDetailsDTO>) request.getAttribute("customerDetailsList");
			Iterator<CustomerDetailsDTO> ite = list.iterator();
			while (ite.hasNext()) {
				CustomerDetailsDTO customer = ite.next();
		%>
		<tr>
			<td align="center" bgcolor="red"><%=customer.getCustomerId()%></td>
			<td align="center" bgcolor="red"><%=customer.getFirstName()%></td>
			<td align="center" bgcolor="red"><%=customer.getLastName()%></td>
			<td align="center" bgcolor="red"><%=customer.getUserName()%></td>
			<td align="center" bgcolor="red"><%=customer.getPassword()%></td>
			<td align="center" bgcolor="red"><%=customer.getEmail()%></td>
			<td align="center" bgcolor="green"><%=customer.getBankName()%></td>
			<td align="center" bgcolor="green"><%=customer.getBankAddress()%></td>
			<td align="center" bgcolor="green"><%=customer.getBankPhone()%></td>
			<td align="center" bgcolor="blue"><%=customer.getAccountType()%></td>
		</tr>

		<%
			}
		%>

	</table>

<br>
<a href="<%=request.getContextPath()%>/bank">Bank Information</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/account">Account Information</a>


</body>
</html>
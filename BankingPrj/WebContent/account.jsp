<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jain.banking.dto.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Information</title>
</head>
<body>

	Account Information
	<hr width="100%" noshade="true">

	<table border=2>
		<tr>
			<th>Account Id</th>
			<th>Account Type</th>
		</tr>

		<%
			System.out.println("on account.jsp");
			List<AccountInformationDTO> list = (List<AccountInformationDTO>) request.getAttribute("accountList");
			Iterator<AccountInformationDTO> ite = list.iterator();
			while (ite.hasNext()) {
				AccountInformationDTO accountInformation = ite.next();
		%>
		<tr>
			<td align="center"><%=accountInformation.getId()%></td>
			<td align="center"><%=accountInformation.getName()%></td>
		</tr>

		<%
			}
		%>

	</table>
	
<br>
<a href="<%=request.getContextPath()%>/bank">Bank Information</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/customer">Customer Detail</a>



</body>
</html>
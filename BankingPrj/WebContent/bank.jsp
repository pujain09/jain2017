<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jain.banking.dto.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Information</title>
</head>
<body>

	Bank Information
	<hr width="100%" noshade="true">

	<table border=2>
		<tr>
			<th>Bank Id</th>
			<th>Bank Name</th>
			<th>Bank Address</th>
			<th>Bank Phone</th>
		</tr>

		<%
			System.out.println("on bank.jsp");
			List<BankInformationDTO> list = (List<BankInformationDTO>) request.getAttribute("bankList");
			Iterator<BankInformationDTO> ite = list.iterator();
			while (ite.hasNext()) {
				BankInformationDTO bankInformation = ite.next();
		%>
		<tr>
			<td align="center"><%=bankInformation.getBankId()%></td>
			<td align="center"><%=bankInformation.getBankName()%></td>
			<td align="center"><%=bankInformation.getBankAddress()%></td>
			<td align="center"><%=bankInformation.getBankPhone()%></td>
		</tr>

		<%
			}
		%>

	</table>

<br>
<a href="<%=request.getContextPath()%>/account">Account Information</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/customer">Customer Detail</a>


</body>
</html>

<%@page import="com.loginmodel.Loginmodel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%!List<Loginmodel> list; %>
<%
list=(List<Loginmodel>)request.getAttribute("list1");
  
%>
<table border="2">
<tr>
<td>
id
</td>
<td>
username
</td>
<td>
password
</td>
<td>
Address
</td>
<td>
email
</td>
<td>
gender
</td>
<td>
language
</td>
<td>
city
</td>
</tr>

<%for(Loginmodel m:list)
{
	%>

<tr>

<td><%=m.getId()%></td>
 <td><%=m.getUsername() %></td>
 <td><%=m.getPassword()%></td>
 <td><%=m.getAddress() %></td>
  <td><%=m.getEmail() %></td>
 <td><%=m.getGender() %></td>
 <td><%=m.getLang() %></td>
 <td><%=m.getCity() %></td>


<td><a href="Loginservlet?action=edit&userid=<%=m.getId()%>"> Edit</a> </td>
<td><a href="Loginservlet?action=delete&userid=<%=m.getId()%>"> Delete</a> </td>




<%
}
%>

</tr>
</table>
</body>
</html>
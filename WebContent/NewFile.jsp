<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${user}
<form action="Loginservlet" method="post">
<table align="center" border="2" >
<tr>
<td>
username
</td>
<td>
<input type="text" name="username">
</td>
</tr>
<tr>
<td>
password
</td>
<td>
<input type="password" name="password">
</td>
</tr>
<tr>
<td>
Address
</td>
<td>
<textarea rows="10" cols="10" name="address"></textarea>
</td>
</tr>
<tr>
<td>
email
</td>
<td>
<input type="text" name="email">
</td>
</tr>
<tr>
<td>
gender
</td>
<td>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
</td>
</tr>
<tr>
<td>
language
</td>
<td>
<input type="checkbox" name="language" value="English">English
<input type="checkbox" name="language" value="Hindi">Hindi
<input type="checkbox" name="language" value="Gujarati">Gujarati
</td>
</tr>
<tr>
<td>
city
</td>
<td>
<select name="city">
<option value="Ahmedabad"> Ahmedabad </option>
<option value="Baroda"> Baroda </option>
<option value="Anand"> Anand </option>
</select>
</td>
</tr>
<tr>
<td>
</td>
<td>
<input type="submit" value="submit">
</td>
</tr>
</table>
<a href="Showdata">showdata</a>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Loginservlet" method="get">
<table align="center" border="2" >
<tr>
<td>
username
</td>
<td>
<input type="text" name="username" value="${data.username }">
</td>
</tr>
<tr>
<td>
password
</td>
<td>
<input type="password" name="password" value="${data.password }">
</td>
</tr>
<tr>
<td>
Address
</td>
<td>
<textarea rows="10" cols="10" name="address" placeholder="${data.address }"></textarea>
</td>
</tr>
<tr>
<td>
email
</td>
<td>
<input type="text" name="email" value="${data.email }">
</td>
</tr>
<tr>
<td>
gender
</td>
<td>
<input type="radio" name="gender" value="Male" placeholder="${data.gender }">Male
<input type="radio" name="gender" value="Female" placeholder	W="${data.gender }">Female
</td>
</tr>
<tr>
<td>
language
</td>
<td>
<input type="checkbox" name="language" value="">English
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
<input type="hidden" name="id" value="${data.id }"> 
</td>
</tr>
<tr>
<td>
</td>
<td>
<input type="submit"  name="action"     value="update">
</td>
</tr>
</table>

</form>



</body>
</html>
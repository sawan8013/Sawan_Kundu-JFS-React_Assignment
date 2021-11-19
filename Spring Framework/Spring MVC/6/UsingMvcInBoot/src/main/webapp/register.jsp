<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="customer1.*" />
	<h2>Registration Form</h2>
	<form action="result.html" method = "post">
		<table>
			<tr>
				<td>Username  </td> <td> <input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password </td> <td> <input type= "text" name = "pass" /></td>
			</tr>
			<tr>
				<td>Email </td> <td>  <input type= "text" name = "email" /></td>
			</tr>
			<tr>
				<td>Contact  </td> <td> <input type= "text" name = "contact" /></td>
			</tr>
			<tr>
				<td>City </td> <td> <select name="city" class>
									<option value="pune" label="Pune"></option>
									<option value="mumbai" label="Mumbai"></option>
									<option value="kolkata" label="Kolkata"></option>
									<option value="delhi" label="Delhi"></option>
									<option value="bangaluru" label="Bangaluru"></option>
									</select></td>
			</tr>
			<tr>
				<td>ZipCode  </td> <td> <input type= "text" name = "zipcode" /></td>
			</tr>
			<tr><td><input type="submit"  value= "Register"/></td></tr>
			
		</table>
</body>
</html>
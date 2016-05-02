<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<jsp:useBean id="user" class="de.bookexchange.pack.User"></jsp:useBean>
	<body>
		<jsp:setProperty property="*" name="user"/>
		
		<jsp:getProperty property="fName" name="user"/><br>
		<jsp:getProperty property="lName" name="user"/><br>
		<jsp:getProperty property="email" name="user"/><br>
		<jsp:getProperty property="street" name="user"/><br>
		<jsp:getProperty property="houseNum" name="user"/><br>
		<jsp:getProperty property="city" name="user"/><br>
		<jsp:getProperty property="pwd" name="user"/><br>
		<%@ page import="de.bookexchange.pack.ShopController" %>
		<%@ page import="de.bookexchange.pack.BusinessInterface"%>
		<%	BusinessInterface t = new ShopController();
			out.println(t.signInUser(user));
		
		%>


	</body>
</html>
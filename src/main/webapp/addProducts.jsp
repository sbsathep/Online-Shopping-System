<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Form action="addProducts">
Category:<input type="text" name="category" id="category">
SubCategory:<input type="text" name="subCategory" id="subCategory">
Name:<input type="text" name="name" id="name">
Price:<input type="text" name="price" id="price">
<input type="submit">
<br>${status}c
</Form>
</body>
</html>
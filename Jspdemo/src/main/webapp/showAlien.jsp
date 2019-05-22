<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <label>Id :</label>
  <input type="text" name ="id">${user.id}<br><br>
  <label>Name :</label>
  <input type="text" name= "name">${user.name}<br><br>
  <label>User Name :</label>
  <input type="text" name= "username">${user.username}<br><br>
  <label>Password </label>
  <input type="text" name ="password">${user.password}<br><br>
  <input type="submit"><br>
  </body>
  
</html>
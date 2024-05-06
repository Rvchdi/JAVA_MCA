<%@page language="java" contentType="text/html; charset=UTF-8"
        isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Account Creation</title>
</head>
<body>
    <h2>Create Account</h2>
     <form method="post" action="<c:url value='/client/add' />">
         <label for="name">Name:</label>
         <input type="text"  name="name" required><br><br>

         <label for="cin">CIN:</label>
         <input type="text"  name="cin" required><br><br>

         <label for="address">Address:</label>
         <input type="text"  name="address" required><br><br>

         <label for="birthdate">Birthdate:</label>
         <input type="date"  name="birthdate" required><br><br>

         <label for="email">email:</label>
         <input type="email"  name="email" required><br><br>

         <label for="password">password:</label>
         <input type="password"  name="pwd" required><br><br>

         <input type="submit" value="Create Account">
     </form>


</body>
</html>

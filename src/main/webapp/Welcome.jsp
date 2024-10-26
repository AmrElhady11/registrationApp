<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession,beans.User" %>
<jsp:useBean id="user" class="beans.User" scope="session" />

<%
    User theUser = (User) session.getAttribute("newUser");
	String userName = theUser.getName();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card text-center shadow-lg p-4">
                <h2 class="text-primary">Welcome,<%=userName %>> !</h2>
                <p class="lead mt-4">
                    We’re thrilled to have you with us. Thank you for joining our community, and we look forward to being part of your journey!
                </p>
                <p class="text-muted">
                    If you have any questions or need support, we’re here to help every step of the way.
                </p>
            </div>
        </div>
    </div>
</div>

</body>
</html>

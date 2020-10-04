
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
        
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            Title: <input type="text" name="Title" value="${titles}" placeholder="This is the title"><br>
            Contents: <textarea placeholder="Contents go here" rows="6" name="Content" value="${contents}"></textarea><br>
            <input type="submit" value="Save">
        </form>
        <div>
            <c:if test="${invalid}">
            <p>Invalid Entry. Please enter both a title and last content</p>
            </c:if>
        </div>
            <div>${message}</div>
           
        
    </body>
</html>

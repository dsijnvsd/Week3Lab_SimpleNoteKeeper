
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
        
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
       
        <div>
        Title: ${note.first_line} ${title}<br>
            Contents:${note.second_line} ${content}
           </div>

            
            <br>
            <a href="note?edit">Edit</a>
        
    </body>
</html>

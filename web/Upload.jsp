<%-- 
    Document   : Upload
    Created on : Dec 11, 2018, 4:08:45 PM
    Author     : N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload file</title>
    </head>
    <body>
        <center>
        <form method="post" action="UploadServlet" enctype="multipart/form-data">
            <input type="file" name="Thêm hình" />
            <br/><br/>
            <input type="submit" value="Thêm" />
        </form>
    </center>
    </body>
</html>

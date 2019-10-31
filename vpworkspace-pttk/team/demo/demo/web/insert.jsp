<%-- 
    Document   : insert
    Created on : Aug 21, 2016, 12:57:47 PM
    Author     : Lonely
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Product</title>
    </head>
    <body>
        <form action="InsertServlet" method="POST">
            <h1>Insert New Product</h1>
            <table>
                <tr>
                    <td>Product's ID</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Product's Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Company</td>
                    <td><input type="text" name="company"></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>

                    <td colspan="2" align="right">
                        <button type="submit" name="insert">Insert</button>
                        <button type="reset" name="reset">Reset</button>
                    </td>
                </tr>
        </form>
</body>
</html>


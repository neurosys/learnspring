<%--
  Created by IntelliJ IDEA.
  User: neurosys
  Date: 2/3/20
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        Hello world of spring
        <br />
        <br />
        <!-- the "$ {param. }" syntax gets params directly from the GET -->
        Student name: ${param.studentName}
        <br />
        <br />

        <!-- This takes the parameter fromt he model -->
        Message: ${message}
    </body>
</html>

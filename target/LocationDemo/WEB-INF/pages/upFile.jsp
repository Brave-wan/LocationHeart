<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 18-1-11
  Time: 下午2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpFile</title>
</head>
<body>
<form:form method="post" enctype="multipart/form-data" action="/getImage">
    <input name="xuweijei" value="" type="text">
    <input name="xuwiejei" value="" type="text">
    <input type="file" name="image">
    <input type="submit" value="submit">
</form:form>
</body>
</html>

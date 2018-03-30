<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<form method="post" action="note/updateNote">
    <p>id:<input value="${note.id}" name="id"> </p>
    <p>title:<input value="${note.title}" name="title"> </p>
    <p>content:<input value="${note.content}" name="content"> </p>
    <p>time:<input value="${note.time}" type="date" name="time"> </p>
    <p><input type="submit" value="修改"></p>
</form>
</body>
</html>

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
<form method="post" action="note/addNote">
    <p>title:<input name="title"> </p>
    <p>content:<input name="content"> </p>
    <p>time:<input type="date" name="time"> </p>
    <p><input type="submit" value="添加"></p>
</form>
</body>
</html>

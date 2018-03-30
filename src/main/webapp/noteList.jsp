<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<h2>AllNote</h2>
<table border="1">
    <c:forEach items="${list}" var="l">
        <tr>
            <td>${l.id }</td>
            <td>${l.title }</td>
            <td>${l.content }</td>
            <td>${l.time }</td>
            <td><a href="note/findById/${l.id }">修改</a></td>
            <td><a href="note/deleteByid/${l.id }">删除</a></td>
        </tr>
    </c:forEach>
</table>
<a href="index.jsp">首页</a>  <a href="addNote.jsp">添加</a>
</body>
</html>

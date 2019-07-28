<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 18/4/12
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
以下是网站的功能：<br/>
<a href="${pageContext.request.contextPath}/product/add">商品添加</a><br/>
<a href="${pageContext.request.contextPath}/product/update">商品修改</a><br/>
<a href="${pageContext.request.contextPath}/product/list">商品查询</a><br/>
<a href="${pageContext.request.contextPath}/product/delete">商品删除</a><br/>
</body>
</html>

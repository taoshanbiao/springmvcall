<%--
  Created by IntelliJ IDEA.
  User: taoshanbiao
  Date: 2022/7/8
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>1.单个数据提交</h2>
<form action="/one.action" method="post">
    姓名:<input name="uname"><br>
    年龄:<input name="uage"><br>
    <input type="submit" value="提交">
</form><br>
<h2>2.对象的封装提交</h2>
<form action="/two.action" method="post">
    姓名:<input name="name"><br>
    年龄:<input name="age"><br>
    <input type="submit" value="提交">
</form><br>
<h2>动态占位符提交</h2>
<a href="/three/张三/22.action" >提交数据</a>
<h2>4.请求参数与名称不一致</h2>
<form action="/four.action" method="post">
    姓名:<input name="uname"><br>
    年龄:<input name="uage"><br>
    <input type="submit" value="提交">
</form><br>
</body>
</html>

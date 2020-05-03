<%--
  Created by IntelliJ IDEA.
  User: liuzeyu
  Date: 2020/5/1
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>新增书籍</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 引入 Bootstrap -->
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>更新书籍</small>
        </h1>
      </div>
    </div>
  </div>
  <form action="/books/updateBooks" method="post">
    <input type="hidden" name="bookID" value="${books.getBookID()}">
    书籍名称：<input type="text" name="bookName" value="${books.getBookName()}"><br><br><br>
    书籍数量：<input type="text" name="bookCounts" value="${books.getBookCounts()}"><br><br><br>
    书籍详情：<input type="text" name="detail" value="${books.getDetail()}"><br><br><br>
    <input type="submit" value="更新">
  </form>

</div>


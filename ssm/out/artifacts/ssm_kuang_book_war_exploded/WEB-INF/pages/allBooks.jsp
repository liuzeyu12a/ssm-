<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuzeyu
  Date: 2020/5/1
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <%--引入bootstrap的cdn--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h2>
                    <small>书籍列表 —— 显示所有书籍</small>
                </h2>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a href="/addBook.jsp" class="btn btn-primary pull-right">新增</a>
            <span>
                <form action="/books/queryBook" method="post">
                    <input type="text" name="bookName" placeholder="书籍名称">
                    <input type="submit" value="搜索">
                </form>
            </span>
            <a href="/books/allBooks" class="btn btn-primary pull-right">显示全部</a>
            <span style="color: red">${nill}</span>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12"></div>
        <table class="table table-hover table-striped" >
            <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名字</th>
                <th>书籍数量</th>
                <th>书籍详情</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>

            <c:forEach var="book" items="${list}">
                <tr>
                    <td>${book.getBookID()}</td>
                    <td>${book.getBookName()}</td>
                    <td>${book.getBookCounts()}</td>
                    <td>${book.getDetail()}</td>

                    <td>
                        <a href="/books/query/${book.bookID}" class="button">修改</a>
                        <a href="/books/deleteBook/${book.bookID}" class="button">删除</a>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>

</body>
</html>

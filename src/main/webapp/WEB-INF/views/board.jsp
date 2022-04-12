<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Contextual Classes</h2>
    <p>Contextual classes can be used to color table rows or table cells. The classes that can be used are: .active, .success, .info, .warning, and .danger.</p>
    <a href="/board/create">입력</a>
    <table class="table">
        <thead>
        <tr>
            <th>제목</th>
            <th colspan="2">내용</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="l" items="${boardList.content}">
            <tr>
                <td><a href="/board/${l.board_id}">${l.title}</a></td>
                <td>${l.content}</td>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<c:if test="${boardList.size > 0 }">
    <div class="panel-footer">
        <ul class="pagination">
            <c:forEach begin="0" end="${totalPages-1}" var="page">
                <li class="page-item">
                    <a href="board?page=${page}" class="page-link">${page+1}</a>
                </li>
            </c:forEach>
        </ul>
    </div>
</c:if>

</body>
</html>
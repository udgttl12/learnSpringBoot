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
    <h2>${board.title}</h2>
    <p>${board.content}</p>
    <a href="/board/edit/${board.board_id}">수정</a>
    <a href="/board/delete/${board.board_id}" id="btn_delete">삭제</a>
    <form action="/board/delete/${board.board_id}" id="frm" name="frm"></form>
</div>
</body>
<script>
    document.getElementById("btn_delete").onclick = function () {
        frm.submit();
    }
</script>
</html>
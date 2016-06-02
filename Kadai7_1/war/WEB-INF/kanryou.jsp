<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>文具ショップ</title>
    </head>
    <body background="hasami.jpg">
        <h1>注文完了</h1>
        <p><h2>
            ご購入ありがとうございました。またのご利用お待ちしております。<br></h2>
            <br>
            <c:out value="${Loginuser.userId}" />さん、ログイン中
            <a href ="/ad3436/Logout">ログアウト</a>
            </p>           
    </body>
</html>
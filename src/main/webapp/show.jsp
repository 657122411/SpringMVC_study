<%--
  Created by IntelliJ IDEA.
  User: taojianhao
  Date: 2019/3/25
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${name}<br>
    商品名称${requestScope.goods.name}<br>
    价格${goods.price}
</body>
</html>

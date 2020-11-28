<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/19
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h1>出库登记成功</h1>
     车牌号：
     ${pa.license_number}<br>
     入库时间：
     ${pa.putin}<br>
     出库时间：
     ${pa.putout}<br>
     停车费：
     ${pa.money}
</body>
</html>

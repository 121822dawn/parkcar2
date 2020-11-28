<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/18
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车辆出库收费</title>
</head>
<body>
    <div class="container">
        <h1 class="tabTitle">车辆出库收费</h1>
        <span class="msg">临时停车收费规则：1、停车半个小时内收费2.50元&nbsp;&nbsp;&nbsp;&nbsp;	2、超时后未满一个小时的，按一个小时计算收费。</span>
        <form action="${pageContext.request.contextPath}/Putout">
            <table cellpadding="0" cellspacing="0" border="0" class="addTable">
                <tr>
                    <td class="tdWidth">车牌号：</td>
                    <td><input type="text" name="license_number"/></td>
                </tr>
                <%--<tr>--%>
                    <%--<td class="tdWidth">车辆照片：</td>--%>
                    <%--<td><img src="images/car.jpg" ></td>--%>
                <%--</tr>--%>
                <tr>
                    <td class="tdWidth"><span>*</span>出库时间：</td>
                    <td><input type="datetime-local" step="1" class="dateStyle" name="putout" style="width:200px;"/></td>
                </tr>

                <tr>
                    <td class="tdWidth"></td>
                    <td><input type="submit" value="出库登记"/></td>
                </tr>
            </table>
        </form>
    </div>
    <script type="text/javascript">

    </script>

</body>
</html>

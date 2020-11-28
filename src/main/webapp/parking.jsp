<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/18
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>车辆入库停车登记</title>
</head>
<body>
  <div class="container">
      <h1 class="tabTitle">车辆临时停车登记</h1>
      <form action="${pageContext.request.contextPath}/PutIn">
          <table cellpadding="0" cellspacing="0" border="0" class="addTable">
              <tr>
                  <td class="tdWidth"><span>*</span>车牌号：</td>
                  <td><input type="text" class="textStyle" style="width:160px;" placeholder="请输入车牌号"  name="license_number"/>
                  </td>
              </tr>
              <tr>
                  <td class="tdWidth"><span>*</span>入库时间：</td>
                  <td><input type="datetime-local" step="1" class="dateStyle"   style="width:200px;" name="putin"/></td>
              </tr>

              <%--<tr>--%>
                  <%--<td class="tdWidth">车辆照片录入：</td>--%>
                  <%--<td>--%>
                      <%--<a href="#" class="fileStyle" title="请选择要上传的文件">--%>
                          <%--<input type="file" class="file" size=1 onchange="document.getElementById('imgUrl').value=this.value" />--%>
                      <%--</a>--%>
                      <%--<input type="text" class="textStyle" id="imgUrl" style="width:120px;"/>--%>
                      <%--<input type="button" class="uploadButton" value="上传"/>--%>

                  <%--</td>--%>
              <%--</tr>--%>
              <tr>
                  <td class="tdWidth"></td>
                  <td>
                      <input type="submit" value="登记"/>
                  </td>
              </tr>
          </table>
      </form>
  </div>
</body>
</html>

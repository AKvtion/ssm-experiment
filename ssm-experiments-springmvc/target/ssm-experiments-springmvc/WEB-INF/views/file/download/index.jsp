<%--
  Created by IntelliJ IDEA.
  User: 23504
  Date: 2023/5/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="">
<head>
  <meta charset="utf-8">
  <title>Files</title>
</head>
<body>
<table>
  <tr>
    <td>下载文件：</td>
  </tr>
  <c:forEach items="${filenames}" var="filename">
    <tr>
      <td>
        <a href="${pageContext.request.contextPath}/file/download/download?filename=${filename}">${filename}</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>


</body>
</html>

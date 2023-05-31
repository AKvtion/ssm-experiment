<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!doctype html>
<html lang="">
<head>
  <meta charset="utf-8">
  <title>Upload</title>
</head>
<body>
<h2>文件上传</h2>
<form action="${pageContext.request.contextPath}/file/upload/upload" method="post" enctype="multipart/form-data">
  <p>请选择文件：<input type="file" name="file"></p>
  <p><input type="submit" value="上传"></p>
</form>
</body>
</html>

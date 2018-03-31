<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring Boot文件上传</title>
</head>
<body>
<form method="POST" enctype="multipart/form-data" action="/file/upload">
    文件：<input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
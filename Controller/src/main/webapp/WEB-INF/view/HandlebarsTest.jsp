<%--
  Created by IntelliJ IDEA.
  User: cjs
  Date: 2018/12/18
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<%--&lt;%&ndash;%>
    <%String path = request.getContextPath();--%>
    <%--String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<%--<span style="font-size:14px;"><script src="../js/jquery-3.3.1.js"></script>--%>
    <%--<script type="text/javascript" src="../js/handlebars-v4.0.12.js"></script> </span>--%>

<script type="text/javascript" src="js/handlebars-v4.0.12.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<body>
<script id="block-expressions-template" type="text/x-handlebars-template">
    <p>你好：{{name}}</p>
</script>
<p>chen</p>
<p>${ctx}</p>
<div class="content-placeholder"></div>
<script type="text/javascript" src="js/HanderbarsTest.js"></script>

</body>
</html>

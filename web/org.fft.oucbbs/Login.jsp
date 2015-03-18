<%--
  Created by IntelliJ IDEA.
  User: lsmtty
  Date: 15-3-18
  Time: 下午7:43
  To change this template use File | Settings | File Templates.
--%>
<%@page import="org.fft.oucbbs.UserEntity" %>
<%@ page import="com.sun.net.httpserver.HttpsServer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%
    String username = request.getParameter("username")
    String password = request.getParameter("password");
    UserEntity user = new UserEntity(username);
%>
</body>
</html>

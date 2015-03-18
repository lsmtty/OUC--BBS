<%@ page import="sun.util.calendar.BaseCalendar" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: lsmtty
  Date: 15-3-17
  Time: 下午6:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>
    <!--
        JSP是什么：在HTML中书写JAVA代码后，如果这些代码想要被Tomcat运行，那么就需要把页面后缀名改成Tomcat认可的后缀名，比如jsp、jspx。JSP只能被服务器程序运行，浏览器是不认识它的
        JSP和HTML的关系：JSP就是包括了Java代码的HTML页面
        你可以用JSP做什么：在页面被用户接收之前修改页面内容，比如填充数据库里的数据，或者只是显示个时间，JSP修改页面内容是靠直接修改HTML代码实现的
        你应该用JSP做什么：在HTML中实现必须用到Java才能实现的功能，比如从数据库获取数据然后显示到页面里
        你不能用JSP做什么：用户已经接收完页面后的任何事情，因为这时页面已经不在服务器上，而是在用户手里了
        你如何用JSP和用户交互：当用户点击type是submit的button时，页面会被发回到服务器，这时你就可以再次取得页面里的数据了，包括用户填写的部分
        哪些功能你不该用JSP：1. 想让用户不需要刷新页面就能使用的功能，比如自动翻页，这类功能需要Servlet+AJAX
                           2. HTML、CSS和JS本身能实现的功能，比如显示时间
        如果你的页面中JAVA代码出错了：Tomcat会告诉用户HTTP 500了
        如果你的页面被用户收到时存在非HTML、CSS或JS代码：那些东西会被当成一般文字原原本本显示出来。也就是说你无法在用户那里执行JAVA代码
    -->
    </title>
  </head>
  <body>今天的日期是
  <%Date today = new Date();%>
  <%=today.getTime()%>
  </body>
</html>

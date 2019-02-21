<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/black/easyui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui-lang-zh_CN.js"></script>
</head>
<body>



<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                    安全退出
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>
                <c:forEach var="list" items="${requestScope.list}">
                <tr class="row1">
                    <td>
                        ${list.id}
                    </td>
                    <td>
                            ${list.name}
                    </td>
                    <td>
                            ${list.salary}
                    </td>
                    <td>
                            ${list.age}
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/person/deleteById?id=${list.id}">delete emp</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="${pageContext.request.contextPath}/person/selectById?id=${list.id}">update emp</a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='${pageContext.request.contextPath}/addEmp.jsp'"/>
            </p>
        </div>
        <a href="">1</a>
        <a href="">2</a>
        <a href="">3</a>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>

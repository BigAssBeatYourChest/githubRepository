<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/black/easyui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui-lang-zh_CN.js"></script>
</head>

<body>
<script type="text/javascript">
    $(function () {
        $("#captchaImage").on("click", function () {
            $("#captchaImage").prop("src", "${pageContext.request.contextPath}/imgCode/getImgCode?d+" + new Date().getTime());
        });
    })
</script>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
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
                login
            </h1>
            <form id="loginForm" action="${pageContext.request.contextPath}/person/login" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            username:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            password:
                        </td>
                        <td valign="middle" align="left">
                            <input type="password" class="inputgri" name="password" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            <img id="captchaImage" class="captchaImage"
                                 src="${pageContext.request.contextPath}/imgCode/getImgCode" title="点击更换验证码"/>
                        </td>
                        <td  valign="middle" align="left">
                            <input type="text" id="enCode" class="inputgri" name="enCode"  size="8px" />

                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button"  value="Submit &raquo;" />
                    &nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/register.jsp">注册</a>
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+request.getServerPort()+
            request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                url:"json.do",//访问后台的servlet地址
                type:"get",//请求方式
                dataType:"json",//从后台接受数据的方式,text:普通文本  , json:json格式数据
                success:function (data) {
                    alert(data[0])
                }
            })

        })
    </script>
</head>
<body>
<button id="btn1">点击</button>
<input type="text" id="in1">
</body>
</html>

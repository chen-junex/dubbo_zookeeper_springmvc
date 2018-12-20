<html >
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/handlebars-v4.0.12.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script>
    function ajaxtest() {
       var mod = document.getElementById("mod").value;
        $.ajax({
            url:'http://localhost:8080/Controller_war_exploded/ajaxtest',
            data:{
                "mod":mod
            },
            dataType:"json",
            type:"post",
            success:function (data) {
                alert(data.name);
                //  alert("success");
            },
            error:function(e){
                alert("返回数据失败");
            }
        })

    }
</script>
<body>
<h2>indes.jsp</h2>


<input type="text" id="mod">
<button onclick="ajaxtest()">提交</button>
<script id="block-expressions-template" type="text/x-handlebars-template">
    <p>你好：{{name}}</p>
</script>
<div class="content-placeholder"></div>
<script src="js/HanderbarsTest.js"></script>
</body>
</html>

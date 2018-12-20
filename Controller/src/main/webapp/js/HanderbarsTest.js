$(function () {
//抓取模板
    var theTemplateScript = $("#block-expressions-template").html();

    //编译模板
    var theTemplate = Handlebars.compile(theTemplateScript);
    //var name = '{{username'}};
    //var context = '<%=request.getParameter("name") %>';
     var context = {
         "name":"陈俊仕"
     };
    var theTemp = theTemplate(context);
$('.content-placeholder').html(theTemp);
});
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
            //alert(data.name);
            var theTemplateScript = $("#block-expressions-template").html();
            //编译模板
            var theTemplate = Handlebars.compile(theTemplateScript);
            //var name = '{{username'}};
            //var context = '<%=request.getParameter("name") %>';
            var context = data;
            var theTemp = theTemplate(context);
            //$('.content-placeholder').html(theTemp);
            $('.content-placeholder').append(theTemp);
        },
        error:function(e){
            alert("返回数据失败");
        }
    })

}
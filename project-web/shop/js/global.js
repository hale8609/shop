var config = {
	server:'http://localhost:8000/api'
}

/*ajax全局配置*/
$.ajaxSetup({
    type: 'Post',
    beforeSend:function(){
        //发送ajax前显示loading
        maskShow();
    },
    complete : function(request){
        //ajax完成显示loading并且判断登录状态，如果登录失效返回登录页
        maskHide();
        console.log("reques")
        if (request.responseJSON && request.responseJSON.code == '0002'){
            parent.window.location.href="/html/login.html";
        }
    }

})

//如果有使用jquery validator，则重写Jquery的validator的部分方法，自定义错误
if ($.validator){
    $.extend( $.validator.defaults,{
    success:function(element){
        $elementBox = $(element).parent();
        $elementBox.removeClass('has-error');
    },

    highlight:function( element, errorClass, validClass ) {
        $elementBox = $(element).parent();
        $elementBox.addClass('has-error');
    },
    errorClass:'help-block',
    errorElement:'span'
    });
}


//检查登录状态
$.ajax({
    url:config.server+"/checkLoginState",
    success:function(res){
        console.log(res);
        if (res.status != '0000'){
            parent.window.location.href="/html/login.html";
        }
    }
});


function loadUrl(url){
    $(".content-wrapper").load(url);
}

function reload(){
    $(".modal-backdrop").remove();
    $(".content-wrapper").load($(".treeview-menu > li.active").attr("data-url"));
}
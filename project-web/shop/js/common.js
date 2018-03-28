var config = {
	server:'http://localhost:8080'
}

/*ajax全局配置*/
$.ajaxSetup({
    type: 'Post',
    xhrFields: {
        withCredentials: true
    },
    complete : function(request){
        if (request.responseJSON.code == '0002'){
            window.location.href="../html/login.html"
        }
    }

})

//重写Jquery的validator的部分方法，自定义错误
$.extend( $.validator.defaults,{
    success:function(element){
        console.log("成功:")
        console.log(element)
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



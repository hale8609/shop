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

function timestampToDate (value){
     var date = new Date(value);  
    var y = date.getFullYear();    
    var m = date.getMonth() + 1;    
    m = m < 10 ? ('0' + m) : m;    
    var d = date.getDate();    
    d = d < 10 ? ('0' + d) : d;    
    var h = date.getHours();  
    h = h < 10 ? ('0' + h) : h;  
    var minute = date.getMinutes();  
    var second = date.getSeconds();  
    minute = minute < 10 ? ('0' + minute) : minute;    
    second = second < 10 ? ('0' + second) : second;   
    return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;    
}

function swalParent(title,icon){
    swal({title: title,icon:icon});
}



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
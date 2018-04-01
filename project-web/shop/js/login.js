var action = {
    login: config.server + "/login"
}

$("#form").validate({
    rules: {
        username: "required",
        password: "required"
    },
    messages: {
        username: "账号不能为空",
        password: "密码不能为空"
    },
    submitHandler:function(form){
    	 $.ajax({
            	url: action.login,
            	type: 'POST',
            	data: $("#form").serialize(),
            	success:function(res){
            		if (res.code == '0000'){
            			window.location.href="../html/index.html"
            		}else {
                        swal(res.msg, "", "warning");
            		}
            	},
            	error:(function(res) {
            		console.log(res);
            	})
            })
    }
   
});
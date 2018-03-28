var action = {
    login: config.server + "/login"
}

$("#form").validate({
    rules: {
        username: {
            required: true
        },
        password: "required"
    },
    messages: {
        username: "账号不能为空",
        password: "密码不能为空"
    },
    submitHandler:function(form){
    	console.log("执行")
    	 $.ajax({
            	url: action.login,
            	type: 'POST',
            	data: $("#form").serialize(),
            	success:function(res){
            		if (res.code == '0000'){
            			window.location.href="../html/index.html"
            		}else {
            			console.log(res.msg);
            		}
            	},
            	error:(function(res) {
            		console.log(res);
            	})
            })
    }
   
});
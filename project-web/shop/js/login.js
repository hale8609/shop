var action = {
	login:config.server+"/login"
}

var vue = new Vue({
	el:"#form",
	data:{
		username:""
	},
	methods:{
		submit:function(){
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
	}
})


var action = {
	getData: config.server+"/index/getData"
}
$(function(){
	var vue = new Vue({
    el:'#content',
    data: {
        menus:[],
        parent:"首页",
        child:"首页",
        ins:0,
        nick:''
    },
    methods:{
    	toPage:function(event,index){
    		//取消选中标签
			$(".treeview-menu > li").removeClass("active");
			//添加选中标签
			$(event.target).parent("li").addClass("active");
			//清除内容
			$(".content-wrapper").empty();
			//加载内容
			$(".content-wrapper").load($(event.target).parent("li").attr("data-url"));
    	}
    }
});
	//获取菜单数据
	$.ajax({
		url: action.getData,
        xhrFields: {
            withCredentials: true
        },
		type: 'Get',
		success:function(res){
			if (res.code == '0000'){
				vue.menus = res.result.menus;
				vue.nick = res.result.admin.nick;
			}
		}
	})
	
	

//点击折叠菜单按钮调整iframe宽度
$(".sidebar-toggle").click(function() {
	if($('body').hasClass('sidebar-collapse')){
		$(iframe).css("width",$(document.body).width()-230);
	}else {
		$(iframe).css("width",$(document.body).width()-50);
	}
	
});

});		

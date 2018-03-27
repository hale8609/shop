var data = [
		{"icon":"fa fa-gear","name":"系统","childs":[{"name":"管理员","url":"../html/sys/sys-admin.html"},{"name":"角色","url":"test"}]},
		{"icon":"fa fa-user","name":"用户","childs":[{"name":"用户管理","url":"../html/index.html"}]}
		];
var action = {
	getMenu: config.server+"/index/getMenus"
}
$(function(){
	//获取菜单数据
	$.ajax({
		url: action.getMenu,
        xhrFields: {
            withCredentials: true
        },
		type: 'Get',
		success:function(res){
			console.log(res);
		}
	})
	
});		
var vue = new Vue({
    el:'#content',
    data: {
        menus:data,
        parent:"首页",
        child:"首页",
        ins:0
    },
    methods:{
    	toPage:function(event,index){
    		//循环取消所有侧边栏li标签的点中样式
    		$("#content").find('.main-sidebar').find('li').removeClass('active');
    		//给当前点击的li标签添加选中样式
	　　　　$(event.currentTarget).addClass('active');
			$("#iframe").attr("src",$(event.currentTarget).attr("data-url"));
			setIframeHeight($("#iframe"));
             
    	}
    }
});

//点击折叠菜单按钮调整iframe宽度
$(".sidebar-toggle").click(function() {
	if($('body').hasClass('sidebar-collapse')){
		$(iframe).css("width",$(document.body).width()-230);
	}else {
		$(iframe).css("width",$(document.body).width()-50);
	}
	
});

//设置iframe的高度
window.onload = function () {
setIframeHeight();
};

function setIframeHeight() {
	$(iframe).css("width",$(document.body).width()-$(".main-sidebar").width());
	$(iframe).css("height",$(".main-sidebar").height());
}
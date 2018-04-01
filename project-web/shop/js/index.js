
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
    		//循环取消所有侧边栏li标签的点中样式
    		$("#content").find('.main-sidebar').find('li').removeClass('active');
    		//给当前点击的li标签添加选中样式
	　　　　$(event.currentTarget).addClass('active');
			$("#iframe").attr("src",$(event.currentTarget).attr("data-url"));
			setIframeHeight($("#iframe"));
             
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

function setIframeHeight() {
	$(iframe).css("width",$(document.body).width()-$(".main-sidebar").width());
	$(iframe).css("height",$(".main-sidebar").height());
}
//设置iframe的高度

setIframeHeight();

});		

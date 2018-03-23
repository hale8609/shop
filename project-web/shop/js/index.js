var data = [
		{"icon":"fa fa-gear","name":"系统","childs":[{"name":"管理员"},{"name":"角色"}]},
		{"icon":"fa fa-user","name":"用户","childs":[{"name":"用户管理"}]}
		];
		new Vue({
		    el:'#content',
		    data: {
		        menus:data,
		        parent:"首页",
		        child:"首页",
		        ins:0
		    },
		    methods:{
		    	toPage:function(event,index){
		    		 $("#content").find('.main-sidebar').find('li').removeClass('active');
			　　　　　$(event.currentTarget).addClass('active');
                     console.log(event.currentTarget);
		    	}
		    }
		});
function setIframeHeight(iframe) {
$(iframe).height(document.body.clientHeight-$("nav").outerHeight()-$(".content-header").outerHeight()-8);
$(iframe).css("width","100%");
}
window.onload = function () {
setIframeHeight($("iframe")[0]);
};
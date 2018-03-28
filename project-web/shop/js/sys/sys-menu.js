$(function() {

	var action = {
    getMenus: config.server + "/menu/getMenus"
	}

    var vue = new Vue({
        el: '.wrapper',
        data: {
            menus: [],
            child: parent.$("li .active")[0].innerText,
            parent: parent.$(".menu-open").find('span')[0].innerText
        },
        methods:{
            openOrClose:function($event){
                $obj = $($event.currentTarget)
                var isOpen = $obj.hasClass('fa-caret-down');
                var parentId = $obj.parents('tr').attr("id");
                if (isOpen){
                    $obj.removeClass('fa-caret-down');
                    $obj.addClass('fa-caret-right');
                    $obj.parents('tbody').find('tr[pId='+parentId+']').hide();    
                }else {
                    //按钮更换图标
                    $obj.removeClass('fa-caret-right');
                    $obj.addClass('fa-caret-down');
                    $obj.parents('tbody').find('tr[pId='+parentId+']').show();
                }
            }
        }
    })
    Vue.filter('timestampToDate', function(value){
        return timestampToDate(value)
    });
    $.ajax({
    	url: action.getMenus,
    	success:function(res){
    		if (res.code =='0000'){
    			vue.menus = res.result;
    		}
    	}

    })
    
})

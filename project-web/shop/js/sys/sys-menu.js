
	var action = {
    getMenus: config.server + "/menu/getMenus",
    saveOrUpdate:config.server + "/menu/saveOrUpdate",
	};

    var vue = new Vue({
        el: '.wrapper',
        data: {
            menus: [],
            child: parent.$("li .active")[0].innerText,
            parent: parent.$(".menu-open").find('span')[0].innerText,
            icon:''
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
            },
            add:function(){
                $('#addOrUpdateModel').modal("show");
            },
            edit:function(_this){
                //$obj = $($event.currentTarget)
                console.log($(_this).parents('tr').attr('id'));
            }
        }
    });


    $.ajax({
    	url: action.getMenus,
    	success:function(res){
    		if (res.code =='0000'){
    			vue.menus = res.result;
    		}
    	}

    });
    
    $("#addOrUpdateForm").validate({
        rules: {
            menuName: "required",
            sortNum: "required"
        },
        messages: {
            menuName: "菜单名称不能为空",
            sortNum: "排序号不能为空"
        },
        submitHandler:function(form){
             $.ajax({
                url: action.saveOrUpdate,
                type: 'POST',
                data: $("#addOrUpdateForm").serialize(),
                success:function(res){
                    if (res.code == '0000'){
                        window.parent.swal("保存成功！", "", "success");
                        $('#addOrUpdateModel').modal('hide');
                        location.reload();
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




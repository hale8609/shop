
	var action = {
    getMenus: config.server + "/menu/getMenus",
    saveOrUpdate:config.server + "/menu/saveOrUpdate",
    delMenu:config.server+"/menu/del",
    getMenuById:config.server+"/menu/getMenuById"
	};

    var vue = new Vue({
        el: '.wrapper',
        data: {
            menus: null,
            child: parent.$("li .active")[0].innerText,
            parent: parent.$(".menu-open").find('span')[0].innerText,
            id:null,
            parentId:'0',
            menuName:null,
            url:null,
            icon:null,
            sortNum:null
        },
        methods:{
            openOrClose(_this){
                console.log(_this);
                var isOpen = $(_this).hasClass('fa-caret-down');
                var parentId = $(_this).parents('tr').attr("id");
                if (isOpen){
                    $(_this).removeClass('fa-caret-down');
                    $(_this).addClass('fa-caret-right');
                    $(_this).parents('tbody').find('tr[pId='+parentId+']').hide();    
                }else {
                    //按钮更换图标
                    $(_this).removeClass('fa-caret-right');
                    $(_this).addClass('fa-caret-down');
                    $(_this).parents('tbody').find('tr[pId='+parentId+']').show();
                }
            },
            add(){
                $('#addOrUpdateModel').modal("show");
            },
            edit(_this){
                $.ajax({
                    url:action.getMenuById,
                    data:{id:$(_this).parents('tr').attr("id")},
                    success:function(res){
                        console.log(res);
                        $('#addOrUpdateModel').modal("show");
                        vue.id = res.result.id;
                        vue.parentId = res.result.parentId;
                        vue.icon = res.result.icon;
                        vue.menuName=res.result.menuName;
                        vue.url = res.result.url;
                        vue.sortNum = res.result.sortNum;
                    }
                })
            },
            del(_this){
                swal("确定要删除菜单？若是主菜单，则对应的子菜单也会被删除", {
                  dangerMode: true,
                  buttons:["Cancel", "Delete!"]})
                 .then((isDel) => {
                     if (isDel){
                        $.ajax({
                            url:action.delMenu,
                            data:{id:$(_this).parents('tr').attr("id")},
                            success:function(res){
                                if (res.code=='0000'){
                                    parent.swal(res.msg,'','success');
                                    location.reload();
                                }else {
                                    swal(res.msg,'','warning');
                                }
                            }
                        })
                     }
                });
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




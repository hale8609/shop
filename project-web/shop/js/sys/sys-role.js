var action = {
	getAllRoles: config.server + "/role/getAllRoles",
	getRoleById:config.server + "/role/getRoleById",
	saveOrUpdate:config.server+"/role/saveOrUpdate",
	delRole:config.server+"/role/del"
};

var vue = new Vue({
    el: '.content-wrapper',
    data: {
        child: parent.$("li .active")[0].innerText,
        parent: parent.$(".menu-open").find('span')[0].innerText,
        roles:null,
        id:null,
        roleName:null,
        description:null
    },
    methods:{
        add(){
            $('#addOrUpdateModel').modal("show");
        },
        edit(_this){
            $.ajax({
                url:action.getRoleById,
                data:{id:$(_this).parents('tr').attr("id")},
                success:function(res){
                    console.log(res);
                    $('#addOrUpdateModel').modal("show");
                    vue.id = res.result.id;
                    vue.roleName = res.result.roleName;
                    vue.description = res.result.description;
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
                        url:action.delRole,
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
	url: action.getAllRoles,
	success:function(res){
        console.log(res);
		if (res.code =='0000'){
			vue.roles = res.result;
		}
	}

});

$("#addOrUpdateForm").validate({
        rules: {
            roleName: "required"
        },
        messages: {
            roleName: "角色名称不能为空",
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
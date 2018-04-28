package com.controller.sys;

import com.model.SysRole;
import com.service.SysRoleService;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/getAllRoles")
    @ResponseBody
    public Object getAllRoles(){
        HttpResult httpResult = new HttpResult();
        List<SysRole> roles = sysRoleService.selectAll();
        httpResult.setResult(roles);
        return httpResult;
    }

    @RequestMapping("/getRoleById")
    @ResponseBody
    public Object getRoleById(Integer id){
        HttpResult httpResult = new HttpResult();
        if (id == null){
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"id不能为空");
            return httpResult;
        }
        SysRole role = sysRoleService.selectById(id);
        httpResult.setResult(role);
        return httpResult;
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public Object saveOrUpdate(SysRole sysRole){
        HttpResult httpResult = new HttpResult();
        if (sysRole.getRoleName() == null){
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"角色名称不能为空");
            return httpResult;
        }
        if (sysRole.getId() == null){
            sysRoleService.insert(sysRole);
        }else {
            sysRoleService.update(sysRole);
        }
        return httpResult;
    }

    @RequestMapping("/del")
    @ResponseBody
    public Object del(Integer id){
        HttpResult httpResult = new HttpResult();
        if (id == null){
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"id不能为空");
            return httpResult;
        }
        sysRoleService.delete(id);
        return httpResult;
    }
}

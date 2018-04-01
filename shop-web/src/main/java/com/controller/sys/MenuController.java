package com.controller.sys;

import cn.hutool.core.util.StrUtil;
import com.model.SysMenu;
import com.service.SysMenuService;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/getMenus")
    @ResponseBody
    public Object getMenus(){
        HttpResult httpResult = new HttpResult();
        List<SysMenu> menus = sysMenuService.selectAllMenus();
        httpResult.setResult(menus);
        return httpResult;
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public Object saveOrUpdate(SysMenu sysMenu){
        HttpResult httpResult = new HttpResult();
        if (sysMenu.getParentId() == null){
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"上级id不能为空");
            return httpResult;
        }
        if (StrUtil.isBlank(sysMenu.getMenuName())){
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"菜单名称不能为空");
            return httpResult;
        }
        if (sysMenu.getSortNum() == null){
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"排序号不能为空");
            return httpResult;
        }
        if (sysMenu.getParentId() == 0 && StrUtil.isBlank(sysMenu.getMenuName())) {
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"菜单图标不能为空");
            return httpResult;
        }
        if (sysMenu.getParentId() != 0 && StrUtil.isBlank(sysMenu.getUrl())) {
            httpResult.setCodeAndMsg(HttpResult.PARAMETER_CAN_NOT_BE_EMPTY,"菜单路径不能为空");
            return httpResult;
        }
        //补充系统参数
        sysMenu.setCreateTime(new Date());
        //新增
        if (sysMenu.getId() == null){
            sysMenuService.insert(sysMenu);
        }
        //删除
        else {
            sysMenuService.update(sysMenu);
        }
        return httpResult;
    }

    @RequestMapping("/del")
    @ResponseBody
    public Object del(){
        return null;
    }

}

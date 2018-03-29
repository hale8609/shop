package com.controller.sys;

import com.model.SysMenu;
import com.service.SysMenuService;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/getMenus")
    @ResponseBody
    public Object getMenus(HttpSession httpSession){
        HttpResult httpResult = new HttpResult();
        List<SysMenu> menus = sysMenuService.selectAllMenus();
        httpResult.setResult(menus);
        return httpResult;
    }

    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public Object saveOrUpdate(SysMenu sysMenu){
        return null;
    }

    @RequestMapping("/del")
    @ResponseBody
    public Object del(){
        return null;
    }

}

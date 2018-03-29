package com.controller;

import com.model.SysAdmin;
import com.model.SysMenu;
import com.service.SysMenuService;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/getData")
    @ResponseBody
    public Object getData(HttpSession session) {
        HttpResult httpResult = new HttpResult();
        SysAdmin sysAdmin = (SysAdmin) session.getAttribute("sysAdmin");
        List<SysMenu> menus = sysMenuService.selectMenusByAdminId(sysAdmin.getId());
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("admin",sysAdmin);
        map.put("menus",menus);
        httpResult.setResult(map);
        return httpResult;
    }

    @RequestMapping("/logout")
    @ResponseBody
    public Object logout(HttpSession session){
        HttpResult httpResult = new HttpResult();
        session.setAttribute("sysAdmin",null);
        httpResult.setMsg("退出成功!");
        return httpResult;
    }
}

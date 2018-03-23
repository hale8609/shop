package com.controller;

import com.model.SysAdmin;
import com.model.SysMenu;
import com.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/getMenus")
    @ResponseBody
    public Object getMenus(HttpSession session) {
        SysAdmin sysAdmin = (SysAdmin) session.getAttribute("sysAdmin");
        List<SysMenu> menus = sysMenuService.selectMenusByAdminId(sysAdmin.getId());
        return menus;
    }
}

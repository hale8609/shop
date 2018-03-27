package com.controller.sys;

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
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("/getAll")
    @ResponseBody
    public Object getAll(HttpSession httpSession){
        SysAdmin admin = (SysAdmin) httpSession.getAttribute("sysAdmin");
        List<SysMenu> menus = sysMenuService.selectMenusByAdminId(admin.getId());
        return menus;
    }


    @RequestMapping("/add")
    @ResponseBody
    public Object add(SysAdmin sysAdmin){
        return null;
    }

    @RequestMapping("/del")
    @ResponseBody
    public Object del(){
        return null;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Object update(){
        return null;
    }
}

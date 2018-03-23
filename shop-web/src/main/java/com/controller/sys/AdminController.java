package com.controller.sys;

import com.model.SysAdmin;
import com.service.SysAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private SysAdminService sysAdminService;

    @RequestMapping("/getAll")
    @ResponseBody
    private Object getByCondition(SysAdmin sysAdmin){
        return null;
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
}

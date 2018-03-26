package com.controller.sys;

import com.model.SysAdmin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("/getAll")
    @ResponseBody
    public Object getAll(){
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

    @RequestMapping("/update")
    @ResponseBody
    public Object update(){
        return null;
    }
}

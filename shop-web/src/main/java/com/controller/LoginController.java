package com.controller;


import cn.hutool.core.util.StrUtil;
import com.model.SysAdmin;
import com.service.SysAdminService;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private SysAdminService sysAdminService;

    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpSession session, String username, String password){
        HttpResult httpResult = new HttpResult();
        if (StrUtil.hasBlank(username,password)){
            httpResult.setCodeAndMsg(HttpResult.CODE_ACCOUNT_OR_PASSWORD_CAN_NOT_BE_NULL,"账号或者密码不能为空");
            return httpResult;
        }
        SysAdmin sysAdmin = sysAdminService.selectAdminByUsernameAndPwd(username, password);
        if (sysAdmin == null){
            httpResult.setCodeAndMsg(HttpResult.CODE_ACCOUNT_OR_PASSWORD_INCORRECT,"账号或者密码不正确");
        }else {
            session.setAttribute("sysAdmin",sysAdmin);
            System.out.println("loginSessionId:"+session.getId());
            httpResult.setMsg("登录成功");
            httpResult.setResult(sysAdmin);
        }
        return httpResult;
    }


}

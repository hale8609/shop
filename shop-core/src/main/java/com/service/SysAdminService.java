package com.service;

import cn.hutool.crypto.SecureUtil;
import com.mapper.SysAdminMapper;
import com.model.SysAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    public SysAdmin login(String username,String password){
        SysAdmin sysAdmin = sysAdminMapper.selectByUserNameAndPwd(username, SecureUtil.md5(password));
        return sysAdmin;
    }
}

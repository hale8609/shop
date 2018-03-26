package com.service;

import cn.hutool.crypto.SecureUtil;
import com.mapper.SysAdminMapper;
import com.model.SysAdmin;
import com.model.SysAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysAdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    public SysAdmin selectAdminByUsernameAndPwd(String username,String password){
        SysAdminExample example = new SysAdminExample();
        SysAdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminNameEqualTo(username);
        criteria.andAdminPwdEqualTo(SecureUtil.md5(password));
        List<SysAdmin> sysAdmin = sysAdminMapper.selectByExample(example);
        if (sysAdmin.size()!= 0){
            return sysAdmin.get(0);
        }
        return null;
    }
}

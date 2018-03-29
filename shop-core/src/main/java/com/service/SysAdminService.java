package com.service;

import cn.hutool.crypto.SecureUtil;
import com.mapper.SysAdminMapper;
import com.model.SysAdmin;
import com.model.SysAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "sysAdmin")
public class SysAdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Cacheable(key = "#username.concat(#password)")
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

    public int insert(SysAdmin sysAdmin){
        return sysAdminMapper.insertSelective(sysAdmin);
    }

}

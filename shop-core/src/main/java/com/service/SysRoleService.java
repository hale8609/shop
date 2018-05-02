package com.service;

import com.mapper.SysRoleMapper;
import com.model.SysRole;
import com.model.SysRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@CacheConfig(cacheNames = "sysRole")
public class SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Cacheable(key = "#id+'selectById'")
    public SysRole selectById(int id){
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Cacheable
    public List<SysRole> selectAll(){
        SysRoleExample example = new SysRoleExample();
        example.setOrderByClause("create_time");
        return sysRoleMapper.selectByExample(example);
    }

    @Transactional
    public int insert(SysRole sysRole){
        return sysRoleMapper.insertSelective(sysRole);
    }


    @CacheEvict(value = "sysRole",allEntries = true)
    @Transactional
    public int update(SysRole sysRole){
        return sysRoleMapper.updateByPrimaryKey(sysRole);
    }


    @CacheEvict(value = "sysRole",allEntries = true)
    @Transactional
    public int delete(int id){
        return sysRoleMapper.deleteByPrimaryKey(id);
    }

}

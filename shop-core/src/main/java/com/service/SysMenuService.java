package com.service;

import com.mapper.SysMenuMapper;
import com.model.SysMenu;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@CacheConfig(cacheNames = "sysMenu")
public class SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Cacheable(key = "#adminId")
    public List<SysMenu> selectMenusByAdminId(int adminId){
        List<SysMenu> parentMenus = sysMenuMapper.selectMenusByAdminId(adminId,0);
        for (SysMenu sysMenu: parentMenus) {
            sysMenu.setSubMenus(sysMenuMapper.selectMenusByAdminId(adminId,sysMenu.getId()));
        }
        return parentMenus;
    }

    @Transactional
    public int insert(SysMenu sysMenu){
       return sysMenuMapper.insertSelective(sysMenu);
    }


    @Transactional
    @CacheEvict(value="sysMenu", allEntries=true)
    public int update(SysMenu sysMenu){
        return sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
    }

    @Transactional
    @CacheEvict(value="sysMenu", allEntries=true)
    public int delete(int id){
        return sysMenuMapper.deleteByPrimaryKey(id);
    }
}

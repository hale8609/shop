package com.service;

import com.mapper.SysMenuMapper;
import com.model.SysMenu;
import com.model.SysMenuExample;
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

    @Cacheable(key = "#id+'selectById'")
    public SysMenu selectById(int id){
        SysMenu menu = sysMenuMapper.selectByPrimaryKey(id);
        return menu;
    }

    @Cacheable(key = "#adminId+'selectMenusByAdminId'")
    public List<SysMenu> selectMenusByAdminId(int adminId){
        List<SysMenu> parentMenus = sysMenuMapper.selectMenusByAdminId(adminId,0);
        for (SysMenu sysMenu: parentMenus) {
            sysMenu.setSubMenus(sysMenuMapper.selectMenusByAdminId(adminId,sysMenu.getId()));
        }
        return parentMenus;
    }

    @Cacheable(key = "'selectAllMenus'")
    public List<SysMenu> selectAllMenus(){
        SysMenuExample example = new SysMenuExample();
        example.or().andParentIdEqualTo(0);
        example.setOrderByClause("sort_num");
        List<SysMenu> parentMenu = sysMenuMapper.selectByExample(example);
        for (SysMenu sysMenu:parentMenu) {
            SysMenuExample example2 = new SysMenuExample();
            example2.or().andParentIdEqualTo(sysMenu.getId());
            example2.setOrderByClause("sort_num");
            sysMenu.setSubMenus(sysMenuMapper.selectByExample(example2));
        }
        return parentMenu;
    }

    @Transactional
    @CacheEvict(value="sysMenu", allEntries=true)
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
        int rows = 0;
        SysMenu menu = sysMenuMapper.selectByPrimaryKey(id);
        if (menu.getParentId() == 0){
            rows += sysMenuMapper.deleteByPrimaryKey(id);
            SysMenuExample sysMenuExample = new SysMenuExample();
            sysMenuExample.or().andParentIdEqualTo(id);
            rows +=sysMenuMapper.deleteByExample(sysMenuExample);
        }else {
            rows +=sysMenuMapper.deleteByPrimaryKey(id);
        }
        return rows;
    }

}

package com.service;

import com.mapper.SysMenuMapper;
import com.model.SysMenu;
import com.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    public List<SysMenu> selectMenusByAdminId(int adminId){
        List<SysMenu> parentMenus = sysMenuMapper.selectMenusByAdminId(adminId,0);
        for (SysMenu sysMenu: parentMenus) {
            sysMenu.setSubMenus(sysMenuMapper.selectMenusByAdminId(adminId,sysMenu.getId()));
        }
        return parentMenus;
    }
}

package com.service;

import com.mapper.SysMenuMapper;
import com.model.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    public List<SysMenu> selectMenusByAdminId(int adminId){
        List<SysMenu> menus = sysMenuMapper.selectMenusByAdminId(adminId);
        return menus;
    }
}

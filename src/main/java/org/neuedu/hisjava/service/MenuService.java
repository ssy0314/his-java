package org.neuedu.hisjava.service;


import org.neuedu.hisjava.mapper.MenuMapper;
import org.neuedu.hisjava.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }
}

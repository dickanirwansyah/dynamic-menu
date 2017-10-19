/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.service;

import com.dickanirwansyah.spring.dao.MenuDAO;
import com.dickanirwansyah.spring.entities.Menu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author java-spring
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService{
    
    @Autowired
    private MenuDAO menuDAO;

    @Override
    public List<Menu> listmenus() {
      return menuDAO.listMenu();
    }

    @Override
    public List<Menu> listall() {
      return menuDAO.listall();
    }

   
    
}

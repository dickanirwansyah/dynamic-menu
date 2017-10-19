/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.service;

import com.dickanirwansyah.spring.entities.Menu;
import java.util.List;

/**
 *
 * @author java-spring
 */
public interface MenuService {
    
    List<Menu> listmenus();
    
    List<Menu> listall();
}

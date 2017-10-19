/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.dao;

import com.dickanirwansyah.spring.entities.Menu;
import java.util.List;

/**
 *
 * @author java-spring
 */
public interface MenuDAO {
 
    List<Menu> listMenu();
    
    List<Menu> listall();
}

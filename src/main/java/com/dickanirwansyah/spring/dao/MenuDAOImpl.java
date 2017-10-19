/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.dao;

import com.dickanirwansyah.spring.entities.Menu;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author java-spring
 */
@Repository("menuDAO")
public class MenuDAOImpl implements MenuDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Menu> listMenu() {
        Query query = sessionFactory.getCurrentSession()
                .createQuery("from Menu where menu = null");
        return query.list();
    }

    @Override
    public List<Menu> listall() {
      Query query = sessionFactory.getCurrentSession()
              .createQuery("from Menu");
      return query.list();
    }

 
    
}

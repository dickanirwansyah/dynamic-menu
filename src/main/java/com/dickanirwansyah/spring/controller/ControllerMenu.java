/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;

import com.dickanirwansyah.spring.entities.Menu;
import com.dickanirwansyah.spring.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author java-spring
 */
@Controller
public class ControllerMenu {
    
    @Autowired
    private MenuService menuService;
    
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView getIndexMenu(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("menuLevel1", menuService.listmenus());
        mav.addObject("menus", menuService.listall());
        mav.addObject("title", "Membuat Menu Dynamic !");
        return mav;
    }
    
    @RequestMapping(value = "/data/kategori/kategori1", method = RequestMethod.GET)
    public ModelAndView getKategori1(){
        ModelAndView view = new ModelAndView();
        view.setViewName("kategori/kategori1");
        view.addObject("title", "Kategori 1");
        return view;
    }
    
}

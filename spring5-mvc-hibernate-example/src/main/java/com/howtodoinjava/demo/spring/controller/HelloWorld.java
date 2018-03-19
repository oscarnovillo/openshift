/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtodoinjava.demo.spring.controller;


import com.howtodoinjava.demo.spring.model.Caja;
import com.howtodoinjava.demo.spring.service.CajaService;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author user
 */
@Controller
public class HelloWorld {

    @Autowired
    private CajaService userService;

    @RequestMapping(path = "/yyo",
      produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Caja> userForm(Model model) {

        return userService.list();
    }
}

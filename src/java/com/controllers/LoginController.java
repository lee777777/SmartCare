/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.models.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author THINKPAD
 */
public class LoginController extends SimpleFormController{
    
        public LoginController()
           {setCommandClass(User.class);
            setCommandName("loginUser"); 
           }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        //return super.onSubmit(request, response, command, errors); //To change body of generated methods, choose Tools | Templates.
    User user=(User)command;
    ModelAndView modelandview;
    if(user.getUserName().equals("gcet") && user.getPassword().equals("123456"))
    {
        return modelandview=new ModelAndView("main","user",user);
    } else 
        return modelandview=new ModelAndView("login","user",user);
    }

    
    }
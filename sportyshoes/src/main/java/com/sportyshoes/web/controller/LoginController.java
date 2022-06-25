package com.sportyshoes.web.controller;


import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sportyshoes.web.Users;
import com.sportyshoes.web.model.UsersRepository;
import com.sportyshoes.web.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

//    @Autowired
//    LoginService service;
	@Autowired
	UsersRepository repo;
	Logger log=Logger.getAnonymousLogger();
	//  @RequestMapping("login")
  //  public String showLoginPage(){
    //	ModelAndView mv= new ModelAndView();
    //	System.out.println("--we are in the controller--");
    //	session.setAttribute("name", mv);
    //    return "register.jsp";
   // }

//    @RequestMapping(value="/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
//
//        boolean isValidUser = service.validateUser(name, password);
//
//        if (!isValidUser) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//
//        model.put("name", name);
//        model.put("password", password);
//
//        return "welcome";
    
    @RequestMapping("/register")
    public ModelAndView insertUser(Users user) {
    	log.info("inside the register method");
    	ModelAndView mv=new ModelAndView();
    	mv.addObject("obj",user);
    	if(user!= null) {
    	repo.save(user);
    	log.info("insert method called successfully");

    	}
    		mv.setViewName("/status");
    	return mv;
    }
    @RequestMapping("/login")
    public ModelAndView loginUser(Users user) {
    	log.info("inside the login  method");
    	ModelAndView mv=new ModelAndView();
    	mv.addObject("obj",user);
    	if(user!= null) {
    	repo.findByuser();
    	repo.findBypassword();
    	log.info("insert method called successfully");

    	}
    		mv.setViewName("/status");
    	return mv;
    }
}

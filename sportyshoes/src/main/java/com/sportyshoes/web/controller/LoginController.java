package com.sportyshoes.web.controller;


import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sportyshoes.web.Shoes;
import com.sportyshoes.web.Users;
import com.sportyshoes.web.model.ShoesRepository;
import com.sportyshoes.web.model.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
   @Autowired
	UsersRepository repo;
	Logger log=Logger.getAnonymousLogger();

    @RequestMapping("/register")
    public ModelAndView insertUser(Users user) {
    	log.info("inside the register method");
    	ModelAndView mv=new ModelAndView();
    	mv.addObject("obj",user);
    	String email=user.getEmail();
    	Users userpresent=repo.findByEmail(email);
    	if(user!= null&&userpresent==null) {
    	repo.save(user);
    	log.info("insert method called successfully");

    	}
    		mv.setViewName("/login");
    	return mv;
    }
    
    
    @RequestMapping("/login")
    public String loginUser(HttpServletRequest req,HttpServletResponse res) {
    	log.info("inside the login  method");
    	String userEmailID;
    	String password;
    	Users user;
    	userEmailID=req.getParameter("emailID");
    	password=req.getParameter("password");
    	user=repo.findByEmail(userEmailID);
    	if(user.getPassword().equals(password)) {
    		log.info("inside the if validation");
    		HttpSession sess= req.getSession();
    		sess.setAttribute("name", user.getName());
    		sess.setAttribute("userid", user.getId());
    		return "forward:/welcome";
    	}else {
    			return "forawrd:/error.jsp";
				//res.sendRedirect("error.jsp");
			}
    	}
		
    		
   
    }

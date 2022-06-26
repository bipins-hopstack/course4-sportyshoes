package com.sportyshoes.web.controller;


import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sportyshoes.web.Shoes;
import com.sportyshoes.web.Users;
import com.sportyshoes.web.model.ShoesRepository;
import com.sportyshoes.web.model.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

   @Autowired
   ShoesRepository  shoerepo;
	
   Logger log=Logger.getAnonymousLogger();
   
    @RequestMapping("getProducts")
    public ModelAndView getProducts(HttpServletRequest req,HttpServletResponse res) {
    	log.info("inside the get  method");
    	Shoes shoes;
    	ModelAndView mv=new ModelAndView();  
    	 shoerepo.findAllShoes();
  if(true) {
    		System.out.println(shoerepo.findAllShoes());
    		mv.addObject(shoerepo.findAllShoes());
    		
    		mv.setViewName("/welcome");
    	}else {
    		mv.setViewName("/error");
    	}
    		
    	return mv;
    }
}

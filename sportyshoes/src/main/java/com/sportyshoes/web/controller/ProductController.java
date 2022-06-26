package com.sportyshoes.web.controller;


import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sportyshoes.web.Orders;
import com.sportyshoes.web.Shoes;
import com.sportyshoes.web.Users;
import com.sportyshoes.web.model.OrderRepository;
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
   @Autowired
   OrderRepository orderrepo;
   Logger log=Logger.getAnonymousLogger();
   
    @RequestMapping("/welcome")
    public ModelAndView getProducts(HttpServletRequest req,HttpServletResponse res) {
    	log.info("inside the get  method");
    	List<Shoes> shoes;
    	ModelAndView mv=new ModelAndView();  
    	shoes=shoerepo.findAll();
    	log.info(shoes.toString());
    		mv.addObject("shoes",shoes);
    		mv.setViewName("welcome");
    	return mv;
    }
    
    @RequestMapping("/buy")
    public ModelAndView buyProduct(HttpServletRequest req,HttpServletResponse res) {
    	log.info("inside the Buy  method");
    	Shoes shoes;
    	Orders order=new Orders();
    	ModelAndView mv=new ModelAndView();  
    	HttpSession sess=req.getSession();
    	if(sess.getAttribute("name")!=null) {
    	int itemid=Integer.parseInt(req.getParameter("buy"));
    	log.info("product id :"+itemid);
    	shoes=shoerepo.findById(itemid).orElse(null);
    	order.setProductid(itemid);
    	order.setUserid((int) sess.getAttribute("userid"));
    	orderrepo.save(order);
    	mv.addObject("shoes",shoes);
    	log.info("shoe details"+shoes);
    	
    	mv.setViewName("buysuccess");
    	}else {
    		mv.addObject("","you havent logged in,please login to buy");
    		mv.setViewName("login");
    	}
    	return mv;
    }
}

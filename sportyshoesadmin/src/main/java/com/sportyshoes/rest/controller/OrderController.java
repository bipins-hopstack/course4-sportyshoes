package com.sportyshoes.rest.controller;

import java.util.List;

import com.sportyshoes.admin.Orders;
import com.sportyshoes.admin.model.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

	@Autowired
	OrderRepository ordrepo;
	
	@RequestMapping("/orders")
	@ResponseBody
	public List<Orders> getAllorder() {
		
		return ordrepo.findAll();
		
	}
	

}

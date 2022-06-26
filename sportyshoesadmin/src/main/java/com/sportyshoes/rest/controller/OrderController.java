package com.sportyshoes.rest.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sportyshoes.admin.Orders;
import com.sportyshoes.admin.Shoes;
import com.sportyshoes.admin.model.OrderRepository;
import com.sportyshoes.admin.model.ShoesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	OrderRepository ordrepo;
	
	@Autowired
	ShoesRepository shoerepo;
	
	@GetMapping("/orders")
	@ResponseBody
	public List<Orders> getAllorder() {
		
		return ordrepo.findAll();
		
	}
	
	@GetMapping("/orders/{orderid}")
	@ResponseBody
	public Optional<Orders> getOrderById(@PathVariable("orderid") int id) {
		
		return ordrepo.findById(id);
		
	}
	
	@GetMapping("/orderbydate/{orderDate}")
	@ResponseBody
	public List<Orders> getOrderByDate(@PathVariable("orderDate") @DateTimeFormat(pattern = "yyyy-MM-dd")  Date orderdate) {
		
		return ordrepo.findByOrderdate(orderdate);
		
	}
	
	@GetMapping("/shoes/{category}")
	@ResponseBody
	public List<Shoes> getOrderByDate(@PathVariable("category") String category) {
		
		return shoerepo.findBycategory(category);
		
	}
	
	@PostMapping("/shoes")
	public Shoes addShoes(@RequestBody Shoes shoes)
	{	shoerepo.save(shoes);
		return shoes;
		
	}
	

}

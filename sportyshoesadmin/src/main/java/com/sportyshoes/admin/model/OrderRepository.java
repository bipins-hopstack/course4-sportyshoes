package com.sportyshoes.admin.model;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sportyshoes.admin.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Orders, Integer>{

	List<Orders> findByOrderdate(Date orderdate);

	//@Query("from shoes,orders where shoes.category=?1 and orders.productid=shoes.itemid;")
//	List<Object> findByOrdercategory();

	//findBypassword(){}
	//public  List<Shoes> findAll();
	
	
}

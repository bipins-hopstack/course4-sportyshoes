package com.sportyshoes.web.model;

import java.util.List;

import com.sportyshoes.web.Shoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Integer>{

	//findBypassword(){}
	public  List<Shoes> findAllShoes();
	
}

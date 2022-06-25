package com.sportyshoes.web.model;

import com.sportyshoes.web.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

	public Users findByuser(String userName){
		
	}
	
	findBypassword(){}
	
}

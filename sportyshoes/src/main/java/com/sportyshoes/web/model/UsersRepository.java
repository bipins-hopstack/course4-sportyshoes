package com.sportyshoes.web.model;


import com.sportyshoes.web.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

	//@Query("SELECT u FROM Users u WHERE u.email = ?1")
	public  Users findByEmail(String emailID);
	
	
}

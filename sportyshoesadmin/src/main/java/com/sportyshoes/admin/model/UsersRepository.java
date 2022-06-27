package com.sportyshoes.admin.model;



import com.sportyshoes.admin.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel ="users",path="users")
public interface UsersRepository extends JpaRepository<Users, Integer>{

	//@Query("SELECT u FROM Users u WHERE u.email = ?1")
	public  Users findByEmail(String emailID);
	
	
}

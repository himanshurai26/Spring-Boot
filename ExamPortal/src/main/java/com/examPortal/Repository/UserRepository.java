package com.examPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examPortal.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}

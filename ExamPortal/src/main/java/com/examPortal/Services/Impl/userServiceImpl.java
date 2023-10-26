package com.examPortal.Services.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.examPortal.Entity.User;
import com.examPortal.Entity.UserRole;
import com.examPortal.Repository.RoleRepository;
import com.examPortal.Repository.UserRepository;
import com.examPortal.Services.UserService;

public class userServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) {
		// TODO Auto-generated method stub
		
		User local = this.userRepository.findByUserName(user.getUsername());
		if(local != null) {
			
			System.out.println("User is already there !!") ;
			throw new Exception("User already exit !!");
		}
		
		return null;
		
	}

}

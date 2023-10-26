package com.examPortal.Services;

import java.util.Set;

import com.examPortal.Entity.User;
import com.examPortal.Entity.UserRole;

public interface UserService {
	
	//creating user
	
	public User createUser(User user, Set<UserRole> userRoles);
		

}

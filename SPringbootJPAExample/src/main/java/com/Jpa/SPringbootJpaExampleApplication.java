package com.Jpa;
import com.Jpa.Entity.User;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.Jpa.dao.*;

@SpringBootApplication(scanBasePackages = "com.Jpa.dao")
@Component
public class SPringbootJpaExampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SPringbootJpaExampleApplication.class, args);

	 UserRepository userRepository = context.getBean(UserRepository.class);
	
//	User user = new User();
//	
//	user.setName("Shashank Dangi  ");
//	user.setCity("Govindpuri New Delhi");
//	user.setStatus("Learning concept of DSA programmer from coding blocks");
//	
//	
//	  User saved1 = userRepository.save(user); System.out.println("This is user1 "
//	  + saved1);
	 
	
//	User user1 = new User();
// user1.setName("Priyanshu");
// user1.setCity("Kolkata");
//  user1.setStatus("Pursuing Btech 2nd year");
//  
//	
//	  User saved2 = userRepository.save(user1);
//	   System.out.println("This is user2 "
//	  + saved2);
	 
  
  //save multiple object using list and list.off
//  List<User> list = List.of(user,user1);
//  
//Iterable<User> result =  userRepository.saveAll(list);
//	
//result.forEach(users->{
//	System.out.println(users);
//});
//	
	 
	 
	/* ******************************/
	 
	 // update the user of id 102
	 
//	 Optional<User> optional = userRepository.findById(102);
//	 
//	User usr = optional.get();
//	
//	usr.setName("Shashank");
//
//	User user = userRepository.save(usr);
//	
//	System.out.println(user);
//	
	 
/*	 ***********************/
	 //how to get the data
	 //1) findById(id) - return optional contaning your data
	 
	 // if we want to all data 
	 
	// Iterable<User> itr = userRepository.findAll();
//	
//	 Iterator<User> iterator = itr.iterator();
//	 while(iterator.hasNext()) {
//		 
//		 User user = iterator.next();
//		 System.out.println(user);
//	 }
	 
	 // newc method to find all element
	 
		
//		  itr.forEach( user->{
//			  System.out.println(user);
//			  
//		  });
	 
//	
	 
	 
	 
	// */***********************************/
	
/*	
 userRepository.deleteById(102);
	System.out.println("Deleted" );
	*/
	 
//	Iterable<User> alluser = userRepository.findAll();
//     alluser.forEach(user->{
//		System.out.println(user);
//	});
// 
//     userRepository.deleteAll();

//	List<User> findbyname = userRepository.findByName("Priyanshu");
//	 
//	findbyname.forEach(e->{
//		System.out.println(e);
//	});
	 
//	List<User> findbynamecity =  userRepository.findByNameAndCity("Priyanshu", "kolkata");
//	 
//	 findbynamecity.forEach(e->{
//		 System.out.println(e);
//	 });
//	 
	 
	List<User> allUser =  userRepository.getAllUser();
	
	allUser.forEach(e->{
		System.out.println(e);
	});
	
	System.out.println("__________________________________________");

	List<User> nameuser = userRepository.getUserByName("Priyanshu");
	
	nameuser.forEach(e->{
		System.out.println(e);
	});
	
	
	System.out.println("*********************************");
	
	List<User> getbynamecity = userRepository.getUserByNameAndCity("Priyanshu", "kolkata");
	
	getbynamecity.forEach(e->{
		System.out.println(e);
	});
	
	System.out.println("*************");
	
	List<User> allu = userRepository.getAllUser();
	
	allu.forEach(e->{
		System.out.println(e);
	});
	}
	
}

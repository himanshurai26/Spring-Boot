package com.Jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Jpa.Entity.User;



public interface UserRepository extends CrudRepository<User, Integer> {
      public List<User> findByName(String name);
	  public List<User> findByNameAndCity(String name, String city);
	
	  // Excutiing JPQL with spring data jpa
	  
	  @Query("select u from User u")
	  public List<User> getAllUser();

	  //by passing parameters
	  @Query("select u from User u Where u.name= :n")
	  public List<User> getUserByName(@Param("n") String name);

	  @Query("select u from User u Where u.name= :n and u.city= :c")
	  public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);

	  //native query with jpa
	  
	  @Query(value = "select * from user", nativeQuery = true)
	  public List<User> getUsers();

}

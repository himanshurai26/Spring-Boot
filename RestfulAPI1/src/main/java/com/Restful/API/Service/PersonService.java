package com.Restful.API.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Restful.API.Entity.Person;

@Component
public class PersonService {
	
	private static List<Person> list = new ArrayList<>();
	
	static {
		
		  list.add(new Person(23, "Himanshu Kumar", "Male", 22, "New Delhi"));
		  list.add(new Person(34, "Priyanshu Kumar", "Male", 19, "Kolkata"));
		  list.add(new Person(44, "Anjali kumar", "Female", 34, "Odisa")); list.add(new
		  Person(55, "Shashank Dangi", "Male", 25, "Haryana"));
		 
		}
	
	public List<Person> getAllPerson(){
		
		return list;
		
	}
	
	public Person getPersonById(int id){
		
		for(Person person : list) {
			if(person.getId() == id) {
				return person;
			}
			
		}
		return null;
	}
	
	public Person addPerson(Person person) {
		list.add(person);
		
		return person;
	}
	
	
	public void deletePerson(int pid) {
		List<Person> updatedList = new ArrayList<>();
		for(Person person : list) {
			if(person.getId() != pid) {
				updatedList.add(person);
			}
		}
		
		list = updatedList;
	}
	
	public void updatePerson(Person person, int personid) {
		for(Person per : list) {
			if(per.getId() == personid) {
				per.setPersonName(person.getPersonName());
				per.setPerosnCity(person.getPerosnCity());
				per.setPersonGender(person.getPersonGender());
				per.setPersonAge(person.getPersonAge());
			}
		}
	}
}

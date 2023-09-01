package com.Restful.API.Entity;

public class Person {
	private int id;
	private String personName;
	private String personGender;
	private int personAge;
	private String perosnCity;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String personName, String personGender, int personAge, String perosnCity) {
		super();
		this.id = id;
		this.personName = personName;
		this.personGender = personGender;
		this.personAge = personAge;
		this.perosnCity = perosnCity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonGender() {
		return personGender;
	}
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPerosnCity() {
		return perosnCity;
	}
	public void setPerosnCity(String perosnCity) {
		this.perosnCity = perosnCity;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", personGender=" + personGender + ", personAge="
				+ personAge + ", perosnCity=" + perosnCity + "]";
	}
	
	

}

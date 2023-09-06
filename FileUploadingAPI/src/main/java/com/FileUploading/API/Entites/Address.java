package com.FileUploading.API.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AddressId;
	private String street;
	private String State;
	public Address(int addressId, String street, String state) {
		super();
		AddressId = addressId;
		this.street = street;
		State = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [AddressId=" + AddressId + ", street=" + street + ", State=" + State + "]";
	}

	
	

}

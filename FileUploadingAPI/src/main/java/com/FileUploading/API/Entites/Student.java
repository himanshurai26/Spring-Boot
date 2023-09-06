package com.FileUploading.API.Entites;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;
	private int studentRollNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, int studentRollNo, Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNo=" + studentRollNo
				+ ", address=" + address + "]";
	}
	
	

}

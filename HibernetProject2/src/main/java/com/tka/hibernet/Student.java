package com.tka.hibernet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "roll")
	int roll;
	@Column(name = "name")
	String name;
	@Column(name = "marks")
	int marks;

	@OneToOne()
	@JoinColumn(name="roll")
	private Address adress;

	public Address getAdress() {
		return adress;
	}

	public void setAddress(Address adress) {
		this.adress = adress;
	}

	public Student() {
		super();
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", adress=" + adress + "]";
	}

}
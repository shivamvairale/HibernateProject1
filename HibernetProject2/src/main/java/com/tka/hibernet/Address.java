package com.tka.hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int address_id;
	private String city;
	private String state;
	private int roll;
	public Address() {
		super();
		
	}
	public Address(int adress_id, String city, String state, int roll) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.state = state;
		this.roll = roll;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int adress_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", city=" + city + ", state=" + state + ", roll=" + roll + "]";
	}
	
}
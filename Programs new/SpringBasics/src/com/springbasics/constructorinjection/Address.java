package com.springbasics.constructorinjection;

public class Address {

	private String City;
	private String State;
	private int zip;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Address() {
		
	}
	public Address(String city, String state, int zip) {
		super();
		City = city;
		State = state;
		this.zip = zip;
	}
	
}

package com.person;

public class Person {
	private String _firstName;
	private String _lastName;
	
	public Person(String firstName, String lastName) {
		_firstName = firstName;
		_lastName = lastName;
	}
	
	public String getFullName() {
		return _firstName + " " + _lastName;
	}
}

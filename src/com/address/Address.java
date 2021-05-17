package com.address;

public class Address {
	// 1-77 Main St., 1A2 B3D, city, MB, Country
	private String _app = null;
	private String _building;
	private String _street;
	private String _postalCode;
	private String _city;
	private String _provance;
	private String _country;
	
	public Address(String app, String building, String street, 
				   String postalCode, String city, String provance, String country) {
		_app = app;
		_building = building;
		_street = street;
		_postalCode = postalCode;
		_city = city;
		_provance = provance;
		_country = country;
	}
	
	public String getAddress() {
		return (_app == null ? "" : (_app + "-")) + _building + " " + _street + 
				", " + _city + ", " + _provance + " " + _country + " " + _postalCode;
	}
}

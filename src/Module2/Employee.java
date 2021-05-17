package Module2;

import com.address.Address;
import com.person.Person;

public class Employee extends Person {
	
	private Address _address;
	// private Person _person;
	
	public Employee(String firstName, String lastName, Address address) {
		super(firstName, lastName);
		
		_address = address;
	}
	
	public Employee(String firstName, String lastName, String app, String building, String street, 
			   String postalCode, String city, String provance, String country) {
		super(firstName, lastName);
		
		_address = new Address(app, building, street, postalCode, city, provance, country);
	}
	
	public void print() {
		System.out.println( getFullName() + " " + _address.getAddress()  );
	}
}

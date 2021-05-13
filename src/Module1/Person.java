package Module1;

public class Person {
	
	private String _firstName;
	private String _lastName;
	
	public Person() {
		_firstName = "n/a";
		_lastName = "n/a";
	}
	
	public Person(String fisrtName, String lastName) {
		System.err.println("Base class Person ctor called");
		_firstName = fisrtName;
		_lastName = lastName;
	}
	
	public String getName() {
		return _firstName + " " + _lastName;
	}
}

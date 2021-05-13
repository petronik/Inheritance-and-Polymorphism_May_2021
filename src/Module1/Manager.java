package Module1;

public class Manager extends Person {

	public Manager(String firstName, String lastName) {
		super(firstName, lastName);
		System.err.println("Child class Manager ctor called");
	}
}

package Module2;

import com.address.Address;

// import TeamA.Person;
// import TeamB.*;

public class driver {

	public static void main(String[] args) {
		
		com.address.Address add1 = new Address("19", "77", "Main St.", "A1B C2D", "Winniped", "MB", "Canada");
		
		System.out.println(add1.getAddress());
		
		TeamA.Person pA = new TeamA.Person();
		// pA.info();
		
		TeamB.Person pB = new TeamB.Person();
		// pB.info();
	}

}

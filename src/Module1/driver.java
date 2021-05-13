

import java.util.ArrayList;

class Bank {
	private String _name;
	private Worker _boss;
	
	public Bank(String name, String fName, String lName) {
		_name = name;
		_boss = new Worker(fName, lName);
	}
	
	public Bank(String name, Worker boss) {
		_name = name;
		_boss = boss;
	}
	
	
	public String getName() {
		return _name;
	}
}

class Worker {
	private String _fName;
	private String _lName;
	
	public Worker(String fName, String lName) {
		_fName = fName;
		_lName = lName;
	}
	
	public String getFullName() {
		return _fName + " " + _lName; 
	}
}

public class driver {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		
		list.add("CIBC");
		list.add("RBC");
		list.add("Bank of Montreal");
		
		list.set(1, "Mark's bank");
		
		System.out.println(list);
		
		/*
		for(String el : list) {
			System.out.println(el);
		}
		*/
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
		//System.err.println( list.contains("RBC") );
		//System.err.println( list.indexOf("RBC") );
		//System.err.println( list.get( list.indexOf("RBC") == -1 ? 0 : list.indexOf("RBC")));
		
		
		list.remove(list.indexOf("Mark's bank"));
		
		//System.out.println(list);
		
		
		
		
		VoucherManager vm1 = new VoucherManager(1001, 2001);
		
		vm1.add("ddd1", 77, "ddd1", "ddd1");
		vm1.add("ddd2", 44, "ddd2", "ddd2");
		
		vm1.printData();
		
		
		
		
		
		
		
		
		
		
		Bank bank1 = new Bank("CIBC", "Mark", "Doe");
		
		Worker boss = new Worker("John", "Smith");
		
		Bank bank2 = new Bank("ABC Bank", boss);
		
		// CRUD
		// - create - read - update - delete
	}

}

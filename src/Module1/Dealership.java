

import java.util.ArrayList;

public class Dealership {
	
	private String _company;
	private Manager _manager;
	private ArrayList<SalesPerson2> _people = new ArrayList<>();
	private ArrayList<Car3> _cars = new ArrayList<>();
	
	public Dealership(String company, Manager manager) {
		_company = company;
		_manager = manager;
	}
	
	public void addCar(Car3 car) {
		_cars.add(car);
	}
	
	public void addSalesPerson(SalesPerson2 person) {
		_people.add(person);
	}
	
	public void printStatus() {
		System.out.println(_company + " - " + _manager.getName());
		
		for(SalesPerson2 p : _people)
			System.out.println(p.getName());
		
		for(Car3 c : _cars)
			System.out.println(c);
		
	}
}

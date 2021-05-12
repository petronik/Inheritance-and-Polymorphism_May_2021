package Module1;

import java.util.ArrayList;

public class Dealership {
	
	private String _company;
	private Manager _manager;
	private ArrayList<SalesPerson> _people = new ArrayList<>();
	private ArrayList<Car> _cars = new ArrayList<>();
	
	public Dealership(String company, Manager manager) {
		_company = company;
		_manager = manager;
	}
	
	public void addCar(Car car) {
		_cars.add(car);
	}
	
	public void addSalesPerson(SalesPerson person) {
		_people.add(person);
	}
	
	public void printStatus() {
		System.out.println(_company + " - " + _manager.getName());
		
		for(SalesPerson p : _people)
			System.out.println(p.getName());
		
		for(Car c : _cars)
			System.out.println(c);
		
	}
}

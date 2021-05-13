

public class DealershipDriver {

	public static void main(String[] args) {
			
		Manager manager = new Manager("Mark", "Smith");
		
		manager.getName();
		
		SalesPerson2 sp1 = new SalesPerson2("Lucy", "Doe");
		
		sp1.setSales(77);
		sp1.getName();
		
		/*
		Dealership dealership = new Dealership("OK Used cars", manager);
		
		dealership.addSalesPerson( new SalesPerson("Lucy") );
		dealership.addSalesPerson( new SalesPerson("John") );
		dealership.addSalesPerson( new SalesPerson("Mary") );
		
		dealership.addCar(new Car("Honda Accord", Transmission.Auotomatic));
		dealership.addCar(new Car("Honda Civic", Transmission.Manual));
		dealership.addCar(new Car("Honda CR-V", Transmission.SemiAutomatic));
		
		
		dealership.printStatus();
		*/
	}

}

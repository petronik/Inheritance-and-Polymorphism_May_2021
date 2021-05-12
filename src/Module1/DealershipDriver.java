package Module1;

public class DealershipDriver {

	public static void main(String[] args) {
			
		Manager manager = new Manager("Mark the Boss");
		Dealership dealership = new Dealership("OK Used cars", manager);
		
		dealership.addSalesPerson( new SalesPerson("Lucy") );
		dealership.addSalesPerson( new SalesPerson("John") );
		dealership.addSalesPerson( new SalesPerson("Mary") );
		
		dealership.addCar(new Car("Honda Accord", Transmission.Auotomatic));
		dealership.addCar(new Car("Honda Civic", Transmission.Manual));
		dealership.addCar(new Car("Honda CR-V", Transmission.SemiAutomatic));
		
		
		dealership.printStatus();
	}

}

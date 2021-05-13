

public class SalesPerson extends Person {
	
	private double _sales = 0.0;
	
	public SalesPerson(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public SalesPerson(String firstName, String lastName, double sales) {
		super(firstName, lastName);
		_sales = sales;
	}
	
	public void setSales(double value) {
		_sales = value;
	}
	
	public double getSales() {
		return _sales;
	}
}

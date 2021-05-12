package Module1;

public class SalesPerson {
	private String _name;
	private double _sales = 0.0;
	
	public SalesPerson(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setSales(double value) {
		_sales = value;
	}
	
	public double getSales() {
		return _sales;
	}
}

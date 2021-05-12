package Module1;

public class Car {

	private String _make;
	private Transmission _transmission;
	
	public Car(String make, Transmission t) {
		_make = make;
		_transmission = t;
	}
	
	public String getMake() {
		return _make;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return _make + " " + _transmission.name();
	}
}

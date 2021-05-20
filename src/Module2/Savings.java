package Module2;

public class Savings extends BankAccount2{
	
    private double intRate;

    public Savings(double balance, double rate) {
        super(balance);
        intRate = rate;
    }
	@Override
	public void display() {
		System.out.println( "Savings: $" + getBalance() );
		
	}
	
	public void addInterest() {
		deposit( intRate * getBalance() );
	}

}

package Module2;

public abstract class BankAccount {
    
	private double _balance;
    
    public BankAccount() {}
    
    public double getBalance () {
    	return _balance;
    }
    
    public void setBalance( double value ) {
    	_balance = value;
    }
    
    public BankAccount(double balance) {
    	_balance = balance;
    }

    public void deposit(double amount) {
        _balance += amount;
    }

    public void withdraw(double amount) {
    	// check!!!!
    	_balance -= amount;
    }

    public abstract void display();
}

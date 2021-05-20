public abstract class BankAccount2 {
    private double _balance = 0;
    static int count = 1;
    public BankAccount2(){}
    public double getBalance(){
        return _balance;
    }
    public void setBalance(double value) {
        _balance = value;
    }

    public BankAccount2(double balance){
        _balance = balance;

    }
    public void deposit(double amount) {
        if(_balance < 0) _balance = 0;
        _balance += amount;
    }
    public void withdraw(double amount) {
        _balance -= amount;
        if(_balance <= 0) _balance = 0;
    }
    public abstract void dislpay ();
}

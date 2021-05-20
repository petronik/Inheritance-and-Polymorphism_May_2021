

public class Checking2 extends BankAccount2{
    final double SERVICE_FEE = 1;
    public Checking2(double balance) {
        super(balance);
        
    }
    public void writeACheck(double amount) {
        
        withdraw(amount + SERVICE_FEE);
        
    }
    public void dislpay() {
        System.out.println("Checking account #" + count++  + " balance = $"+ getBalance() );
    }
}

public class Savings2 extends BankAccount2{
    private double _intRate;

    public Savings2(double balance, double rate) {
        super(balance);
        _intRate = rate;
    }
    @Override
    public  void dislpay() {
        System.out.println("Savings account balance = $" + getBalance());
    }
    public void addInterest() {
        deposit(_intRate * getBalance());
    }
}

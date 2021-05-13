import javax.swing.JOptionPane;

public class UsedCar extends Car3 {
    private double _miles = 0;
    public UsedCar(double price, double miles){
        super(price);
        _miles = miles;
    }

    public void display() {
        JOptionPane.showMessageDialog(null,
        String.format("price = $%,.2f, mileage = %,.2f", super.getPrice(), _miles));
    }
    public boolean equals(UsedCar obj){
        return super.getPrice() == obj.getPrice() && _miles == obj._miles;
    }
}

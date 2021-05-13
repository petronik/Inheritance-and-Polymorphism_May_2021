import javax.swing.JOptionPane;

public class NewCar extends Car3{

    private String _color;
    public NewCar(double price, String color) {
        super(price);
        _color = color;
    }
    
    public void display() {
        JOptionPane.showMessageDialog(null,
        String.format("price = $%,.2f, color = %s", super.getPrice(), _color));
    }
    public boolean equals (NewCar obj){
        return _color.equals(obj._color) && super.getPrice() == obj.getPrice();
    }
}

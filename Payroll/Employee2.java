import javax.swing.JOptionPane;

public class Employee2 {
    private String _name;
    private String _ssn;
    private int _birthdayMonth ;
    private int _birthdayWeek ;
    

    public Employee2(String name, String ssn, int month, int week ) {
        _name = name;
        _ssn = ssn;
        _birthdayMonth = month;
        _birthdayWeek = week;
        
    }
     public static void load() {
         String name = JOptionPane.showInputDialog(null, "Enter employee name: ");
         String ssn = JOptionPane.showInputDialog(null, "Social Security Number: ");
         int month = Integer.parseInt(JOptionPane.showInputDialog(null,"Birthday month (1 - 12): "));
         int week = Integer.parseInt(JOptionPane.showInputDialog(null,"Birthday bonus week ( 1 - 4): "));
     }
     @Override
     public String  toString(){
        
        return String.format("employee: %s \n social security number : %s \n paycheck: %.2f",
         _name, _ssn, _paycheck);
        
        //JOptionPane.showMessageDialog(null, String.format("employee: %s", _name));

     }
     public double getBonus() {
         return 0;
     }
     
}

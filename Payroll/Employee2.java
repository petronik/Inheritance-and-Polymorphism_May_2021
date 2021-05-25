import java.util.Calendar;
import java.util.Scanner;

public abstract class Employee2 {
    private String _name;
    private String _ssnumber;
    private int _birthdayMonth ;
    private int _birthdayWeek ;

    public static Scanner sn = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    
    public Employee2(){}
    public Employee2(String name, String ssn, int month, int week ) {
        _name = name;
        _ssnumber = ssn;
        _birthdayMonth = month;
        _birthdayWeek = week;
        
    }
    
    public void load() {
        System.out.print("Enter employee name: ");
        _name = sn.nextLine();
        //System.out.println(" ");
        System.out.print("Social Security Number: ");
        _ssnumber = sn.nextLine();
        
        System.out.print("Birthday month (1 - 12): ");
        _birthdayMonth = Integer.parseInt(sn.nextLine());
        System.out.print("Birthday bonus week ( 1 - 4): ");
        _birthdayWeek = Integer.parseInt(sn.nextLine());
    }
    @Override
    public String  toString(){
        return  String.format("employee: %s \nsocial security number : %s \npaycheck: %.2f",
        _name, _ssnumber, getEarnings());
    }
    public double getBonus() {
        if(_birthdayMonth == cal.get(Calendar.MONTH) + 1 &&
            _birthdayWeek == cal.get(Calendar.WEEK_OF_MONTH)) return 100.00;
        return 0.00;
    }
    public abstract double getEarnings();
    
}

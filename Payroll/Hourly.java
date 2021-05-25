public class Hourly  extends Employee2{
    private double _hourlyPay;
    private double _workedHours;

    public Hourly(){}

    public Hourly(String name, String ssn, int month, int week, double hourlyPay, double workedHours) {
        super(name, ssn, month, week);
        _hourlyPay = hourlyPay;
        _workedHours = workedHours;
    }
    
    public  void load() {
        super.load();
        System.out.print("Hourly pay: ");
        _hourlyPay = Double.parseDouble(Employee2.sn.nextLine());
        System.out.print("Hours worked this past week: ");
        _workedHours  = Double.parseDouble(Employee2.sn.nextLine());
        getEarnings();
    }
    @Override
    public double getEarnings() {
        double payment = _hourlyPay * _workedHours + getBonus();
        return payment;
    }
}

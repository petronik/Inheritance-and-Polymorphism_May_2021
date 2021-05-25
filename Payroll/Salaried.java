
public class Salaried extends Employee2{
    
    private double _weeklySalary;
    private double _baseSalary;

    public Salaried(){}
    public Salaried(String name, String ssn, int month, int week, double weeklySalary) {
        super(name, ssn, month, week);
        _weeklySalary = weeklySalary;
    }
    public void load(){
        super.load();
        System.out.print("Salary: ");
        _weeklySalary = Double.parseDouble(Employee2.sn.nextLine());
            
    }
    public double getEarnings(){
        _baseSalary = _weeklySalary + getBonus();
        return _baseSalary;
    }

}

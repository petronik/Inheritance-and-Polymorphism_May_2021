public class SalariedPlusComition extends Salaried {
    private double _salesPastWeek;
    private double _comission;

    public SalariedPlusComition(){}
    public SalariedPlusComition(String name, String ssn, int month, int week, 
                            double weeklySalary, double salesPastWeek, double comission) {
        super(name, ssn, month, week, weeklySalary);
        _salesPastWeek = salesPastWeek;
        _comission = comission;
    }
    public void load(){
        super.load();
        System.out.print("Sales for this past week: ");
        _salesPastWeek = Double.parseDouble(Employee2.sn.nextLine());
        System.out.print("Sales commission rate (fraction paid to employee)");
        _comission = Double.parseDouble(Employee2.sn.nextLine());
    }
    public double  getEarnings(){
        double payment = (_salesPastWeek * _comission) + super.getEarnings();
        return payment;
    }
        
    




}

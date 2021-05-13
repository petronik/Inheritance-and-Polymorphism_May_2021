public class DealershipDriver2 {
    public static void main(String[] args) {
        Manager2 ryne = new Manager2("Ryne Mendez");
        SalesPerson2 nicole = new SalesPerson2("Nicole Betz");
        SalesPerson2 vince = new SalesPerson2("Vince Sola");
        Dealership2 dealership = new Dealership2("OK Used Cars", ryne);

        dealership.addPerson(nicole);
        dealership.addPerson(vince);
        dealership.addCar(new Car2("GMC"));
        dealership.addCar(new Car2("Yugo"));
        dealership.addCar(new Car2("Dodge"));
        dealership.printStatus();
        
    }
}

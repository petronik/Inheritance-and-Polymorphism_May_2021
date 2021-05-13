import java.util.ArrayList;

public class Dealership2{
    private String company;
    private Manager2 manager;
    private ArrayList<SalesPerson2> people = new ArrayList<>();
    private ArrayList<Car2> cars = new ArrayList<>();

    public Dealership2(String company, Manager2 ryne){
        this.company = company;
        this.manager = ryne;
    }
    public void addCar( Car2 car) {
        cars.add(car);
    }
    public void addPerson(SalesPerson2 person) {
        people.add(person);
    }
    public void printStatus() {
        System.out.println(company + "\t" + manager.getName());
        for(SalesPerson2 person : people)
        System.out.println(person.getName());
        for(Car2 car : cars)
        System.out.println(car.getMake());
    }
}
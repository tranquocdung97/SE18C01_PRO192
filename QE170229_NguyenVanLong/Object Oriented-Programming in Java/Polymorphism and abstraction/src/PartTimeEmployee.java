
public class PartTimeEmployee extends Employee2 {

    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}

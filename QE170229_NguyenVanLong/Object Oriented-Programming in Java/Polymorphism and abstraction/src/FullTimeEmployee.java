
public class FullTimeEmployee extends Employee2 {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }
}

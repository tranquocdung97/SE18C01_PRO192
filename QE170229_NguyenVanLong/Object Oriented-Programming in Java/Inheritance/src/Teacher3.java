
public class Teacher3 extends Person3 {

    private int salary;

    public Teacher3(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

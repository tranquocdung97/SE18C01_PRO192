package QE180149_DuongThao.OOP.BT23;

public class Manager extends Employee {

    private int Bonus;

    public Manager(int Bonus, String name, int salary) {
        super(name, salary);
        this.Bonus = Bonus;
    }

    public int getSalary() {
        return super.getSalary() + Bonus;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}

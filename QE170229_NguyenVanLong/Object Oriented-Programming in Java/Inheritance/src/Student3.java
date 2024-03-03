
public class Student3 extends Person3 {

    private double gpa;

    public Student3(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }
}

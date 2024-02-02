package QE180149_DuongThao.OOP.BT22;

public class Student extends Person {

    private double GPA;

    public Student(double GPA, String name, int age, String adress) {
        super(name, age, adress);
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + GPA);
    }
}

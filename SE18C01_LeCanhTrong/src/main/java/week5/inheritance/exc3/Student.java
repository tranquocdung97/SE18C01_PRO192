
package week5.inheritance.exc3;


class Student extends Person {
	private double gpa;

	public Student(String name, int dob, double gpa) {
		// Goi toi constructor 2 tham so cua lop cha
		super(name, dob);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}

public class bt13 {
	private String name;
	private char gender;

	public bt13() {
		name = "Unknown";
		gender = 'u';
	}

	public bt13(String name) {
		this.name = name;
		this.gender = 'u';
	}

	public bt13(char gender) {
		this.name = "Unknown";
		this.gender = gender;
	}

	public bt13(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public void display() {
		System.out.println("Name: " + name);
		if (gender == 'u') {
			System.out.println("Gender: Unknown");
		}
		if (gender == 'm') {
			System.out.println("Gender: Male");
		}
		if (gender == 'f') {
			System.out.println("Gender: Female");
		}
	}
}
class entry  {
    public static void main(String[] args) {
		bt13 s1 = new bt13();
		s1.display();
		bt13 s2 = new bt13("Quang");
		s2.display();
		bt13 s3 = new bt13('m');
		s3.display();
		bt13 s4 = new bt13("Thu", 'f');
		s4.display();
	}
}

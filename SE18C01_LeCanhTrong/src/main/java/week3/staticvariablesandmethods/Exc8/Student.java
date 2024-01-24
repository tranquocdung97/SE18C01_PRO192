/*
Bạn hãy tạo ra lớp Student với thông tin giống như sau:



Giải thích:

name và gender là hai thuộc tính private của lớp Student.
Student() là phương thức khởi tạo không tham số dùng để khởi tạo giá trị cho name = "Unknown", gender = 'u'
Student(name: String) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính name và gender (this.name = name; gender = 'u').
Student(gender: char) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính gender và name (this.gender = gender, name = "Unknown").
Student(name: String, gender: char) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính name và gender.
display() là phương thức dùng để hiển thị thông tin của đối tượng ra màn hình. Nếu gender = 'm' thì hiển thị ra màn hình "Gender: Male", nếu gender = 'f' thì hiển thị ra màn hình "Gender: Female", nếu gender = 'u' thì hiển thị ra màn hình "Gender: Unknown". Ví dụ:
Nếu name = "Thu", gender = 'f' thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Thu
Gender: Female​
Nếu name = "Sang", gender = 'u' thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Sang
Gender: Unknown
Nếu name = "Unknown", gender = 'u' thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Unknown
Gender: Unknown​
Chương trình để test lớp Student:

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student("Quang");
		s2.display();
		Student s3 = new Student('m');
		s3.display();
		Student s4 = new Student("Thu", 'f');
		s4.display();
	}
}
Kết quả khi chạy chương trình:

Name: Unknown
Gender: Unknown
Name: Quang
Gender: Unknown
Name: Unknown
Gender: Male
Name: Thu
Gender: Female
 */
package week3.staticvariablesandmethods.Exc8;


public class Student {
	private String name;
	private char gender;

	public Student() {
		name = "Unknown";
		gender = 'u';
	}

	public Student(String name) {
		this.name = name;
		this.gender = 'u';
	}

	public Student(char gender) {
		this.name = "Unknown";
		this.gender = gender;
	}

	public Student(String name, char gender) {
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

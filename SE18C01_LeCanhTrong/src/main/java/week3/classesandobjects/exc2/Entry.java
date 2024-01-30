/*
Bạn hãy viết chương trình khai báo lớp Student với thông tin giống như sau:



Giải thích: hình trên là mô tả của lớp Student với các thuộc tính và phương thức giống như sau:

name và age là hai thuộc tính dùng để lưu trữ tên và tuổi của đối tượng học sinh.
display() là phương thức dùng để hiển thị thông tin của đối tượng ra màn hình. Ví dụ, nếu đối tượng có thuộc tính name = "An", age = 24 thì khi gọi phương thức display() thì màn hình sẽ hiển thị ra:
Name: An
Age: 24
getInformation() là phương thức dùng để nhập dữ liệu cho thuộc tính name và age từ bàn phím. Ví dụ nếu bạn dùng phương thức này để nhập thông tin cho một đối tượng học sinh với name = "Kien", age = 28 như bên dưới:
Kien
28​
thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Kien
Age: 28
 */
package week3.classesandobjects.exc2;

import java.util.Scanner;

class Student{
	String name;
	int age;
	public void getInformation() {
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		age = sc.nextInt();
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}


public class Entry {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}

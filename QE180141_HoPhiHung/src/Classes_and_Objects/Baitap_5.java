/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects;

/**
 *
 * @author Ho Phi Hung
 */

    

class Student {
	private final String name;
	private final int age;
        
	public Student() {
		name = "Tuan";
		age = 24;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
public class Baitap_5 {
//public class Entry {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}
}
/*
constructor là một phương thức đặc biệt,
phương thức này sẽ tự động được gọi khi bạn khởi tạo một đối tượng 
(với các phương thức thông thường thì bạn cần dùng toán tử "." để gọi tới)
Constructor có đặc điểm là không được định nghĩa kiểu trả về và có tên trùng với tên lớp.

Lưu ý: Nếu bạn dùng từ khóa private để khai báo constructor 
thì bạn sẽ không thể khởi tạo được đối tượng của lớp này.
Ví dụ chương trình sau sẽ báo lỗi do lớp Student có constructor là private:
*/
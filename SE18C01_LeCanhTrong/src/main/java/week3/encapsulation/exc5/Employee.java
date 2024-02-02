/*
Bạn hãy tạo ra lớp Employee trong file Employee.java với các thông tin giống như sau:



Giải thích:

id, firstName, lastName, salary là các thuộc tính chỉ mã, tên, họ, tiền lương của đối tượng nhân viên.
Employee(id: int, firstName: String, lastName: String, salary: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
getFullName() là phương thức trả về firstName + lastName.
Các phương thức còn lại là các setter và getter.
Chương trình để test lớp Employee trên:

class Entry {
	public static void main(String[] args) {
		Employee e = new Employee(1, "Kien", "Hoang", 1000);
		System.out.println("Id: " + e.getId());
		System.out.println("Name: " + e.getFullName());
		System.out.println("Salary: " + e.getSalary());
	}
}
Kết quả khi chạy chương trình:

Id: 1
Name: Kien Hoang
Salary: 1000
 */
package week3.encapsulation.exc5;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
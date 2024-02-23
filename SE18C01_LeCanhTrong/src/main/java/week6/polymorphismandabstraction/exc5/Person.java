/*
Bài tập
Bạn hãy tạo ra 3 lớp Person, Employee và Customer với thông tin giống như sau:


Lớp Person

Person là lớp trừ tượng dùng để lưu thông tin chung về đối tượng con người.
name và address là 2 thuộc tính private chỉ tên và địa chỉ của đối tượng.
Person(name: String, address: String) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức trừu tượng dùng để hiển thị thông tin của đối tượng.
Lớp Employee

Employee là lớp kế thừa từ lớp trừu tượng Person
salary là thuộc tính lưu thông tin về tiền lương của nhân viên.
Employee(name: String, address: String, salary: int) là phương thức khởi tạo dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức ghi đè từ lớp trừu tượng, phương thức này dùng để hiển thị thông tin nhân viên ra màn hình. Ví dụ nếu name = "Trung", address = "HN", salary = 3300 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Employee name: Trung
Employee address: HN
Employee salary: 3300​
Lớp Customer

Customer là lớp kế thừa từ lớp trừu tượng Person.
balance là thuộc tính lưu thông tin về số dư trong tài khoản của khách hàng.
Customer(name: String, address: String, balance: int) là phương thức khởi tạo dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức ghi đè từ lớp trừu tượng, phương thức này dùng để hiển thị thông tin nhân viên ra màn hình. Ví dụ nếu name = "Linh", address = "BN", balance = 10400 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Customer name: Linh
Customer address: BN
Customer balance: 10400
Lưu ý: Trong sơ đồ lớp thì nếu tên một lớp được in nghiêng thì đó là lớp trừ tượng, nếu tên phương thức được in nghiêng thì đó là phương thức trừu tượng.

Kết quả khi chạy chương trình:

Employee name: Trung
Employee address: HN
Employee salary: 3300
Customer name: Linh
Customer address: BN
Customer balance: 10400

link for reference: https://codelearn.io/learning/object-oriented-programming-in-java?activityType=12&activityId=1040
 */
package week6.polymorphismandabstraction.exc5;


public abstract class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public abstract void display();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

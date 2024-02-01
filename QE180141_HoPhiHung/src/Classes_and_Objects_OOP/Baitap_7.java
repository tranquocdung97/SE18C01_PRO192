/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects_OOP;

/**
 *
 * @author Ho Phi Hung
 */

    

class Customer{
        String name;
	public Customer() {
		
	}
	public Customer(String name) {
	}
}

public class Baitap_7{
//public class Entry {
	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("Welcome to Codelearn!");
	}
}

/*
Nếu một lớp đã được khai báo constructor -> chương trình sẽ không tự sinh ra constructor mặc định  
(constructor mặc định là constructor không tham số).

Có thể thấy lớp Customer đã được khai báo constructor và 
đây lại là constructor có tham số nên trong phương thức main()
bạn không thể khởi tạo được đối tượng thuộc lớp customer
(do trong phương thức main() 
bạn gọi tới constructor không tham số nhưng trong lớp Customer lại không có constructor này).
Với đoạn code trên chương trình sẽ báo lỗi như sau:
*/
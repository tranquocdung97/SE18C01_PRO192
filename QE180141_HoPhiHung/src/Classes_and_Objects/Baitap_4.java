/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects;

/**
 *
 * @author Ho Phi Hung
 */public class Baitap_4 {
//public class Entry {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Codelearn";
		s.display();
	}
}
class Student {
	String name;
	/*pravite la sai vi phuong thuc trong display trong lop Student dc khai bao voi 
        pravite ko the truy xuat phuong thuc main trong lop Entry(baitap_4)*   */
        public void display() {
		System.out.println("Name: " + name);
	}}

/*
private < default  <  protected < public. 
khi muốn sử dụng một lớp từ package khác thì bạn cần import lớp này vào bằng câu lệnh
import <tên_package>.<tên_lớp>; 

*/
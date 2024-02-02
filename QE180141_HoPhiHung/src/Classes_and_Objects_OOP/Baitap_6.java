/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects_OOP;

/**
 *
 * @author Ho Phi Hung
 */

class Student {
    String name ; 
    int age ; 

    public  Student (String name , int age ) {
        this.name = name ;//su dung this vi trung ten tham so dau vao 
        this.age  = age  ; 
    } 
    public void display () {
        System.out.println("Name: " + name + "\n" +"Age: " +  age );
    }
}
public class Baitap_6 {
    //public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student("Long", 24);
		Student s2 = new Student("Kien", 29);
		s1.display();
		s2.display();
	}
}
/*

Constructor (phương thức khởi tạo) 
-2 loại là 
+ constructor không tham số 
+ constructor có tham số.

Một constructor -> tham số truyền vào -> constructor có tham số

Lưu ý: nếu tên tham số đầu vào -> trùng với tên thuộc tính của lớp 
thì bạn có thể truy xuất tới thuộc tính của lớp = từ khóa this và toán tử . 
*/
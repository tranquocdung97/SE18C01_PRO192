/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects_OOP;

/**
 *
 * @author Ho Phi Hung
 */
class Student {         //class

    String name;   //attribute
    int age;       //attribute

    public void display() {
        System.out.println("Name: " + name); //method
        System.out.println("Age: " + age);   //method
    }
}

public class Baitap_1_ {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Linh";  //object 
        student1.age = 24;       //object 
        student1.display();
    }
}





/*
1. Lớp (class) là nơi định nghĩa thông tin về các đối tượng 
=  một kiểu dữ liệu mà biến của kiểu dữ liệu
= một đối tượng. 
Như trong ví dụ trên thì Student là lớp dùng để mô tả thông tin về các đối tượng học sinh.
Ví dụ về lớp: Học sinh, giáo viên, xe ô tô, …

2. Đối tượng (object) là một thể hiện của lớp
=  là một biến. 
Như trong ví dụ trên thì biến student1 là một đối tượng đại diện cho thông tin của một học sinh.

3. Thuộc tính (attribute): là các đặc điểm của đối tượng,
như trong ví dụ trên thì name và age là hai thuộc tính của đối tượng học sinh.
Ví dụ về thuộc tính: tên, tuổi, chiều cao, cân nặng, năm sinh, ...

4. Phương thức (method): là hành vi (hành động) của đối tượng, 
như ví dụ trên thì display() là một phương thức dùng để giới thiệu bản thân của học sinh.
Ví dụ về phương thức: giới thiệu bản thân, học bài, chạy, ...
*/

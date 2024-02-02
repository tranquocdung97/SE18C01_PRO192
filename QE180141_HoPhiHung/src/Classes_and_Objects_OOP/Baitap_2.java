/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects_OOP;

/**
 *
 * @author Ho Phi Hung
 */    import java.util.Scanner;


//Ở bài này bạn sẽ biết cách định nghĩa ra một lớp và sử dụng các đối tượng thuộc lớp này.
class Student{
//    class <tên_lớp> {
//	// Khai báo danh sách các thuộc tính
//	<kiểu_dữ_liệu> <tên_thuộc_tính>;
    String name ; 
    int Age ; 
    // Khai báo danh sách các phương thức
     //	public <kiểu_trả_về> <tên_phương_thức>(<kiểu_tham_số> <tên_tham_số>, ...) {
    public void getInformation(){    
        Scanner sc = new Scanner(System.in);
         name = sc.next(); 
         Age = sc.nextInt();
    }
    void display(){
        System.out.println( "Name: "+ name);
         System.out.println("Age: " + Age);
    }
}

public class Baitap_2 {
//public class Entry {
	public static void main(String[]args) {
            // Khai báo đối tượng s1 thuộc lớp Student
            //Để truy xuất tới các thuộc tính và phương thức của một đối tượng bạn dùng toán tử ".":
            // Gán giá trị cho thuộc tính name của đối tượng s1
            // Gọi tới phương thức display của đối tượng s1
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}




